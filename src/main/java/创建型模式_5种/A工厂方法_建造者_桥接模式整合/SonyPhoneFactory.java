package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * 索尼手机工厂
 * @author sk
 */
public class SonyPhoneFactory implements PhoneFactory {

  /** 手机建造 */
  private PhoneDirector director = new PhoneDirector();

  @Override
  public Phone createPhone() {
    SonyPhoneBuilder builder = new SonyPhoneBuilder();
    return director.construct(builder);
  }
}
