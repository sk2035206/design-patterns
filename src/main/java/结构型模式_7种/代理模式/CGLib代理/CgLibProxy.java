package 结构型模式_7种.代理模式.CGLib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import 结构型模式_7种.代理模式.People;

import java.lang.reflect.Method;

/**
 *
 * @author sk
 * 实现CGlib需要实现MethodInterceptor接口，用于代理方法的回调
 */
public class CgLibProxy implements MethodInterceptor {

  /** 代理实例*/
  private Object target;

  /**
   * @param target 代理对象实例
   * 设置代理实例
   */
  public CgLibProxy(Object target) {
    this.target = target;
  }

  /**
   * 为指定类装载器、一组接口及调用处理器生成动态代理类实例
   * @param <T> 代理类实例
   * @return
   */
  public  <T> T getProxy() {
    // 创建Enhancer对象
    Enhancer enhancer = new Enhancer();
    // 设置代理的目标类
    enhancer.setSuperclass(People.class);
    // 设置回调方法, this代表是当前类, 因为当前类实现了CallBack
    enhancer.setCallback(this);
    return (T) enhancer.create();
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
    System.out.println("\n---------------开始CGLib代理---------------");
    Object result = null;
    if (method.getName().equalsIgnoreCase("buyMyCar")) {
      People people = (People) target;
      // 判断是否为vip，是则可以直接买车,否则判断余额是否足够买车
      if (people.getVip() == null && people.getMoney() >= 50000) {
        System.out.println(people.getUsername() + "买了新车，交易结束！");
        System.out.println("---------------CGLib代理结束---------------\n");
        return result;
      } else if (people.getVip() == null && people.getMoney() <= 50000) {
        System.out.println(people.getUsername() + "钱不够，不能买车，继续挣钱！");
        System.out.println("---------------CGLib代理结束---------------\n");
        return result;
      }
    }
    System.out.println("---------------JDK动态代理结束---------------\n");
    result = method.invoke(target, objects);
    return result;
  }
}
