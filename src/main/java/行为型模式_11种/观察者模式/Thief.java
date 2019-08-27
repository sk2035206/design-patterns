package 行为型模式_11种.观察者模式;

/**
 * 具体的观察者
 * @author sk
 */
public class Thief implements Watcher{

  @Override
  public void notice(){
    System.out.println("运输车周围人员防守有漏洞，强盗准备动手!");
  }

  @Override
  public String toString() {
    return "强盗 ";
  }
}
