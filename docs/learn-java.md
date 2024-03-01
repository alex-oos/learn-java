[TOC]

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

#### 1、标识符的命名规则：

    1. Java的标识符只能用26个英文字母，大小写，数字0-9，美元符号（$),下划线（_）
    2. 数字不能开头
    3. 不能包含空格
    4. 严格区分大小写
    5. 不能使用关键字，保留字，特殊值

##### 2、标识符的命名规范：

    1. 类名：每个单词的首字母必须大写，形式是XxxYyy
    2. 变量名、方法名等：第一个单词首字母小写，其余单词首字母大写
    3. 包名：所有单词都小写，形式是xxx.yyy.zzz
    4.常量：所有单词都要大写，形式XXX_YYY_ZZZ，例如：PI，MAX_VALUE
    - 总则：见名思意

#### 3、变量的声明格式，变量的赋值格式，变量的三要素，变量应该注意几点

    - 变量的声明格式：数据类型 变量名；
    - 变量的赋值格式：变量名 = 值；
    - 变量的三要素： 数据类型 变量名 变量值
    - 变量的使用应该注意：
        1）先声明后使用
        2）使用之前必须赋初始化值
        3）变量的作用域
           作用:从声明处开始到所属的}结果
           同一个作用域中不能重复声明一个变量

#### 4、java基本数据类型有哪些？

    1. 基本数据类型
       byte,short,int,long,float,double,char,boolean
    2. 引用数据类型
       类，接口，数组，枚举
       String 属于类 ，引用数据类型

#### 5、java程序的开发步骤是什么？

     1.编辑：
      编写源文件，保存为.java文件
      class 类名{
            方法{
            语句
            }
      }
    2.编译：
      编译的结果是：.java 的源文件编译为成一个或多个.class 文件
      编译的工具是：javac.exe
      编译的命名格式是：java 源文件名.java
    3. 运行：
     运行的工具是：java.exe
     运行的格式是：java 类名
     这个类必须包含main方法，main方法的格式是：public static void main(String[] arg[])

## 五、运算符

### 一、算术运算符

    1. 加、减、乘，除,取余（取余）： +,-,*,/,%
    
        除法：如果两个证书相除，结果只保留整数部分
        // 取余： 模数的符号被忽略
               被模数%模数
    
    2. 正号、负号： + ，-
    
           运算符：一元运算符，二元运算符，三元运算符
           根据需要的操作数的不同
    
    3.如果有一边是字符串，都是字符串拼接
    
    4. 自增
    
          i++   先 取出i的值，参与别的运算，然后a再自增1
          ++i·   先运算a的自增，然后用i自增的结果i自增的结果在参与别的运算 

### 二、赋值运算符

1、基本赋值运算符：=

    把=右边的值赋值给左边的变量。
    右边的值有各种形式：
        （1）常量值
        （2）表达式的值
        （3）方法（函数）调用的结果

### 三、比较运算符，也称为关系运算符

    - 大于：>
    - 小于：<
    - 大于等于：>=
    - 小于等于：<=
    - 等于：== 注意区分赋值的=
    - 不等于：!=
    
    **=,<=,==,!=中间不能有空格**
    
    关系运算符的表达式的结果只有两种：true/false

### 四、扩展赋值运算符

    > += ，-=，*=, /=， %= ，...
    
    说明：前面的运算符与=之前不能有空格
    注意：扩展赋值运算符要警惕它隐含了强转类型转换，有风险，可能溢出，和损失精度（总之，结果与预期不同）

### 五、条件运算符：唯一的三元运算符

    语法格式：
        > 条件表达式 ？ 表达式1 : 表达式2
    
    说明：
        （1）条件表达式必须是一个boolean结果的表达式
        （2）如果条件表达式为true，整个表达式的结果就取表达式1的结果，否则就取表达式2的结果

