package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * 手机测试类
 * @author sk
 */
public class PhoneTest {

  public static void main(String[] args) {
    // 创建苹果手机
    Store store = new Store(new ApplePhoneFactory());
    // 补充手机
    store.createPhone();
  }
}
