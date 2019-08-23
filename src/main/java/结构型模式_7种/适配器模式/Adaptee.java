package 结构型模式_7种.适配器模式;

/**
 * 被适配类（例如国外的圆头两项插孔）
 * 已存在的、具有特殊功能、但不符合我们但不符合我们所期望的类
 * @author sk
 */
public class Adaptee {

  public void specificRequest() {
    System.out.println("当前----> 使用两项圆头插孔供电...");
  }

}
