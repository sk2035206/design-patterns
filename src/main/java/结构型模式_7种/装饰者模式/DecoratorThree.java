package 结构型模式_7种.装饰者模式;

/**
 * 第三种装饰者装饰者
 * @author sk
 */
public class DecoratorThree extends Decorator {

  /**
   * 初始化被装饰着
   * @param human 被装饰着
   */
  public DecoratorThree(Human human) {
    super(human);
  }

  public void findClothes() {
    System.out.println("找到一件D&G。。");
  }

  public void findTheTarget() {
    System.out.println("在地图上找到游乐场。。");
  }

  @Override
  public void wearClothes() {
    // TODO Auto-generated method stub
    super.wearClothes();
    findClothes();
  }

  @Override
  public void walkToWhere() {
    // TODO Auto-generated method stub
    super.walkToWhere();
    findTheTarget();
  }
}
