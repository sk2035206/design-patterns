package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  索尼手机
 * @author sk
 */
public class SonyPhoneBuilder implements PhoneBuilder {

  /** 手机对象*/
  private Phone phone = new Phone();

  @Override
  public void buildCharger() {
    Charger quickCharger =  new QuickCharger();
    quickCharger.charge();
    phone.setCharger(quickCharger);
  }

  @Override
  public void buildLocker() {
    Locker faceLocker = new FaceLocker();
    faceLocker.unlock();
    phone.setLocker(faceLocker);
  }

  @Override
  public Phone getResult() {
    return phone;
  }
}