### 六、位运算符：

    位移:只能作用于long.int,short,byte,char 这四种基本数据类型
    
     1、右移：>>
    
        左边不够的补xx，补什么看最高位，最高位是0就补0，是1就补1
        简单的算法：右移几位，相当于除以2的几次方
    
     2、左移：<<
    
        左移，右边补0
        简单的算法：左移几位，相当于乘以2的几次方
    
     3、无符号右移：>>>
    
        左边的不管最高位是xx，统统都补0
    
     4、按位与：&
    
        1 & 1 结果是1
        1 & 0 结果为0
        0 & 1 结果为0
        0 & 0 结果为0
    
     5、按位或：|
    
        1 | 1 结果是1
        1 | 0 结果为|
        0 | 1 结果为|
        0 | 0 结果为0
    
     6、按位异或：^
    
        1 ^ 1 结果是0
        1 ^ 0 结果为|
        0 ^ 1 结果为|
        0 ^ 0 结果为0
    
     7、按位取反：~
    
        位运算符是用整数的二进制，并且是补码来运算的。
        开发很少用，但是源代码中有
        在Java程序中可能会出现多种进制：
        二进制：计算机所有数据都是二进制
        数字：0-1
        逢二进一
        十进制：生活中，人更习惯十进制，结果显示都是十进制
        数字：0-9
        逢十进一
        八进制：
        数字：0-7
        逢八进一
        十六进制：
        数字：0-9，A(a)-F(f)
        逢十六进一
    
    八进制和十六进制都是辅助表示二进制
    
    1、在程序中如何表示某个数字是几进制的？
    十进制：默认
    二进制：数字前加0b或0B
    八进制：数字前加0
    十六进制：数字前加0X或0x

## 六、程序流程控制

> 流程控制语句是用来控制程序中各语句执行顺序的语句，可以把语句组合成能完成一定功能的小逻辑模块

主要分为三个：

### 1. 顺序结构

> 程序从上到下执行，中间没有任何判断和跳转

```java
public class Test{
	int num1 = 12;
	//执行语句1
	int num2 = num1 + 2;
}
```

### 2. 分支结构

> 根据条件，选择性地执行某段代码

#### 2.1分支结构

（1）条件判断：if...else
（2）选择结构：switch...case

#### 2.2条件判断：if...else

（1）单分支
（2）双分支
（3）多分支
（4）嵌套

#### 2.3单分支

语法结构：

```
if(条件表达式){
	当条件表达式为true，即条件成立时，需要执行的语句块;
}
```

执行的特点：
当某个条件成立，就执行，不成立就什么也不干

说明：
（1）if()中写条件表达式，必须是布尔类型
A：关系表达式
B：逻辑表达式
C：布尔变量
（2）如果{}中只有一个语句，那么可以省略{}
但是：习惯上，我们就算只有一个语句，也保留{}

```java
 public static void main(String[] args){
        //当某个条件成立，就执行，不成立就什么也不干
        //例如：如果年满18岁，就让你进入我的系统
        int age = 14;
        if(age >= 18){
            System.out.println("欢迎您进入成人世界。。。。");
            System.out.println("玩的尽兴...");
        }

    }
```

#### 2.4双分支：if...else

语法结构：

```
if(条件表达式){
    当条件表达式成立时，执行的语句块1;
}else{
    当条件表达式不成立时，执行的语句块2;
}
```

执行的特点：
这两个分支只执行其中一个，
当条件表达式成立时，执行的语句块1;
当条件表达式不成立时，执行的语句块2;

说明：
（1）if()中写条件表达式，必须是布尔类型
A：关系表达式
B：逻辑表达式
C：布尔变量
（2）如果{}中只有一个语句，那么可以省略{}
但是：习惯上，我们就算只有一个语句，也保留{}

```java
 public static void main(String[] args){
        //例如：如果年满18岁，就让你进入我的系统，否则，提示未成年不得进入
        int age = 19;
        if(age >= 18){
            System.out.println("欢迎您进入成人世界。。。。");
            System.out.println("玩的尽兴...");
        }else
            System.out.println("未成年不得进入");

    }
```

#### 2.4多分支结构

语法结构：

```
if(条件表达式1){
    当条件表达式1成立，执行语句块1;
}else if(条件表达式2){
    当条件表达式2成立，执行语句块2;
}【else if(条件表达式3){
    当条件表达式2成立，执行语句块3;
}】
....
【else{
    当以上所有的条件表达式都不成立，执行语句块n+1;
}】
```

执行特点：
（1）先判断条件表达式1，如果条件表达式1成立，那么就执行语句块1，后面的分支统统都不看，也不执行
（2）如果条件表达式1不成立，接着看条件表达式2，如果条件表达式2成立，那么就执行语句块2，
前面的语句块1，和后面的语句块都不执行，后面的条件也不看了。
（3）依次类推
（4）如果所有的条件都不成立，如果此时存在单独的else，那么执行else中的语句块n+1，如果else不存在，那么就都不执行。

