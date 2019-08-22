package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * Vivo手机
 * @author sk
 */
public class VivoPhoneBuilder implements PhoneBuilder {

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
    Locker faceLocker = new FaceLocker();
    faceLocker.unlock();
    phone.setLocker(faceLocker);
  }

  /** 单独添加相机模块时无需改动原有代码，具有良好的扩展性*/
  public void buildCamera() {
    Camera doubleShotCamera = new DoubleShotCamera();
    doubleShotCamera.createModuel();
    phone.setCamera(doubleShotCamera);
  }

  @Override
  public Phone getResult() {
    return phone;
  }
}