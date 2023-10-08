# java入门知识：

## 一、开发环境

1. **jdk**  java开发工具包，全称为 java develpment kit
2. **jre**  java 运行环境，(java runtime Environment)
3. **jvm**  java 虚拟机，(java Virtual Machine)

## 二、关系

> - JDK = JRE + 开发工具（javac.exe，java.exe，javadoc.exe..）
> - JRE = JVM + 标准的核心的类库

## 三、变量

变量的三要素：

1. 变量名
2. 数据类型
3. 变量值

```java
public class BianLiang {

    public static void main(String[] args) {

        int age;
        age = 18;
        System.out.println("我今年的年龄是：" + age);
    }


}
```

## 四、标识符

概念：

> java 对各种变量、方法和类等要素命名的时候使用的字符串叫做标识符

比如：类名、变量名、包、常量名.....

### 一、标识符命名的规则

1、JAVA的标识符只能用26个英文字母（大小写）、0 -9 的数字、美元符号、下划线（_）

2、数字不能开头

3、不能包含空格

4、严格区分大小写

5、不能使用JAVA的关键字和保留字、特殊键

### 二、标识符命名规范

1、类名、接口名等：每一个单词首字母大写、形式XxxxYxx

2、变量名、方法名：第一个单词字母小写，第二个单词首字母大写：形式xxxYyy

3、包名：全部小写，形式 xxx .yyy.zzz 例如： java.long

4、常量名：全部大写,形式：XXX_YYY_ZZZ 例如：PI

总则： 见名知意
