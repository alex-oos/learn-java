[TOC]

# Thread 线程

- 视频地址：https://www.bilibili.com/video/BV1LG4y1T7n2/?p=5&vd_source=e33a356475cf6a18a9f6345f4e44a209

- 代码demo：https://github.com/alex-oos/learn-java/blob/c30af8115f43ad97166f13ea9cbcdeb807ec30ae/base/src/main/java/com/liaoxuefeng/qThread/aThread/MyCallable.java#L19-L18

## 一、线程创建的三种方式

#### 方式一：继承Thread类的方式进行实现

1. 自己定义一个类继承Thread，其实Thread也是实现Runnable接口
2. 重写run方法
3. 创建子类的对象，并启动线程

```java
public class MyThread extends Thread {

    /**
     * * 线程实现的方式一：
     * * 1. 自己定义一个类继承Thread
     * * 2. 重写run方法
     * * 3. 创建子类的对象，并启动线程
     */

    private int x = 0;

    @Override
    public void run() {
        // 书写执行代码
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " x : " + (this.x++));
        }

    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // 线程名字可以通过 t.setName() 来设置
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
        System.out.println("main方法执行结束");
    }

}

```

#### 方式二：实现Runnable接口的方式进行实现

1. 自己定义一个类实现Runnable接口
2. 重写里面的run方法
3. 创建自己类的对象
4. 创建一个Thread类的对象，并开启线程

```java

@NoArgsConstructor
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 获取当前线程的名称
        String strName = Thread.currentThread().getName();
        // n值代表循环多少次
        int n = 11;
        for (int i = 0; i < n; i++) {
            System.out.println("当前线程的名字是：" + strName + "，第" + i + "次执行！");
        }

    }

    public static void main(String[] args) {

        // 创建myRunnable任务
        MyRunnable myRunnable = new MyRunnable();
        // 创建线程对象，将任务传递给线程
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.setName("线程一");
        t2.setName("线程二");
        // 开启线程
        t1.start();
        t2.start();

    }

}

```

#### 方式三：利用Callable接口和Future接口方式实现

1. 创建一个类MyCallable实现Callable接口
2. 重写call（是有返回值的，表示多线程运行的结果）
3. 创建MyCallable的对象（表示多线程要执行的任务）
4. 创建FutureTask对象（作用管理多线程运行的结果）
5. 创建Thread类的对象，并启动（表示线程）

```java
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        // 求 1-100的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;

    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建了一个MyCallable的对象，表示多线程要执行的任务
        MyCallable callable = new MyCallable();
        // 创建FutureTask对象（作用管理多线程运行的结果）
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //  创建线程的对象
        Thread t1 = new Thread(futureTask);
        // 启动线程
        t1.start();
        // 获取多线程运行的结果
        Integer result = futureTask.get();
        System.out.println(result);


    }


}
```

![thread](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread.png)

## 二、Thread中常见的成员方法：



![thread-methods](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-methods.png)

- String getName()  返回线程的名称

- void setName(String name) 设置线程的名字（构造方法也可以设置名称）

  > 细节：
  > 1、如果我们没有给线程设置名字，线程也是默认有名字的  格式：Thread-X(X是序号，从0开始)
  > 2、如果我们要给线程设置名称，可以用set 方法设置，也可以用构造方法设置
  
  ```java
  // 1、创建线程的对象，设置线程的名称
          MyThread t1 = new MyThread("飞机");
          MyThread t2 = new MyThread();
          // 设置线程的名称
          t2.setName("坦克");
          t1.start();
          t2.start();
  ```
  
  
  
- static Thread currentThread() 获取当前线程的对象
  >  细节：
  >  当JVM虚拟机启动之后，会自动的启动多线程，其中一条线程叫做main线程，他的作用就是调用main方法，并执行里面的代码，在以前我们写的所有代码，其实都在main线程中运行
  
  ```java
      public static void getThreadObject() {
          // 获取当前线程对象
          Thread t = Thread.currentThread();
          System.out.println("thread.getName() = " + t.getName());
          System.out.println("thread.getId() = " + t.getId());
      }
  ```
  
  
  
