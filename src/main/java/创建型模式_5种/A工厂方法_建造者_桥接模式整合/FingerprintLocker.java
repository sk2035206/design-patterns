package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  指纹解锁模块
 * @author sk
 */
public class FingerprintLocker implements Locker {

  @Override
  public void unlock() {
    System.out.println("指纹解锁");
  }

  @Override
  public String toString() {
    return "指纹解锁";
  }
}
