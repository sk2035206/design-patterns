package 创建型模式_5种.抽象工厂模式;

/**
 * 为宝马523系列生产配件
 *
 * @author sk
 */
public class FactoryBmw523 implements CarFactory {

  @Override
  public Engine createEngine() {
    return new EngineB();
  }
  @Override
  public AirCondition createAirCondition() {
    return new AirConditionB();
  }


}
