package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * 苹果手机
 * @author sk
 */
public class ApplePhoneBuilder implements PhoneBuilder {

  /** 手机对象*/
  private Phone phone = new Phone();

  @Override
  public void buildCharger() {
    Charger simpleCharger =  new SimpleCharger();
    simpleCharger.charge();
    phone.setCharger(simpleCharger);
  }

  @Override
  public void buildLocker() {
    Locker fingerprintLocker = new FingerprintLocker();
    fingerprintLocker.unlock();
    phone.setLocker(fingerprintLocker);
    phone.setLocker(new FingerprintLocker());
  }

  @Override
  public Phone getResult() {
    return phone;
  }
}