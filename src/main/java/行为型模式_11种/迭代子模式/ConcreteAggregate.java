package 行为型模式_11种.迭代子模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集角色类
 * @author sk
 */
public class ConcreteAggregate extends AbstractAggregate {

  /** 迭代容器 */
  private List list = new ArrayList();

  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(this);
  }

  @Override
  public void add(Object obj) {
    list.add(obj);
  }

  @Override
  public void remove(Object obj) {
    list.remove(obj);
  }

  /**
   * 取值方法：向外界提供聚集元素
   */
  public Object getElement(int index){
    if(index < list.size()){
      return list.get(index);
    }else{
      return null;
    }
  }
  /**
   * 取值方法：向外界提供聚集的大小
   */
  public int size(){
    return list.size();
  }

}
