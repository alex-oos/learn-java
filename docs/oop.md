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

### 4. static 关键字

使用范围：

> 在java 类中，可用static 修饰属性、方法、代码块、内部类

被修饰后的成员具备以下特点：

- 随着类的加载而加载
- 优先于对象存在
- 修饰的成员，被所有对象所共享
- 访问权限允许时，可补偿价对象，直接被对象调用

类变量（class Variable）：由该类的所有实例共享

```java
public static String name ="demo"；
```

代码demo:

# TODO（目前笔记到了这里，这里还没做完）

```
```

类方法（class method）



```
```



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

javaBean

### 2. 继承

  概念： 多个类中存在相同的属性 和行为时，将这些内容抽取到单独的一个类中，那么多个类中无序再定义这些属性和行为，只要继承那个类即可。此处的多个类称为子类（派生类），单独的这个类称作父类（基类或超类）。

#### 2.1语法格式：

```java
class Stubclass extends SuperClass{

}
```



#### 2.2作用：

- 继承的出现减少了代码的冗余，提高了代码的复用性
- 继承的出现，更有利于功能的扩展
- 继承的出现让类与类之间产生了关系，提供了多态的前提

#### 2.3 继承性：

- 子类继承了父类，就继承了父类的方法和属性
- 在子类中，可以使用父类中定义的方法和属性，也可以创建新的数据和方法
- 在Java中，继承的关键字用的extends，即子类不是父类的字迹，而是对父类的扩展

#### 2.4 规则：

- 子类不能直接访问父类中私有的（private）的成员变量和方法
-  Java 中只支持单继承和多层继承，不允许多重继承（即 一个子类只能有一个父类，而一个父类却可以派生出多个子类）

代码demo：

父类

```java
public class Person {

    String name;

    int age;

    int id = 1001;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("人：吃饭");
    }
    public void walk() {
        System.out.println("人：走路");
    }


}

```

```java
// 子类
public class Student extends Person {

    String major;

    int id = 1002;
    public Student() {
    }
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的食物");
    }


    public void study() {
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        walk();
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.id);
    }

}

```

```java
// 调用类
public class SuperTest {

    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        System.out.println();
        s.study();

        Student s1 = new Student("Tom", 21, "1T");
        s1.show();

        System.out.println("******");

    }

}
```



#### 2.5 方法的重写

  子类继承父类，有的时候因业务需求，需要重写父类的方法，这就是方法的重写。

#### 2.6 super 关键字

使用规则：

- 存在继承关系

使用方法：

- super 可用于访问父类中定义的属性
- super 可用于访问父类中定义的成员方法
- super 可以在子类构造器中调用父类的构造器

注意：

- 当子父类出现同名成员时，可以用super 表明调用的是父类中的成员
- super 追溯不限于直接父类
- super 和this 的用法相像，this代表本类对象的引用，super 代表父类的内存空间的标识

![image-20240511155430124](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/image-20240511155430124.png)





### 3. 多态

#### 3.1 概念：

   对象的多态性：父类的引用指向子类的对象 （可以直接应用在抽象类和接口上）

对象的多态- 在Java中，子类的对象可以替代父类的对象使用

- 一个变量只能有一种确定的数据类型
- 一个引用类型变量可能指向（引用）多种不同类型的对象

子类可看做特殊的父类，所以父类类型的引用可以指向子类的对象：向上转型



#### 3.2 前提：

- 存在继承关系或实现关系
- 有方法的重写

代码demo：

```java
// 父类 Person
@Data
public class Person {

    public String name;

    public int age;

    public int id = 1001;

    public void eat() {
        System.out.println("人：吃饭");
    }
    public void walk() {
        System.out.println("人：走路");
    }


}

```

```java
// 子类man 继承父类
public class Man extends Person {

    public boolean isSmoking;

    int id = 1002;

    public static void earnMoney() {

        System.out.println("男人负责挣钱养家");

    }

    @Override
    public void eat() {

        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {

        System.out.println("男人霸气的走路");
    }


}

```

