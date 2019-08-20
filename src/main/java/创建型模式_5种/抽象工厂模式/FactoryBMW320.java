package 创建型模式_5种.抽象工厂模式;

//为宝马320系列生产配件
public class FactoryBMW320 implements CarFactory{

  @Override
  public Engine createEngine() {
    return new EngineA();
  }
  @Override
  public Aircondition createAircondition() {
    return new AirconditionA();
  }
}
