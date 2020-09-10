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
 * 研发部
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Development implements Department {

    /**
     * 持有中介者对象引用
     */
    private final Mediator mediator;

    public Development(Mediator m) {
        this.mediator = m;
        m.register("development", this);
    }

    @Override
    public void ownWork() {
        System.out.println("研发部：负责研发工作！");
    }

    @Override
    public void outWork() {
        System.out.println("研发部：请求财务部配合！");
        mediator.command("Finance");
    }
}


/**
 * 市场部
 */
class Market implements Department {

    /**
     * 持有中介者对象引用
     */
    private final Mediator mediator;

    public Market(Mediator m) {
        this.mediator = m;
        m.register("market", this);
    }

    @Override
    public void ownWork() {
        System.out.println("市场部：负责项目承接工作！");
    }

    @Override
    public void outWork() {
        System.out.println("市场部：请求研发部门配合！");
        mediator.command("development");
    }
}


/**
 * 财务部
 */
class Finance implements Department {

    /**
     * 持有中介者对象引用
     */
    private final Mediator mediator;

    public Finance(Mediator m) {
        this.mediator = m;
        m.register("Finance", this);
    }

    @Override
    public void ownWork() {
        System.out.println("财务部：负责财务工作！");
    }

    @Override
    public void outWork() {
        System.out.println("财务部：请求市场部配合！");
        mediator.command("market");
    }
}


