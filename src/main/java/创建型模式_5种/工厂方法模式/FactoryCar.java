package 创建型模式_5种.工厂方法模式;

/**
 * 工厂方法模式
 * @author sk
 */
public interface FactoryCar {

  /**
   * 根据类型获取汽车实例
   * @return 汽车实例
   */
  Car createCar();
}

