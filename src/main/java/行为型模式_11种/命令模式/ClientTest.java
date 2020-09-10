/*
 *  Copyright 1999-2019 Evision Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package 行为型模式_11种.命令模式;

/**
 * 命令模式测试类
 *
 * 1.命令模式的本质是对命令进行封装，将发出命令的责任和执行命令的责任分割开。
 * 2.每一个命令都是一个操作：请求的一方发出请求，要求执行一个操作；接收的一方收到请求，并执行操作。
 * 3.命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求是怎么被接收，
 *   以及操作是否被执行、何时被执行，以及是怎么被执行的。
 * 4.命令模式使请求本身成为一个对象，这个对象和其他对象一样可以被存储和传递。
 * 5.命令模式的关键在于引入了抽象命令接口，且发送者针对抽象命令接口编程，只有实现了抽象命令接口的具体命令才能与接收者相关联。
 *
 *
 *
 * @author mkk
 * @since 2020/9/10
 */
public class ClientTest {
    public static void main(String[] args) {
    // 命令接收者Receiver
        Tv myTv = new Tv();
        // 开机命令ConcreteCommand
        CommandOn on = new CommandOn(myTv);
        // 关机命令ConcreteCommand
        CommandOff off = new CommandOff(myTv);
        // 频道切换命令ConcreteCommand
        CommandChange channel = new CommandChange(myTv, 2);
        // 命令控制对象Invoker
        Control control = new Control(on, off, channel);

        // 开机
        control.turnOn();
        // 切换频道
        control.changeChannel();
        // 关机
        control.turnOff();
    }
}
