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
 * 抽象同事类
 *
 * @author mkk
 * @since 2020/9/10
 */
public interface Department {

    /**
     * 本部门自己的工作
     */
    void ownWork();

    /**
     * 需要其他部门配合的工作
     */
    void outWork();
}
