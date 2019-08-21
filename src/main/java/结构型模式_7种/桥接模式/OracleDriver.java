package 结构型模式_7种.桥接模式;

/**
 * Oracle数据库
 * @author sk
 */
public class OracleDriver implements Driver{

  private String name;

  public OracleDriver (){
    name = "我是Oracle数据库";
  }

  @Override
  public void connect() {
    System.out.println("连接Oracle数据库");
  }

  @Override
  public String toString() {
    return "OracleDriver{" +
        "name='" + name + '\'' +
        '}';
  }
}
