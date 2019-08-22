package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  手机桥接类
 * @author sk
 */
public class Store {

  /** 手机工厂 */
  private PhoneFactory phoneFactory;

  /** 设置手机 */
  public Store(PhoneFactory phoneFactory) {
    this.phoneFactory = phoneFactory;
  }

  /** 创建手机 */
  public Phone createPhone() {
    return phoneFactory.createPhone();
  }
}
