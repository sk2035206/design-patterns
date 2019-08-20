package 创建型模式_5种.工厂方法模式;

/**
 * 宝马实例
 * @return 汽车实例
 */
class FactoryCarBmw implements FactoryCar{

  @Override
  public Bmw createCar() {
    return new Bmw();
  }
}