说明：
（1）【】表示可选，可能有可能没有
（2）所有的条件表达式都要是布尔值
（3）所有的分支，如果只有一个语句，对应的{}仍然可以省略，但是强烈建议都保留。
（4）如果多个if的条件的范围是互斥，没有重叠部分，那么是顺序可以调换
如果多个if的条件的范围是包含，有重叠部分，那么顺序有要求，范围小的在上，大的在下

```java
   public static void main(String[] args){
        //例子：从键盘输入一个成绩
        //假设成绩输入都是合理的[0,100]
        //如果是100分，那么就打印满分
        //如果是[80,99]，那么就打印优秀
        //如果是[70,80)，那么就打印良好
        //如果是[60,70)，那么就打印及格
        //否则都不及格
        Scanner input = new Scanner(System.in);

        System.out.print("请输入成绩：");//提示输入
        //接收键盘输入
        int score = input.nextInt();

        //判断
		/*
		if(score == 100){
			System.out.println("满分");
		}else if(score>=80 && score<=99){
			System.out.println("优秀");
		}else if(score>=70 && score<80){
			System.out.println("良好");
		}else if(score>=60 && score<70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		//条件互斥：每一个条件没有重叠部分
		*/

        //前提仍然是成绩在[0-100]
        if(score == 100){
            System.out.println("满分");
        }else if(score>=80){
            System.out.println("优秀");
        }else if(score>=70){
            System.out.println("良好");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        //条件包含：仅看条件的范围是有重叠和包含部分

    }
```

#### 2.6 选择结构

语法格式：

```
switch(表达式){
    case 常量值1:
       语句块1;
       【break;】
    case 常量值2:
       语句块2;
       【break;】
    ...
    【
    default:
       语句块n+1;
       【break;】
    】
}
```

执行特点：
“入口”：
A：当表达式的值与其中一个case的常量值匹配，就从这个分支进入，一旦进入顺序往下执行
B：当表达式的值与所有的case都不匹配，如果此时存在default，就从default进入，一旦进入顺序往下执行
“出口”：
A：遇到switch的结束}
B：遇到break

说明：
（1）switch()中的表达式的类型也有要求：
只能是以下几种类型：byte,short,int,char四种基本数据类型，
JDK1.5以后允许支持 枚举类型（引用数据类型）
JDK1.7以后允许支持 String类型（引用数据类型）
（2）case后面必须是常量值或常量表达式
（3）case后面的常量值的类型必须与switch()中表达式的类型一致或兼容
（4）case后面的常量值不能重复

和if..else:
所有的分支情况，都可以使用if..else，换句话说，可以使用switch..case解决的，一定可以使用if..else。
但是当所有的判断都是常量值的等值判断的话，使用switch..case效率更高，可读性更好。

```java
    public static void main(String[] args){
        //根据星期的数字值，输出对应的星期的英文单词
        Scanner input = new Scanner(System.in);
        System.out.print("请输入星期：");
        int week = input.nextInt();

        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("输入有误，星期的范围是1-7");
                break;
        }
    }
```

### 3. 循环结构

> 根据循环条件，重复的执行某段代码有 while、do...while 、for 三种循环语句

#### 3.1 while循环

语法结构：

```
while(循环条件){
    循环体：需要重复执行的语句块
}
```

执行过程：
（1）先上来就判断循环条件
（2）如果条件成立，就执行循环体
（3）回到（1）
（4）直到循环条件不成立结束

循环的四个要素：
（1）循环变量的初始化
（2）循环条件
（3）循环体
（4）迭代表达式：用于修改循环变量的值

for循环比较适用于：起点和终点比较明显，例如1-100，具体多少次，3000米到5米
while循环，适用于，循环条件明显，次数不确定不固定

```java
public static void main(String[] args) {
    // 从键盘不断输入整数，统计正数、负数的个数，输入0结束
    Scanner input = new Scanner(System.in);

    System.out.println("请输入一个整数：");
    int num = input.nextInt();

    int zheng = 0;
    int fu = 0;

    while (num != 0) {
        if (num > 0) {
            zheng++;
        } else if (num < 0) {
            fu++;
        }

        System.out.println("请输入一个整数：");
        num = input.nextInt();
    }

    System.out.println("正数的个数：" + zheng);
    System.out.println("负数的个数：" + fu);
}
```

