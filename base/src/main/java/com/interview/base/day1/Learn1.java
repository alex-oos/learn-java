package day1;


/**
 * @ClassName Learn1
 * @Description 在写代码的过程中，常见的一种情况是需要某个整数类型变量增加 1 或减少 1，Java 提供了一种特殊的运算符，用于这种表达式，叫做自增运算符（++)和自减运算符（--）。
 * <p>
 * ++ 和 -- 运算符可以放在变量之前，也可以放在变量之后，当运算符放在变量之前时(前缀)，先自增/减，再赋值；当运算符放在变量之后时(后缀)，先赋值，再自增/减。例如，当 b = ++a 时，先自增（自己增加 1），再赋值（赋值给 b）；当 b = a++ 时，先赋值(赋值给 b)，再自增（自己增加 1）。也就是，++a 输出的是 a+1 的值，a++输出的是 a 值。用一句口诀就是：“符号在前就先加/减，符号在后就后加/减”。
 * @Author Alex
 * @Date 2022/6/4 18:17
 * @Version 1.0
 */
public class Learn1 {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("i = " + i);
        int tmp = ++i;
        System.out.println("tmp = " + tmp);
        int tmp1 = i++;
        System.out.println("tmp1 = " + tmp1);
    }


}
