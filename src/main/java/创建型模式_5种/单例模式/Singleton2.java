package 创建型模式_5种.单例模式;

/**
 * 饿汉式单例类
 * 在类初始化时，已经自行实例化，不管用不用都会占用内存
 * @author sk
 */
public class Singleton2 {

  /** 将自身构造函数设为私有禁止外部创建,在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问 */
  private Singleton2() {}

  /** 初始化时直接创建对象 */
  private static final Singleton2 singleton  = new Singleton2();
  public static final Singleton2 getInstance() {
    System.out.println("获取到单例对象Singleton2");
    return singleton;
  }
}