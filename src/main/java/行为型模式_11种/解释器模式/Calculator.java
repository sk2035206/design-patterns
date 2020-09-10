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

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Calculator {

    /** 定义表达式 */
    private final Expression expression;

    /**
     * 构造函数传参，并解析
     *
     * @param expStr 解析符
     */
    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        Expression left;
        Expression right;
        for(int i=0; i<charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:    //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    /**
     * 计算
     * @param var key是公式中的参数，value是具体的数值
     * @return 结果
     */
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }

}
