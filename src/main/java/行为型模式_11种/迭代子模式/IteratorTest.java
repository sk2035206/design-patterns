package 行为型模式_11种.迭代子模式;

/**
 * 迭代子模式测试类
 * @author sk
 *
 * 迭代子模式优点
 * 迭代子模式简化了聚集的接口。迭代子具备了一个遍历接口，这样聚集的接口就不必具备遍历接口。
 * 每一个聚集对象都可以有一个或多个迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。因此，一个聚集对象可以同时有几个迭代在进行之中。
 * 由于遍历算法被封装在迭代子角色里面，因此迭代的算法可以独立于聚集角色变化。
 */
public class IteratorTest {
  public static void main(String[] args) {
    //创建聚合对象
    AbstractAggregate aggregate = new ConcreteAggregate();
    aggregate.add("One");
    aggregate.add("Two");
    aggregate.add("Three");
    aggregate.add("Four");
    aggregate.add("Five");
    aggregate.add("Six");
    //循环输出聚合对象中的值
    Iterator it = aggregate.createIterator();
    // 此处代码只为展示不必深究
    while(it.hasNext()){
      System.out.println(it.currentItem());
      if ("Three".equals(it.currentItem())){
        aggregate.remove("Three");
        it = aggregate.createIterator();
        it.first();
      }else {
        it.next();
      }
    }
  }
}