```java
// 调用类
/**
 * @author Alex
 * @since 2021/12/16 4:00 下午
 * 面向对象特征之三：多态性
 * <p>
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性：
 * 对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * <p>
 * 3. 多态的使用：虚拟方法调用
 * 有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 * 总结：编译，看左边；运行，看右边。
 * <p>
 * 4.多态性的使用前提：  ① 类的继承关系  ② 方法的重写
 * <p>
 * 5.对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
 * <p>
 * *************************************************************
 */
public class PersonTest {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        Man.earnMoney();

        //*************************************************
        System.out.println("*******************");
        
        //    对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();
        Person p3 = new Woman();
        //    多态的使用：当调用子父类同名同参数的方法时，实际执行的时子类重写父类的方法---虚拟方法使用 
        p2.eat();
        p2.walk();
        System.out.println(p2.id);
        System.out.println("****************************");
        // 不能调用子类所特有的方法、属性：编译时，p2是Person类型
        // p2.earnMoney
        // p2.isSmoking = true;
        p2.name = "Tom";

        // 有了对象的多态性以后，内存中实际时加载了子类特有的属性和方法，但是由于变量声明为父类类型，导致，有编译时，只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用
        // 如何才能调用子类特有的属性和方法？
        // 向下转型：使用强制类型转换符。
        Man man1 = (Man) p2;
        Man.earnMoney();
        man1.isSmoking = true;
        // 使用强转时，可能出现ClassCastException的异常。
       /* Woman woman1 = (Woman) p2;
        woman1.goShopping();*/

        /*
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
         *
         *
         *  使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
         *  进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         *
         *  如果 a instanceof A返回true,则 a instanceof B也返回true.
         *  其中，类B是类A的父类。
         */
        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("*****Woman********");
        }
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            Man.earnMoney();
            System.out.println("*******Man******");
        }
        if (p2 instanceof Person) System.out.println("*****Person****");

        if (p2 instanceof Object) System.out.println("****Oject*****");


    }

}

```



#### 3.3 对象类型转化(Casting)

基本舒蕾行的Casting：

- 自动类型转换： 小的数据类型可以自动转换成大的数据类型。如： long g =20 ; double d = 12.0f
- 强制类型转换：可以把大的数据类型强制转换（Casting）成小的数据类型。 如： float f = (float)12.0; int a = (int) 1200L;

对Java对象的强制类型转换称为造型

- 从子类到父类的类型转换可以自动进行
- 从父类到子类的类型必须通过造型（强制类型转换）实现
- 无继承关系的引用类型间的转换是非法的
- 在造型前可以使用instanceof 操作符测试一个对象的类型

代码demo：

```java
      	public static void main(String[] args) {
                   Person p2 = new Man();
			Man man1 = (Man) p2;
        	Man.earnMoney();
        	man1.isSmoking = true;
              // 使用强转时，可能出现ClassCastException的异常。
       		Woman woman1 = (Woman) p2;
        	woman1.goShopping();
         /*
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
         *
         *
         *  使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
         *  进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         *
         *  如果 a instanceof A返回true,则 a instanceof B也返回true.
         *  其中，类B是类A的父类。
         */
        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("*****Woman********");
        }
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            Man.earnMoney();
            System.out.println("*******Man******");
        }
        if (p2 instanceof Person) System.out.println("*****Person****");

        if (p2 instanceof Object) System.out.println("****Oject*****");
        }
```



#### 3.4  父类Object

Object 类位于 java.lang 包中，编译时会自动导入，我们创建一个类时，如果没有明确继承一个父类，那么它就会自动继承 Object，成为 Object 的子类。所以默认Object 类中的方法，在具体的类中均可以使用

常用的方法：

```java
equals() / toString() / getClass() /hashCode() / clone() / finalize()/wait()/notify()/notifyAll()
```



代码demo: getClass() 方法

```java
public class ObjectTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order {
    
}
```

代码demo: clone 方法

```java
public class CloneTest {

    public static void main(String[] args) {
        Animal a1 = new Animal("AA");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象：" + a1);
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}

class Animal implements Cloneable {

    private String name;

    public Animal() {
        super();
    }

    Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Auto-generated method stub
        return super.clone();
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

}

```

