package demo.other;

/**
 * <P>
 * 类加载顺序
 * </p>
 *
 * @author Alex
 * @since 2023/12/6 下午6:30
 */
public class ClassLoadOrder {                         // 1.第一步，准备加载类


    static int num;                    // 2.第二步，静态变量和静态代码块的加载顺序由编写先后决定

    static {                              // 3.第三步，静态块，然后执行静态代码块，因为有输出，故打印a
        System.out.println("静态代码块");
        num = 1;
    }

    int a = 5;                             // 6.第六步，按照顺序加载变量

    { // 成员变量第三个
        System.out.println("匿名代码块");           // 7.第七步，按照顺序打印c
    }

    public ClassLoadOrder() { // 类的构造函数，第四个加载
        System.out.println("构造函数");           // 8.第八步，最后加载构造函数，完成对象的建立
    }

    static void run()                    // 静态方法，调用的时候才加载// 注意看，e没有加载
    {

        System.out.println("静态方法");
    }

    public static void main(String[] args) {

        new ClassLoadOrder();

    }

}
