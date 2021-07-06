package 创建型模式_5种.抽象工厂模式;

public class AirConditionA extends AirCondition {

  @Override
  public void make() {
    System.out.println("制造-->空调A");
  }
}
