package 创建型模式_5种.单例模式;

/**
 * 懒汉式单例类.在第一次调用的时候实例化自己，性能略于饿汉
 * @author sk
 */
public class Singleton1_1 {

  String name = null;

  /** 将自身构造函数设为私有禁止外部创建,在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问 */
  private Singleton1_1() {}
  /** 声明单例对象 */
  private static volatile Singleton1_1 singleton = null;

  /** 获取单例对象 */
  public static Singleton1_1 getInstance() {
    // 双重锁机制，保证线程安全
    if (singleton == null) {
      synchronized (Singleton1_1.class) {
        if (singleton == null) {
          singleton = new Singleton1_1();
        }
      }
    }
    System.out.println("获取到单例对象Singleton1_1");
    return singleton;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printInfo() {
    System.out.println("the name is " + name);
  }
}