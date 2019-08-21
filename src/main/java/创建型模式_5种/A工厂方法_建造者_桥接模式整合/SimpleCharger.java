package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  快速冲电模块
 * @author sk
 */
public class SimpleCharger implements Charger {

  @Override
  public void charge() {
    System.out.println("快速冲电");
  }

  @Override
  public String toString() {
    return "快速冲电";
  }
}
