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
package 行为型模式_11种.解释器模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 测试类
 *
 * 1. 何时使用:当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时
 * 2. 方法:构建语法树，定义终结符与非终结符
 * 3. 优点:可扩展性好
 * 4. 缺点:解释器模式会引起类膨胀:解释器模式采用递归调用方法，将会导致调试非常复杂:使用了大量的循环和递归，效率是一个不容忽视的问题
 * 5. 使用场景:可以将一个需要解释执行的语言中的句子表示为一个抽象语法树:一些重复出现的问题可以用一种简单的语言来表达:一个简单语法需要解释的场景
 * 6. 应用实例:编译器:运算表达式计算、正则表达式:机器人
 * 7. 注意事项:尽量不要在重要的模块中使用解释器模式，否则维护会是一个很大的问题
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }


    /**
     * 获得表达式
     *
     * @return 表达式字符
     */
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * 获得值映射
     * @param expStr 表达式字符
     * @return 值映射
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        // key是公式中的参数，value是具体的数值
        HashMap<String, Integer> map = new HashMap<>(expStr.length());

        for(char ch : expStr.toCharArray()) {
            if(ch != '+' && ch != '-' ) {
                if(! map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + ch + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }

}
