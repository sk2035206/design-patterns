package 行为型模式_11种.观察者模式;

/**
 * 具体的观察者
 * @author sk
 */
public class Police implements Watcher{

  @Override
  public void notice(){
    System.out.println("运输车开始出发，警察护航!");
  }

  @Override
  public String toString() {
    return "警察 ";
  }
}
