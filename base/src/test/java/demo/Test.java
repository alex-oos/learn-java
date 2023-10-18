package demo;

/**
 * @ClassName demo.Parameterpassing
 * @Description
 * @Author Alex
 * @since 2022/8/1 12:37
 * @Version 1.0
 */

@PriorityAnnotation()
public class Test extends  Base {

    @PriorityAnnotation("P0")
    private void caseDemo(){

        System.out.println("true  = " + true);

    }

    public static void main(String[] args) {
        Test test = new Test();
        PriorityAnnotation annotation =  Test.class.getAnnotation(PriorityAnnotation.class);
        System.out.println("annotation = " + annotation.value());
    }


}
