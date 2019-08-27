package 行为型模式_11种.模板方法模式;

/**
 * 模版方法模式
 * @author sk
 *
 * 模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使
 * 子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。这也就是使用模板方法的用意。
 * 比如定义一个操作中的算法的骨架，将步骤延迟到子类中。模板方法使得子类能够不去改变一个算法的结构即可重定义算法的某些特定步骤。
 *
 * 优点：子类实现算法的某些细节，有助于算法的扩展。
 *       模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
 *       通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。
 * 缺点：每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 **/
public abstract class AbstractPerson{

  /** 抽象类定义整个流程骨架 */
  public final void prepareGotoSchool(){
    dressUp();
    eatBreakfast();
    takeThings();
  }

  /** 穿衣 */
  protected abstract void dressUp();
  /** 吃饭 */
  protected abstract void eatBreakfast();
  /** 拿物品 */
  protected abstract void takeThings();
}
