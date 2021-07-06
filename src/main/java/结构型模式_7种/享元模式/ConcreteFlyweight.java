package 结构型模式_7种.享元模式;

/**
 * 享元模式具体类
 * @author sk
 */
public class ConcreteFlyweight extends Flyweight{

  /** 名称 */
 private final Character intrinsicState;

  /**
   * 获取对象名称
   * @param state 对象名称
   */
 public ConcreteFlyweight(Character state){
  this.intrinsicState = state;
 }
 @Override
 public void operation(String state){
   System.out.println("内蕴状态 = " + this.intrinsicState);
   System.out.println("外部状态 = " + state);
 }
}
