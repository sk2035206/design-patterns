package 结构型模式_7种.装饰者模式;

/**
 * 定义装饰者
 * @author sk
 */
public abstract class Decorator implements Human {

  /** 被装饰者 */
  private Human human;

  /**
   * 初始化被装饰着
   * @param human 被装饰着
   */
  public Decorator(Human human) {
    this.human = human;
  }

  @Override
  public void wearClothes() {
    human.wearClothes();
  }

  @Override
  public void walkToWhere() {
    human.walkToWhere();
  }
}
