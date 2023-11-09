package priority;

/**
 * @ClassName demo.Parameterpassing
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2022/8/1 12:37
 */

@PriorityAnnotation("P2")
public class TestClass extends Base {


    @PriorityAnnotation("P0")
    private void caseDemo() {

        System.out.println("true  = " + true);

    }

    public static void main(String[] args) throws NoSuchMethodException {

        // 通过反射获取类上的注解
        PriorityAnnotation annotation = TestClass.class.getAnnotation(PriorityAnnotation.class);
        System.out.println("annotation = " + annotation.value());

        // 使用反射获取方法上的注解
        PriorityAnnotation caseDemo = TestClass.class.getDeclaredMethod("caseDemo").getAnnotation(PriorityAnnotation.class);
        System.out.println("caseDemo = " + caseDemo.value());
    }


}
