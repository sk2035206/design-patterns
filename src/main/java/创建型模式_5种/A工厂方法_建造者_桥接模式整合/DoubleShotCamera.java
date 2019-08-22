package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  双摄相机模块
 * @author sk
 */
public class DoubleShotCamera implements Camera {

  @Override
  public void createModuel() {
    System.out.println("创建双摄相机");
  }

  @Override
  public String toString() {
    return "双摄相机";
  }

}
