package 行为型模式_11种.状态模式;

/**
 * 简单状态模式
 *
 * 使用状态模式前，客户端外界需要介入改变状态，而状态改变的实现是琐碎或复杂的。
 * 使用状态模式后，客户端外界可以直接使用事件Event实现，根本不必关心该事件导致如何状态变化，这些是由状态机等内部实现。
 * 这是一种Event-condition-State，状态模式封装了condition-State部分。
 * 每个状态形成一个子类，每个状态只关心它的下一个可能状态，从而无形中形成了状态转换的规则。如果新的状态加入，只涉及它的前一个状态修改和定义。
 *
 * 状态模式的主要优点在于封装了转换规则，并枚举可能的状态，它将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，
 * 只需要改变对象状态即可改变对象的行为，还可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数；其缺点在于使用状态模式会增加系统类和对象的个数，
 * 且状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱，对于可以切换状态的状态模式不满足“开闭原则”的要求。
 *
 * @author mkk
 * @since 2020/9/10
 */
public class SimpleState {

    /**
     * 颜色状态
     */
    private State state = null;

    /**
     * 推送模式
     */
    public void push() {
        // 状态的切换的细节部分,在本例中是颜色的变化,已经封装在子类的handlePush中实现,这里无需关心
        state.handlePush(this);
        System.out.println(state.getColor());
    }

    /**
     * 拉取模式
     */
    public void pull() {
        state.handlePull(this);
        System.out.println(state.getColor());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
