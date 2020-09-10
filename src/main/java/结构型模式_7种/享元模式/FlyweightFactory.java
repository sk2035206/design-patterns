package 结构型模式_7种.享元模式;

import java.util.Hashtable;

/**
 *  享元模式类
 * @author sk
 */
public class FlyweightFactory{

  /** 定义了一个Hashtable作为享元池用来储存对象 */
  private Hashtable FlyweightPool = new Hashtable();
  public FlyweightFactory(){}

  /**
   * 获取享元对象
   * @param state 要实例化的对象
   * @return 实例化对象
   */
  public Flyweight getFlyWeight(Character state){
    // 从存储池中查找对象
    Flyweight flyweight = (Flyweight) FlyweightPool.get(state);
    if(flyweight == null){
      //如果对象不存在则创建一个新的Flyweight对象，并将其放入存储池中
      flyweight = new ConcreteFlyweight(state);
      FlyweightPool.put(state, flyweight);
    }
    return flyweight;
  }

  /**
   * 获取存储池中对象总个数
   * @return 对象总个数
   */
  public int getFlyweightSize(){
    return FlyweightPool.size();
  }
}