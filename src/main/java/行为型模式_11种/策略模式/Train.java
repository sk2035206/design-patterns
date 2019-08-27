package 行为型模式_11种.策略模式;

/**
 * 具体策略实例
 * @author sk
 */
public class Train implements Strategy {

  @Override
  public void waysOfTravel() {
    System.out.println("乘火车出行！");
  }
}