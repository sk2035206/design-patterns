package 创建型模式_5种.原型模式;

/**
 * 测试类
 * @author sk
 *
 * 此mian方法输出为浅拷贝内容，可以看见拷贝重新赋值后，标题未改变但是图片内容改变了,那是因为图片的类型为list
 * Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、集合、容器对象、引用对象等都不会拷贝
 * 所以需要对图片进行深拷贝才可以解决这个问题-->将{@link Prototype} 中那行被注释的语句解除就会成为深拷贝
 * 因此模式为了方便扩展，采用的是实现类继承Prototype父类，因此本方法中需要进行深拷贝的内容放在了父类中进行
 * 可以直接在实现类中直接实现{@link Cloneable} 接口，并重写clone方法，进行深拷贝
 */
public class Test {
  public static void main(String[] args){
    // 实例化原型模式实现类
    ConcretePrototype cp = new ConcretePrototype();
    cp.setTitle("Java基础");
    cp.addImage("图片一");
    System.out.println("----------------------初始化内容----------------------");
    cp.show();
    // 拷贝内容
    ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
    clonecp.setTitle("Mysql基础");
    clonecp.addImage("图片二");
    System.out.println("----------------------拷贝后内容----------------------");
    clonecp.show();
    System.out.println("----------------------原始的内容----------------------");
    cp.show();
  }
}
