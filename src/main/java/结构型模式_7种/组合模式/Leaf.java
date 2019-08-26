package 结构型模式_7种.组合模式;

/**
 * 叶子节点(最小节点)
 * @author sk
 * 叶子节点不具备添加和删除的能力
 */
public class Leaf extends Component {

  @Override
  public void add(Component c) {
    System.out.println("");
  }

  @Override
  public void remove(Component c) {
    System.out.println("");
  }

  @Override
  public void eachChild() {
    System.out.print("---" + name + "---");
  }

}
