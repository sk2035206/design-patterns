package 结构型模式_7种.组合模式;

/**
 * 组合模式测试类
 * @author sk
 *
 * Component 是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component子部件。
 * Composite 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等。
 * Leaf 在组合中表示叶子结点对象，叶子结点没有子结点。
 *
 */
public class CompositeTest {
  public static void main(String[] args) {
    // 构造根节点
    Component rootComposite = new Composite();
    rootComposite.name = "根-人类";
    // 左节点
    Composite compositeLeft = new Composite();
    compositeLeft.name = "左-年轻人";
    // 构建右节点，添加两个叶子几点，也就是子部件
    Composite compositeRight = new Composite();
    compositeRight.name = "右-中年人";
    Leaf leaf1 = new Leaf();
    leaf1.name = "左1-年轻男子";
    Leaf leaf2 = new Leaf();
    leaf2.name = "左2-年轻女子";
    compositeRight.add(leaf1);
    compositeRight.add(leaf2);
    // 左右节点加入根节点
    rootComposite.add(compositeRight);
    rootComposite.add(compositeLeft);
    // 遍历组合部件
    System.out.println("遍历结果：");
    rootComposite.eachChild();
    System.out.println();
    compositeRight.remove(leaf2);
    System.out.println("遍历结果：");
    rootComposite.eachChild();
  }

}