- static void sleep(long time)  让线程休眠指定的时间，单位为毫秒

  > 细节:
  >
  > 1、那条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
  >
  > 2、方法的参数：就表示睡眠的时间，单位毫秒，1秒=1000毫秒
  >
  > 3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码

  ```java
   public static void threadSleep() throws InterruptedException {
  
          System.out.println("111111");
          // 线程等待方法
          Thread.sleep(5000);
          System.out.println("RRRRRRRRR");
  
      }
  ```

  

- final void setPriority(int newPriority)  设置线程的优先级

- final int getPriority() 获取线程的优先级

  > 10 是最高优先级 ,Thread.MAX_PRIORITY 默认是 5  Thread.NORM_PRIORITY  1 是最低 Thread.MIN_PRIORITY

  ```java
      public static void threadPriority() {
          // 10 是最高优先级 ,Thread.MAX_PRIORITY 默认是 5  Thread.NORM_PRIORITY  1 是最低 Thread.MIN_PRIORITY
          // 设置为优先级，只是可以增加概率，并不能保证每次运行结果都是某个线程最先运行完毕
          Thread t = Thread.currentThread();
          System.out.println("默认优先级为：" + t.getPriority());
          t.setPriority(Thread.MAX_PRIORITY);
          t.setPriority(Thread.MIN_PRIORITY);
      }
  ```

  

- final void setDaemon(boolean on) 设置为守护线程

  > 细节：
  >
  > ​	   当其他的非守护线程执行完毕之后，守护线程会陆续结束

  ```java
      public static void threadDaemon() {
  
          // 当其他非守护线程执行完毕之后，守护线程会陆续结束
          // 创建两个线程
          MyThread thread1 = new MyThread();
          MyThread thread2 = new MyThread();
          thread1.setName("女神");
          thread2.setName("备胎");
          // 设置为守护线程
          thread2.setDaemon(true);
          thread1.start();
          thread2.start();
      }
  ```

- static native void yield() 礼让线程

- final void join() 插入线程 当该线程执行完毕之后，再执行其他线程

  ```java
      public static void threadJoin() throws InterruptedException {
  
          MyThread thread5 = new MyThread();
          thread5.setName("土豆");
          thread5.start();
          // 把t线程插入，当前线程
          // t:土豆
          // 当前线程：main线程
          thread5.join();
  
          //执行main线程中
          for (int i = 0; i < 10; i++) {
              System.out.println("main线程" + i);
          }
  
      }
  
  ```

  



## 三、Thread的生命周期

- New：新创建的线程，尚未执行；
- Runnable：运行中的线程，正在执行`run()`方法的Java代码；
- Blocked：运行中的线程，因为某些操作被阻塞而挂起；
- Waiting：运行中的线程，因为某些操作在等待中；
- Timed Waiting：运行中的线程，因为执行`sleep()`方法正在计时等待；
- Terminated：线程已终止，因为`run()`方法执行完毕。

图示如下：

```ascii
         ┌─────────────┐
         │     New     │
         └─────────────┘
                │
                ▼
┌ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┐
 ┌─────────────┐ ┌─────────────┐
││  Runnable   │ │   Blocked   ││
 └─────────────┘ └─────────────┘
│┌─────────────┐ ┌─────────────┐│
 │   Waiting   │ │Timed Waiting│
│└─────────────┘ └─────────────┘│
 ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─
                │
                ▼
         ┌─────────────┐
         │ Terminated  │
         └─────────────┘
```

线程终止的原因是：

- 线程正常终止：`run()`方法执行到`return`语句返回；
- 线程意外终止：`run()`方法因为未捕获的异常导致线程终止；
- 对某个线程的`Thread`实例调用`stop()`方法强制终止（强烈不推荐使用）。

join()：一个线程等待另一个线程，直到等待结束，可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；

对已经运行结束的线程调用`join()`方法会立刻返回。

interrupt() 中断线程，对线程的调用看她是否中断，isInterrupted（）标示获取自身是否中断，如果目标线程处于等待状态，该线程会抛出异常InterruptedException，一般线程处于中断状态，应该立刻结束自身线程，线程间共享变量需要使用`volatile`关键字标记，确保每个线程都能读取到更新后的变量值



## 四、线程池

### 异步ComletableFuture:

- 教程：https://www.bilibili.com/video/BV1S54y1u79K/?spm_id_from=333.337.search-card.all.click&vd_source=e33a356475cf6a18a9f6345f4e44a209
- 代码地址：https://github.com/Acyco/CompletableFuture


1. 分别是什么？然后如何使用？
