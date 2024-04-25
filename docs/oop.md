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

 如：**new Person().shout();**

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

#### 2.1 声明格式

```java
修饰符 返回值类型 方法名（参数类型 形参1，参数类型，形参2）{
    方法体程序代码
    return 返回值;
}
```

其中：

​      修饰符： public，缺省，private,protected 等

​		返回值类型

			- 没有返回值：Void
			- 有返回值：声明返回值的类型 

#### 2.2 方法的重载

1. 概念

> 在同一个类中，允许一个以上的同名方法，只要他们的参数个数或参数类型不同即可

2. 特点

   > 与返回值类型无关，只看参数列表，且参数列表必须不同，（参数个数或参数类型），调用时，根据方法参数列表不同来区分
两同一不同":同一个类、相同方法名 参数列表不同：参数个数不同，参数类型不同


   ```java
   public class OverLoadTest {
   
       public static void main(String[] args) {
           OverLoadTest o = new OverLoadTest();
           o.sum(1, 2);
           o.sum(0.1, 0.3);
           o.sum(1, "1");
           o.sum("1", 1);
   
   
       }
   
       /*如果sum(int i, int j) 这个不存在，直接调用 o.sum(1, 2），会被调用 sum(double i, double j)，自动类型提升*/
       public void sum(int i, int j) {
           System.out.println(1);
       }
   
       public void sum(double i, double j) {
           System.out.println(2);
       }
   
       public void sum(String str, int i) {
           System.out.println(3);
       }
   
       public void sum(int i, String str) {
           System.out.println(4);
       }
   
   }
   
   ```

   

#### 2.3 可变形参的方法

可变个数形参的方法： 可变参数传递相当于传递了一个数组

1. 具体使用：
1.1可变个数形参的格式：数据类型 ... 变量名
1.2 当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个,2个，。。。
1.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
1.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存。
1.5 可变个数形参在方法的形参中，必须声明在末尾
1.6可变个数形参在方法的形参中,最多只能声明一个可变形参。

代码demo

```java
public class MethodArgsTest {

    public static void main(String[] args) {

        MethodArgsTest m = new MethodArgsTest();
        m.show(1);
        m.show("AA");
        m.show("A", "B", "C");

    }

    public void show(int i) {

        System.out.println(i);
    }

    public void show(String str) {

        System.out.println(str);
    }

    /* public void show(String[] arr) {
         System.out.println(arr);
     }*/
    public void show(String... sts) {

        for (int i = 0; i < sts.length; i++) {
            System.out.println(sts[i]);
        }
    }


}

```



#### 2.4  方法参数的值传递机制

 1形参：方法定义时，声明的小括号内的参数
 实参：方法调用时，实际传递给形参的数据

2.值传递机制：
如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。

```java
public class ValueTransferTest1 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        ValueTransferTest1 v = new ValueTransferTest1();
        v.swap(m, n);

        System.out.println("交换后");
        System.out.println("m = " + m + "  n=" + n);
    }

    public void swap(int m, int n) {
        int tmp = m;
        m = n;
        n = tmp;
    }

}

```

```java
public class ValueTransferTest2 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);


        //-----------------------------------------
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        ValueTransferTest2 v = new ValueTransferTest2();
        v.swap(data);
        System.out.println("交换后");
        System.out.println("m:" + data.m + " n:" + data.n);

    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;

    }


}

class Data {

    int m;

    int n;

}

```




#### 2.5 递归方法

概念

- 一个方法体内调用它自身
- 一个方法体内调用它自身。 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
- 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。

代码demo:

```java
public class RecursionMethod {

    public static void main(String[] args) {

        //方式二
        RecursionMethod r = new RecursionMethod();
        System.out.println(r.getSum(10));
        System.out.println(r.getMultiply(10));
        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }

        int n = 64;
        char a = 'A', b = 'B', c = 'C';
        hanio(n, a, b, c);

    }
    //例4：斐波那契数列 主要应用有兔子问题
    /*斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……   */
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    /**
     * @param n 一共需要移动的盘子
     * @param a 盘子移动的起始柱子
     * @param b 借助的柱子
     * @param c 盘子需要移动的目标柱子
     */
    public static void hanio(int n, char a, char b, char c) {
        //只有一个盘子的时候，就直接从A移到C

        if (n == 1) {
            move(n, a, c);
        } else {
            //三步曲，注意观察，a,b,c三个的位置变化
            //1.把 n-1 个盘子看成一个整体，借助 C 从 A 移动到 B
            hanio(n - 1, a, c, b);
            //2.把第 n 个盘子从 A 移动到 C

            move(n, a, c);
            //3.再把 n-1 盘子整体，借助 A 从 B 移动到 C

            hanio(n - 1, b, a, c);
        }

    }

    public static void move(int n, char a, char b) {
        System.out.println("把第" + n + "个盘子 从" + a + "移动" + b);
    }
    // 例1：计算1-n之间所有自然数的和  递归
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }

    }
    // 例2：计算1-n之间所有自然数的乘积:n!
    public int getMultiply(int n) {
        if (n < 1) return -1;
        if (n == 1) {
            return 1;
        } else {
            return n * getMultiply(n - 1);
        }
    }

    //例5：汉诺塔问题
    /*
    * 汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
    后来，这个传说就演变为汉诺塔游戏，玩法如下:
    1.有三根杆子A,B,C。A杆上有若干碟子
    2.每次移动一块碟子,小的只能叠在大的上面
    3.把所有碟子从A杆全部移到C杆上*/
    //例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int getMultiplyF(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * getMultiply(n - 1) + getMultiply(n - 2);
        }
    }


    //例6：快排

}
```



### 3. 构造器（构造方法）

#### 3.1 特征

- 具有与类相同的名称
- 不声明返回值类型
- 不能被static、final、修饰，不能用return语句返回值

#### 3.2 作用

创建对象：给对象进行初始化

#### 3.3 语法格式

```java
修饰符 类名（参数列表）{
    初始化语句;
}
```

```java
public class Animal {

    private Integer legs;

    public Integer getLegs() {

        return legs;
    }

    public void setLegs(Integer legs) {

        this.legs = legs;
    }
	// 构造函数
    public Animal(Integer legs) {

        this.legs = legs;
    }

}

```

#### 3.4分类

根据参数的不用，构造器可以分为，

- 隐式无参构造器（系统默认提供）
- 显示定义一个或多个构造器（无参、有参）



### 4. 代码块

> 

### 5. 内部类

> 

## 五、面向对象的三大特征

### 1. 封装

 1.1 思想：

> 隐藏对象内部的复杂性，只对外公开简单的接口。便于外界调用，从而提高系统的可拓展性、可维护性。通俗的来说。把该隐藏的隐藏起来，该暴露的暴露出来。

介绍一下修饰符的权限：

![image-20240425163348169](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/image-20240425163348169.png)

一般为了符合封装性，类中的属性都是private, 通过set 方法或 get 方法进行赋值，而方法一般的权限一般都是public

### 2. 继承

>

### 3. 多态

>



抽象类与类型方法

>

工具类Objects 

> 
