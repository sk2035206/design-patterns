package 行为型模式_11种.迭代子模式;

/**
 * 具体迭代子角色类
 * @author sk
 */
public class ConcreteIterator implements Iterator {

  /** 持有被迭代的具体的聚合对象 */
  private ConcreteAggregate agg;
  /** 内部索引，记录当前迭代到的索引位置 */
  private int index;
  /** 记录当前聚集对象的大小 */
  private int size;

  /**
   * 初始化迭代子类
   * @param aggregate 具体聚集角色
   */
  public ConcreteIterator(ConcreteAggregate aggregate){
    this.agg = aggregate;
    this.index = 0;
    this.size = agg.size();
  }

  @Override
  public Object currentItem() {
    return agg.getElement(index);
  }

  @Override
  public void first() {
    index = 0;
  }

  @Override
  public boolean hasNext() {
    return (index < size);
  }

  @Override
  public void next() {
    if(index < size){
      index ++;
    }
  }

}
