package 结构型模式_7种.外观模式_门面模式;

/**
 * 外观模式测试类
 * @author sk
 */
public class FacadeTest {
  public static void main(String[] args) {
    // 使用门面模式（引入包工头）
    Facade facade = new Facade();
    // 启动项目
    facade.stare();
  }
}
