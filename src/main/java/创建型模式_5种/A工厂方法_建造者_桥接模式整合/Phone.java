package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;



/**
 * 手机类
 * @author sk
 */
public class Phone {

  /** 充电模块 */
  private Charger charger;
  /** 解锁模块 */
  private Locker locker;
  /** 相机模块 */
  private Camera camera;

  public void setCharger(Charger charger) {
    this.charger = charger;
  }

  public void setLocker(Locker locker) {
    this.locker = locker;
  }

  public void setCamera(Camera camera) {
    this.camera = camera;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "charger=" + charger +
        ", locker=" + locker +
        ", camera=" + camera +
        '}';
  }
}
