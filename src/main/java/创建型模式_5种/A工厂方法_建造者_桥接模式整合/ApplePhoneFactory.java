package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  苹果手机工厂
 * @author sk
 */
public class ApplePhoneFactory implements PhoneFactory {

  /** 手机建造 */
  private PhoneDirector director = new PhoneDirector();

  @Override
  public Phone createPhone() {
    ApplePhoneBuilder builder = new ApplePhoneBuilder();
    return director.construct(builder);
  }
}
