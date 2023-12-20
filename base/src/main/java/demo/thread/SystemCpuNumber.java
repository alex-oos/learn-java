package demo.thread;

/**
 * @author: Alex
 * @date: 2023/9/18 下午3:01
 * @Descprition:
 */
public class SystemCpuNumber {

    public static void main(String[] args) {

        // 使用Runtime类获取当前Java虚拟机的实例
        Runtime runtime = Runtime.getRuntime();

        // 获取可用的处理器核心数，这通常是系统线程数的一个很好的估计
        int availableProcessors = runtime.availableProcessors();

        System.out.println("系统线程数: " + availableProcessors);

    }

}
