1、标识符的命名规则：

    1. Java的标识符只能用26个英文字母，大小写，数字0-9，美元符号（$),下划线（_）
    2. 数字不能开头
    3. 不能包含空格
    4. 严格区分大小写
    5. 不能使用关键字，保留字，特殊值

# 2、标识符的命名规范：

    1. 类名：每个单词的首字母必须大写，形式是XxxYyy
    2. 变量名、方法名等：第一个单词首字母小写，其余单词首字母大写
    3. 包名：所有单词都小写，形式是xxx.yyy.zzz
    4.常量：所有单词都要大写，形式XXX_YYY_ZZZ，例如：PI，MAX_VALUE
    - 总则：见名思意

3、变量的声明格式，变量的赋值格式，变量的三要素，变量应该注意几点

    - 变量的声明格式：数据类型 变量名；
    - 变量的赋值格式：变量名 = 值；
    - 变量的三要素： 数据类型 变量名 变量值
    - 变量的使用应该注意：
        1）先声明后使用
        2）使用之前必须赋初始化值
        3）变量的作用域
           作用:从声明处开始到所属的}结果
           同一个作用域中不能重复声明一个变量

4、java基本数据类型有哪些？

    1. 基本数据类型
       byte,short,int,long,float,double,char,boolean
    2. 引用数据类型
       类，接口，数组，枚举
       String 属于类 ，引用数据类型

5、java程序的开发步骤是什么？

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
     这个类必须包含main方法，main方法的格式是：public static void main(String[] arg[]0000)

## 运算符

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
