package 创建型模式_5种.原型模式;

import java.util.ArrayList;

/**
 *  原型模式核心是用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 *  主要用于对象的复制
 *  Prototype类需要具备实现Cloneable接口和重写Object类中的clone方法
 *  Cloneable接口的作用是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
 *  在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
 *  重写Object类中的clone方法。该方法的作用是返回对象的一个拷贝。
 *  因其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
 *  使用原型模式复制对象不会调用类的构造方法
 *  Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、集合、容器对象、引用对象等都不会拷贝;
 * @author sk
 */
class Prototype implements Cloneable {

  private ArrayList list = new ArrayList();

  @Override
  public Prototype clone(){

    Prototype prototype = null;
    try{
      prototype = (Prototype)super.clone();
      // 此注释现在为浅拷贝，解除时为深拷贝
      prototype.list = (ArrayList) this.list.clone();
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }
    return prototype;
  }

  public ArrayList getList() {
    return list;
  }

  public void addImage(String img) {
    this.list.add(img);
  }
}
