package 结构型模式_7种.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * @author sk
 *
 * 将对象以树形结构组织起来，以达成“部分－整体”的层次结构，使得客户端对单个对象和组合对象的使用具有一致性。
 * 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了。
    */
public class Composite extends Component{

  /** 用来保存节点的子节点 */
  List<Component> list = new ArrayList<>();

  @Override
  public void add(Component c) {
    System.out.println("新增:" + c.name);
    list.add(c);
  }

  @Override
  public void remove(Component c) {
    System.out.println("删除:" + c.name);
    list.remove(c);
  }

  @Override
  public void eachChild() {
    list.forEach(Component::eachChild);
  }
}
