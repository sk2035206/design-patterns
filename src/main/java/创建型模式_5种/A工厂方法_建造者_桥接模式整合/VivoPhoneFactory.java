package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * vivo手机工厂
 * @author sk
 */
public class VivoPhoneFactory implements PhoneFactory {

  /** 手机建造 */
  private PhoneDirector director = new PhoneDirector();

  @Override
  public Phone createPhone() {
    VivoPhoneBuilder builder = new VivoPhoneBuilder();
    Phone phone = director.construct(builder);
    builder.buildCamera();
    return phone;
  }
}