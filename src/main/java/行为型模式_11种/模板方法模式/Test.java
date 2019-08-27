package 行为型模式_11种.模板方法模式;

/**
 * 模版方法测试类
 * @author sk
 *
 * 抽象类（AbstractPerson）：实现了模板方法，定义了算法的骨架。
 * 具体类（Student/Teacher)：实现抽象类中的抽象方法，已完成完整的算法。
 *
 * 使用场景：在某些类的算法中，用了相同的方法，造成代码的重复。
 *          控制子类扩展，子类必须遵守算法规则。
 */
public class Test {
  public static void main(String[] args) {

    Teacher teacher  = new Teacher();
    teacher.prepareGotoSchool();

    Student student = new Student();
    student.prepareGotoSchool();
  }
}
