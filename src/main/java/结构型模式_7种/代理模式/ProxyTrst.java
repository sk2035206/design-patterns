package 结构型模式_7种.代理模式;

import 结构型模式_7种.代理模式.CGLib代理.CgLibProxy;
import 结构型模式_7种.代理模式.动态代理模式.MyInvocationHandler;
import 结构型模式_7种.代理模式.静态代理模式.PeopleProxy;

/**
 * 代理测试类
 * @author sk
 *
 * 代理也称“委托”，分为静态代理和动态代理，代理模式也是常用的设计模式之一，具有方法增强、高扩展性的设计优势。
 * 代理类可以实现拦截方法，修改原方法的参数和返回值，满足了代理自身需求和目的，也就是是代理的方法增强性。
 * 优点：良好的扩展性。修改被代理角色并不影响调用者使用代理，对于调用者，被代理角色是透明的。
 *       隔离，降低耦合度。代理角色协调调用者和被代理角色，被代理角色只需实现本身关心的业务，非自己本职的业务通过代理处理和隔离。
 * 缺点：增加了代理类，实现需要经过代理，因此请求速度会变慢
 */
public class ProxyTrst {
  public static void main(String[] args) {

    // 用户张三
    People people1 = new People();
    people1.setUsername("张三");
    people1.setMoney(60000.00);
    PeopleProxy proxy = new PeopleProxy(people1);
    proxy.buyMyCar();
    // 用户李四
    People people2 = new People();
    people2.setUsername("李四");
    people2.setVip(true);
    proxy = new PeopleProxy(people2);
    proxy.buyMyCar();
    // 动态代理用户王五
    People people3 = new People();
    people3.setUsername("王五");
    people3.setVip(true);
    MyInvocationHandler dph = new MyInvocationHandler(people3);
    BuyCar buyCar = dph.getProxy();
    buyCar.buyMyCar();
    // 动态代理用户赵六
    People people4 = new People();
    people4.setUsername("赵六");
    people4.setMoney(30000.00);
    dph = new MyInvocationHandler(people4);
    buyCar = dph.getProxy();
    buyCar.buyMyCar();
    // CgLib代理用户小明
    People people5 = new People();
    people5.setUsername("小明");
    people5.setVip(true);
    CgLibProxy cgLibProxy = new CgLibProxy(people5);
    buyCar = cgLibProxy.getProxy();
    buyCar.buyMyCar();
    // CgLib代理用户小红
    People people6 = new People();
    people6.setUsername("小红");
    people6.setMoney(30000.00);
    cgLibProxy = new CgLibProxy(people6);
    buyCar = cgLibProxy.getProxy();
    buyCar.buyMyCar();

  }
}
