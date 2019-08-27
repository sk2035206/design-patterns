package 行为型模式_11种.观察者模式;

/**
 * 具体的观察者
 * @author sk
 */
public class Security implements Watcher{

  @Override
  public void notice(){
    System.out.println("运输车周围情况异常，押运保护!");
  }

  @Override
  public String toString() {
    return "押运 ";
  }
}
