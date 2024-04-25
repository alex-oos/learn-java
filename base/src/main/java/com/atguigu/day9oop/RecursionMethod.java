package com.atguigu.day9oop;


/**
 * @author Alex
 * @since 2021/12/9 4:26 下午
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身。
 * 2. 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
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
