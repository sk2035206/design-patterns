package 创建型模式_5种.单例模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例类 （现在基本可以忽略）
 * 类似Spring里面的方法，将类名注册，下次从里面直接获取。
 * @author sk
 */
public class Singleton3 {

  private static Map<String,Singleton3> map = new HashMap<>();

  static{
    Singleton3 singleton = new Singleton3();
    map.put(singleton.getClass().getName(), singleton);
  }

  /** 将自身构造函数设为私有禁止外部创建,在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问 */
  private Singleton3(){}

  /** 静态工厂方法,返还此类惟一的实例 */
  public static Singleton3 getInstance() {
      String name = Singleton3.class.getName();
    if(map.get(name) == null) {
      try {
        map.put(name, (Singleton3) Class.forName(name).newInstance());
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
    System.out.println("获取到单例对象Singleton3");
    return map.get(name);
  }

}