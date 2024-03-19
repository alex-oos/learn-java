[TOC]

# 面向对象编程（OOP）

## 一、面向过程与面向对象

> 二者都是一种思想，面向对象是相对于面向过程而言的。面向过程，强调的是功能行为，以函数为最小单位，考虑怎么做。
> 面向对象，将功能封装进对象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。
> 面向对象更加强调运用人类在日常的思维逻辑中采用的思想方法与原则，如抽象、分类、继承、聚合、多态等。

## 二、Java基本元素：类和对象

> 类是对一类事物的描述，是抽象的、概念上的定义
> 对象是实际存在的该类事物的每个个体，因而也称为实例(instance)。
>
> **类 = 抽象概念的人；对象 = 实实在在的某个人**

语法格式

```java
修饰符 class 类名 {
	属性声明;
	方法声明; 
}

修饰符public：类可以被任意访问
类的正文要用{ }括起来
```

```java
public class Person {

    //属性
    String name;

    int age = 1;

    boolean isMale;

    //方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话,使用的是：" + language);
    }

}

```

## 三、对象的创建与使用

### 1. 对象的使用

创建对象语法： 类名 对象名 = new 类名();

使用对象名.对象成员 的方式访问对象

```java
   public static void main(String[] args) {
        User u1 = new User(); // 创建对象
        System.out.println(u1.name); // 访问属性
        System.out.println(u1.age);
        System.out.println(u1.isMale);
        User.talk("韩语"); // 访问他的方法
        User.eat();
    }
```

### 2.内存解析

![class-memory](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/class-memory.png)

堆（Heap）：此内存区域的唯一母的就是存放对象实例，几乎所有对象实例都在这里分配内存，这一点在java虚拟机规范中的描述是：所有的对象是咧以及数组都
在堆上分配。

栈（stack）：是指虚拟机栈，虚拟机栈用于存储局部变量等。局部变量表中存放了编辑器可知长度的各种基本数据类型、对象引用（reference类型，它不等同于对象本身，是对象在堆内存的的首地址）。方法执行完，自动是否

方法区（Method Area），用于存储已被虚拟机加载的类信息、常量、静态变量、即时编辑器编译后的代码等数据。

### 3.匿名对象

> 我们也可以不定义对象的句柄，而直接调用这个对象的方法。这样的对象叫做匿名对象

​ 如：**new Person().shout();**

使用情况

- 如果对一个对象只需要进行一次方法调用，那么就可以使用匿名对象。

- 我们经常将匿名对象作为实参传递给一个方法调用。

## 四、类的成员

### 1. 属性

#### 1.1概念

> 对应类中的成员变量

​    **Field = 属性 = 成员变量**

**修饰符** **数据类型** **属性名** **= 初始化值** **;**

**说明1: 修饰符**

常用的权限修饰符有：private、缺省、protected、public

其他修饰符：static、final (暂不考虑)

**说明2：数据类型**

任何基本数据类型(如int、Boolean) 或 任何引用数据类型。

**说明3：属性名**

属于标识符，符合命名规则和规范即可

#### 1.2分类

- 成员变量：在方法体外，类体内生命的变量称为成员变量
- 局部变量：在方法体内部声明的变量称为局部变量

![variable](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/variable.png)

### 2. 方法

> 对应类中的成员方法

**，Method = (成员)方法 = 函数**

### 3. 构造器

### 4. 代码块

### 5. 内部类

## 五、面向对象的三大特征

### 封装

### 继承

### 多态

抽象类与类型方法

工具类Objects 
