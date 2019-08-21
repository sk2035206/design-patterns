package 创建型模式_5种.建造者模式;

import java.io.Serializable;

/**
 *
 * @author sk
 */
public class Car implements Serializable {

  private static final long serialVersionUID = -6339419221288448831L;

  public Car(){
    System.out.println("开始生产汽车!");
  }

  /** 轮胎 */
  private String tyre;

  /** 发动机 */
  private String engine;

  /** 车架 */
  private String frame;

  public String getTyre() {
    return tyre;
  }

  public void setTyre(String tyre) {
    this.tyre = tyre;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getFrame() {
    return frame;
  }

  public void setFrame(String frame) {
    this.frame = frame;
  }

  @Override
  public String toString() {
    return "Car{" +
        "tyre='" + tyre + '\'' +
        ", engine='" + engine + '\'' +
        ", frame='" + frame + '\'' +
        '}';
  }
}
