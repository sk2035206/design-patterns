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
package 行为型模式_11种.中介者模式;

/**
 * 中介者模式测试类
 *
 * 1.中介者模式本质：
 * 解耦多个同事对象之间的交互关系。每个对象都持有中介者对象的引用，只跟中介者对象打交道。我们通过中介者对象统一管理这些交互关系。
 *
 * 2.开发中常见场景：
 * MVC模式(其中的C，控制器就是一个中介者对象。M和V都和他打交道)。
 * 窗口游戏程序，窗口软件开发中窗口对象也是一个中介对象。
 *
 * 3.注意事项：
 * 在面向对象编程中，一个类必然会与其他的类发生依赖关系，完全独立的类是没有意义的。一个类同时依赖多个类的情况也相当普遍，既然存在这样的情况，
 * 说明，一对多的依赖关系有它的合理性，适当的使用中介者模式可以使原本凌乱的对象关系清晰，但是如果滥用，则可能会带来反的效果。一般来说，只有对于那种同事类之间是网状结构的关系，才会考虑使用中介者模式。可以将网状结构变为星状结构，
 * 使同事类之间的关系变的清晰一些。 滥用中介者模式，可能让事情变的更复杂。
 *
 * @author mkk
 * @since 2020/9/10
 */
public class MediatorTest {

    public static void main(String[] args) {

        Mediator president = new President();

        Development development = new Development(president);
        Finance finance = new Finance(president);
        Market market = new Market(president);

        development.ownWork();
        development.outWork();

        finance.outWork();
        market.outWork();

    }
}