#### 3.2 do...while循环

```
do{
    循环体：需要重复执行的代码
}while(循环条件);
```

执行的过程：
(1)先执行一次循环体语句
(2)再判断循环条件
(3)如果条件成立，为true，再次执行循环体
(4)回到(2)
(5)直到循环条件不成立，为false，结束循环

如果循环的条件比较明显，但是不像for那样，起始和终止条件比较明确，次数比较明显，
选择while，当出现至少循环体要执行一次，这样可以改为do...while
三种循环都是可以无条件互换的。

#### 3.3 for循环

语法结构：

```
for(;;){
    循环体：需要重复执行的语句块
}
```

说明：
（1）for(;;)两个分号不能省略
（2）只有需要重复执行多次的代码才能放到循环体中{}
（3）需要加上条件等来控制循环的次数，否则就是死循环

语法结构：

```
for(【初始化表达式1】;【循环条件表达式2】;【迭代表达式3】){
    循环体：需要重复执行的语句块4
}
```

执行过程：
（1）先执行【初始化表达式1】
（2）判断【循环条件表达式2】是否成立，为true
（3）如果成立，就执行循环体语句块4
（4）接着执行【迭代表达式3】
（5）回到（2）
（6）直到【循环条件表达式2】不成立，为false，然后就结束

循环嵌套：
外循环循环一次，内循环循环一轮

```java
public static void main(String[] args){
    for(int i=1; i<=4; i++){
       //System.out.println("*****");
       //(1)连续打印5颗星
       for(int j=1; j<=5; j++){
          System.out.print("*");
       }
       //(2)换行
       System.out.println();
    }
    /*
    (1)int i=1;
    (2)i<=4;成立
    (3)外循环的循环体
       for(int j=1; j<=5; j++){
          System.out.print("*");
       }
       System.out.println();
       （4）内循环 int j=1;
       (5)j<=5成立
       (6)内循环的循环体   System.out.print("*");
       (7)j++  j=2
       (8)j<=5成立
       (9)内循环的循环体   System.out.print("*");
       (10)j++ j=3
       (11)j<=5成立
       (12)内循环的循环体   System.out.print("*");
       (13)j++ j=4
       (14)j<=5成立
       (15)内循环的循环体   System.out.print("*");
       (16)j++ j=5成立
       (17)j<=5成立
       (18)内循环的循环体   System.out.print("*");
       (19)j++ j=6
       (20)j<=5  不成立
       内循环第一轮结束

       System.out.println();
       外循环循环体才完成一次
    （21）i++  i=2
    (22)判断外循环的条件  i<=4;成立
    (23)执行外循环的循环体第二轮
       for(int j=1; j<=5; j++){
          System.out.print("*");
       }
       System.out.println();
       （24）内循环 int j=1;
       (25)j<=5成立
       (26)内循环的循环体   System.out.print("*");
       (27)j++  j=2
       (28)j<=5成立
       (29)内循环的循环体   System.out.print("*");
       (30)j++ j=3
       (31)j<=5成立
       (32)内循环的循环体   System.out.print("*");
       (33)j++ j=4
       (34)j<=5成立
       (35)内循环的循环体   System.out.print("*");
       (36)j++ j=5成立
       (37)j<=5成立
       (38)内循环的循环体   System.out.print("*");
       (39)j++ j=6
       (40)j<=5  不成立
       内循环第二轮结束

       System.out.println();
       外循环循环体才完成二次
    (41)i++  i=3
       .....
    
    */
```

```java
/**
 * break可以用于结束当前循环
 * break的用法：
 * （1）在switch中表示结束switch
 * （2）break在循环中，表示结束当前循环
 **/
public static void main(String[] args) {
    // 从键盘不断输入整数，统计正数、负数的个数，输入0结束
    Scanner input = new Scanner(System.in);

    int zheng = 0;
    int fu = 0;

    while (true) {
        System.out.println("请输入一个整数：");
        int num = input.nextInt();

        if (num > 0) {
            zheng++;
        } else if (num < 0) {
            fu++;
        } else {// num==0
            break;
        }
    }

    System.out.println("正数的个数：" + zheng);
    System.out.println("负数的个数：" + fu);
}
```



