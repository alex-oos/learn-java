package day6reflection;


/**
 * @ClassName TargetObject
 * @Description
 * @Author Alex
 * @Date 2022/6/14 20:43
 * @Version 1.0
 */
public class TargetObject {

    private String value;


    public TargetObject() {
        this.value = "value";
    }

    public void publicMethod(String s) {
        System.out.println("s = " + s);
    }


    private void privateMethod() {
        System.out.println("this.value" + this.value);
    }

}