代码demo: equals 方法

```java
public class EqualsTest {

    public static void main(String[] args) {
        //基本数据类型
        final int i = 10;
        final int j = 10;
        final double d = 10.0;
        System.out.println(i == j);
        System.out.println(i == d);

        final boolean b = true;
        // System.out.println(i == b);

        final char c = 10;
        System.out.println(i == c);

        final char c1 = 'A';
        final char c2 = 65;
        System.out.println(c1 == c2);

        //    引用类型
        Customer cust1 = new Customer("Tom", 21);
        Customer cust2 = new Customer("Tom", 21);
        System.out.println("cust1==cust2 = " + (cust1 == cust2));
        String str1 = "atguigu";
        String str2 = "atguigu";
        System.out.println(str1 == str2);//false
        System.out.println("****************************");
        System.out.println(cust1.equals(cust2));//false--->true
        System.out.println(str1.equals(str2));//true

        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));//true

    }

}
```



== 和equals 的区别：

- == 既可以比较基本类型也可以比较引用类型，对于基本类型就是比较值，对于引用类型就是比较内存地址
- equals 的话，它是属于java.lang.Object 类里面的方法，如果该方法没有重写默认也是==；我们可以看到String 等类的equals 的方法是被重写的，而且String 类在日常开发中用的比较多，
- 通常情况下，重写equals 方法，会比较类中的响应属性是否相等。

toString 方法：


Object类中toString()的使用：

1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()

2. Object类中toString()的定义：

   ```java
   public String toString() {
   return getClass().getName() + "@" + Integer.toHexString(hashCode());
   }
   ```

3. 像String、Date、File、包装类等都重写了Object类中的toString()方法。
使得在调用对象的toString()时，返回"实体内容"信息

4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"


#### 3.5 包装类

  基础数据类型   --- 包装类

   byte  --- Byte

​	short --- Short

​	int ---- Integer

​	long-----Long

​	float --- Float

​	double--- Double

​	boolean--- Boolean

​	char --- Character 

装箱： 基本数据类型包装成包装类的实例

拆箱： 获取包装类对象中的基本类型变量

jdk1.5之后，支持自动装箱和拆箱。但是类型必须匹配

代码demo

```java
public class WrapperTest {

    public static void method(Object obj) {
        System.out.println(obj);
    }
    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    public static void test4() {

        final int num1 = 10;
        //方式1：连接运算
        final String str1 = num1 + "";
        //方式2：调用String的valueOf(Xxx xxx)
        final float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//"12.4"

    }
    //包装类--->基本数据类型:调用包装类Xxx的xxxValue()
    public static void test2() {
        Integer in1 = Integer.valueOf(12);

        int i1 = in1.intValue();
        System.out.println(i1 + 1);


        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型 --->包装类：调用包装类的构造器

    public static void test1() {

        final int num1 = 10;
//		System.out.println(num1.toString());
        Integer in1 = Integer.valueOf(num1);
        System.out.println(in1);

        Integer in2 = Integer.valueOf("123");
        System.out.println(in2);

        //报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.TRUE;
        System.out.println(b2);
        Boolean b3 = Boolean.valueOf("true123");
        System.out.println(b3);//false


        Order1 order = new Order1();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }
    /*
     * JDK 5.0 新特性：自动装箱 与自动拆箱
     */

    public static void test3() {
//		int num1 = 10;
//		//基本数据类型-->包装类的对象
//		method(num1);

        //自动装箱：基本数据类型 --->包装类
        final int num2 = 10;
        final Integer in1 = num2;//自动装箱

        final boolean b1 = true;
        final Boolean b2 = b1;//自动装箱

        //自动拆箱：包装类--->基本数据类型
        System.out.println(in1);

        final int num3 = in1;//自动拆箱

    }
    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)

    public static void test5() {
        final String str1 = "123";
        //错误的情况：
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        final String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

}

class Order1 {

    boolean isMale;

    Boolean isFemale;

}

```





## 六、接口

## 七、设计模式

  ### 1. 单例模式



