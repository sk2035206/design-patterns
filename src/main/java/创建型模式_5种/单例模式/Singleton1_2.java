package 创建型模式_5种.单例模式;

/**
 * 懒汉式单例静态内部类
 * 既实现了线程安全，又避免了同步带来的性能影响。
 * @author sk
 */
public class Singleton1_2 {

  /** 将自身构造函数设为私有禁止外部创建,在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问 */
  private Singleton1_2() {}

  /** 初始化时直接创建对象 */
  private static class LazyHolder {
    private static final Singleton1_2 INSTANCE = new Singleton1_2();
  }
  public static final Singleton1_2 getInstance() {
    System.out.println("获取到单例对象Singleton1_2");
    return LazyHolder.INSTANCE;
  }
}