package 创建型模式_5种.建造者模式;

/**
 *  建造者模式
 *  将一个复杂的对象的构建与它的表示分离
 * @author sk
 */
public class CarDirector {

  /**
   * 构建汽车
   * @param carBuilder 汽车建造类
   * @return 构建的汽车
   */
  public Car carDirector(CarBuilder carBuilder) {
    // 构建车架
    carBuilder.buildFrame();
    // 构建轮胎
    carBuilder.buildTyre();
    // 构建发动机
    carBuilder.buildEngine();
    // 返回构建的汽车
    return carBuilder.buildCar();
  }
}
