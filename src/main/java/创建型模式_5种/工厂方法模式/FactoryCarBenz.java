package 创建型模式_5种.工厂方法模式;

/**
 * 奔驰实例
 * @return 汽车实例
 */
class FactoryCarBenz implements FactoryCar{

  @Override
  public Benz createCar() {
    return new Benz();
  }
}
