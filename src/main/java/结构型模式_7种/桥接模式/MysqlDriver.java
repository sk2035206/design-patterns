package 结构型模式_7种.桥接模式;

/**
 * Mysql数据库
 * @author sk
 */
public class MysqlDriver implements Driver{

  private String name;

  public MysqlDriver (){
    name = "我是Mysql数据库";
  }

  @Override
  public void connect() {
    System.out.println("连接Mysql数据库");
  }

  @Override
  public String toString() {
    return "MysqlDriver{" +
        "name='" + name + '\'' +
        '}';
  }
}
