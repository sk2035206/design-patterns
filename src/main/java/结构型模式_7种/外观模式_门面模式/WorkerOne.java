package 结构型模式_7种.外观模式_门面模式;

/**
 * 工人一
 * @author sk
 */
public class WorkerOne {

  public WorkerOne() {
    System.out.print("水电工 ");
  }

  /** 开始工作 */
  public void stare() {
    this.buy();
    System.out.println("开始接管配电!");
  }

  /** 买材料（内部调用类）*/
  private void buy() {
    System.out.print("买水管，买电线 --->");
  }
}
