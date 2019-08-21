package 创建型模式_5种.建造者模式;

/**
 *  汽车建造类
 * @author sk
 */
public interface CarBuilder {


  /** 建造车架 */
  void buildFrame();
  /** 建造轮胎 */
  void buildTyre();

  /** 建造发动机 */
  void buildEngine();

  /** 建造汽车 */
  Car buildCar();
}
