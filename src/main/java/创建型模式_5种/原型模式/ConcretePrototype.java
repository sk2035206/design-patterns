package 创建型模式_5种.原型模式;

/**
 *  具体原型类
 * @author sk
 */
class ConcretePrototype extends Prototype{
  // 标题
  private String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void show(){
    System.out.println("title：" + title);
    super.getList().forEach((img) -> System.out.println("image name:" + img));
  }

}
