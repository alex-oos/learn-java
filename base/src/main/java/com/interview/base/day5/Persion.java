package day5;


/**
 * @ClassName Persion
 * @Description
 * @Author Alex
 * @Date 2022/6/12 22:35
 * @Version 1.0
 */
public class Persion {

    public Persion(String name) {
        this.name = name;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void swap(Persion persion1, Persion persion2) {
        Persion tmp = persion1;
        persion1 = persion2;
        persion1 = tmp;
        System.out.println("persion1.getName = " + persion1.getName());
        System.out.println("persion2.getName = " + persion2.getName());
    }

    
    public static void main(String[] args) {
        Persion xiaoZhang = new Persion("小张");
        Persion xiaoLi = new Persion("小李");
        swap(xiaoZhang, xiaoLi);
        System.out.println("xiaoZhang.getName() = " + xiaoZhang.getName());
        System.out.println("xiaoLi.getName() = " + xiaoLi.getName());

    }

}
