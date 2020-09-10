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
 * 备忘录管理者
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Caretaker {

    private Memento memento;

    public Memento restoreMemento(){
        return memento;
    }

    public void storeMemento(Memento memento){
        this.memento = memento;
    }
}
