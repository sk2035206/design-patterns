package 结构型模式_7种.代理模式.动态代理模式;

import 结构型模式_7种.代理模式.People;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 调度处理类，动态代理对象创建时候使用
 * @author sk
 *
 * 该接口中仅定义了一个方法
 * Object：invoke(Object obj,Method method,Object[] args）。在实际使用时，
 * 第一个参数obj一般是指代理对象，method是被代理的方法，args为该方法的参数数组。这个抽象方法在代理类中动态实现。
 */
public class MyInvocationHandler implements InvocationHandler {

  /** 代理实例*/
  private Object target;

  public MyInvocationHandler(Object target) {
    this.target = target;
  }

  /**
   * 为指定类装载器、一组接口及调用处理器生成动态代理类实例
   * @param <T> 代理类实例
   * @return
   */
  public <T> T getProxy() {
    // 第一个参数为代理类的类装载器，第二个参数为代理类的所有接口，第三个参数为指定代理类装载器
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) {
    System.out.println("---------------开始代理---------------");
    Object result = null;
    if (method.getName().equalsIgnoreCase("buyMyCar")) {
      People people = (People) target;
      // 判断是否为vip，是则可以直接买车,否则判断余额是否足够买车
      if (people.getVip() == null && people.getMoney() >= 50000) {
        System.out.println(people.getUsername() + "买了新车，交易结束！");
        System.out.println("---------------代理结束---------------");
        return result;
      } else if (people.getVip() == null && people.getMoney() <= 50000) {
        System.out.println(people.getUsername() + "钱不够，不能买车，继续挣钱！");
        System.out.println("---------------代理结束---------------");
        return result;
      }
    }
    try {
      result = method.invoke(target, args);
    } catch (IllegalAccessException e) {
      System.err.println("无访问权限");
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      System.err.println("非法参数异常");
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      System.err.println("此处接收被调用方法内部未被捕获的异常");
      e.printStackTrace();
    }
    System.out.println("---------------代理结束---------------");
    return result;
  }
}
