package 行为型模式_11种.模板方法模式;

/**
 * 模版方法具体类(老师类)
 * @author sk
 **/
public class Teacher extends AbstractPerson{
  @Override
  protected void dressUp() {
    System.out.println("穿工作服。");
  }
  @Override
  protected void eatBreakfast() {
    System.out.println("做早饭，照顾孩子吃早饭。");
  }

  @Override
  protected void takeThings() {
    System.out.println("带上昨晚准备的考卷。\n");
  }
}