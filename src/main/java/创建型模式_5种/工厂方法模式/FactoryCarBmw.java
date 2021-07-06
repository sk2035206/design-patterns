package 创建型模式_5种.工厂方法模式;

/**
 * 宝马实例
 */
class FactoryCarBmw implements FactoryCar{

  @Override
  public Car createCar() {
    return new Bmw();
  }
}
