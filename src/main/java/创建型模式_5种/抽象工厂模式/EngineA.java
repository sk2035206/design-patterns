package 创建型模式_5种.抽象工厂模式;

public class EngineA extends Engine{

  @Override
  public void make() {
    System.out.println("制造-->自吸发动机");
  }
}
