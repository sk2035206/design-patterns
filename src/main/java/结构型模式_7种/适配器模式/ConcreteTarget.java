package 结构型模式_7种.适配器模式;

/**
 * 具体目标类，只提供普通功能（国内的扁平两项插孔）
 * @author sk
 */
class ConcreteTarget implements Target {

  @Override
  public void request() {
    System.out.println("目标---->使用两项扁平的插孔供电...");
  }
}
