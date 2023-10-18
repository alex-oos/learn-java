package day9thread;


/**
 * @ClassName TestThread
 * @Description
 * @Author Alex
 * @since 2022/6/17 15:41
 * @Version 1.0
 */
public class TestThread extends Thread {

    private int num = 0;

    /**
     *
     */
    @Override
    public void run() {
        num++;
        System.out.println(this.getName() + ":" + num);
    }
    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        testThread.setName("线程一");
        testThread.start();
        System.out.println("testThread.getName() = " + testThread.getName());
        System.out.println("testThread.getPriority() = " + testThread.getPriority());
        System.out.println("testThread.getId() = " + testThread.getId());

    }

}
