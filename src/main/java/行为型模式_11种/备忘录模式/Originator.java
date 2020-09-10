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
package 行为型模式_11种.备忘录模式;

/**
 * 备忘录模式
 * 备忘录模式实在不破坏封装的条件下，通过备忘录对象（Memento）存储另外一个对象内部状态的快照，
 * 在将来合适的时候把这个对象还原到存储起来的状态。
 *
 * 优点
 * 给用户提供了一种可以恢复状态的机制，可以是用户能够方便的回到某个历史的状态
 * 实现了信息的封装，是的用户不需要关心状态的保存细节
 *
 * 缺点
 * 消耗资源，如果累的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Originator {

    private String state;

    /** 创建一个新的备忘录对象 */
    public Memento createMemento(){
        return new Memento(state);
    }

    /** 将发起者的状态恢复到备忘录的状态 */
    public void restore(Memento memento){
        this.state = memento.getState();
    }

}
