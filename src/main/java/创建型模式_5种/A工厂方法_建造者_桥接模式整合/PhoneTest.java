package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * 手机测试类
 * @author sk
 */
public class PhoneTest {

  public static void main(String[] args) {
    // 实例化手机对象
    Store store = new Store(new ApplePhoneFactory());
    // 创建手机
    Phone phone = store.createPhone();
    System.out.println("创建" + phone + "手机完成");
  }
}
