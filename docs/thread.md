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

### 1. String getName()  返回线程的名称

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

### 2. static Thread currentThread() 获取当前线程的对象

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

### 3. static void sleep(long time)  让线程休眠指定的时间，单位为毫秒

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

### 4. final void setPriority(int newPriority)  设置线程的优先级

### 5. final int getPriority() 获取线程的优先级

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

### 6. final void setDaemon(boolean on) 设置为守护线程

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

### 7. static native void yield() 礼让线程

### 8. final void join() 插入线程 当该线程执行完毕之后，再执行其他线程

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

## 三、Thread的生命周期（包含线程状态）

![thread-life-cycle](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-life-cycle.png)

![thread-status](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-status.png)

- New：新建：新创建的线程，尚未执行；
- Runnable： 就绪：运行中的线程，正在执行`run()`方法的Java代码；
- Blocked：阻塞：运行中的线程，无法获取锁对象被阻塞而挂起；
- Waiting：等待：运行中的线程，因为某些操作在等待中；
- Timed Waiting：计时等待：运行中的线程，因为执行`sleep()`方法正在计时等待；
- Terminated：死亡：线程已终止，因为`run()`方法执行完毕。

线程终止的原因是：

- 线程正常终止：`run()`方法执行到`return`语句返回；
- 线程意外终止：`run()`方法因为未捕获的异常导致线程终止；
- 对某个线程的`Thread`实例调用`stop()`方法强制终止（强烈不推荐使用）。

join()：一个线程等待另一个线程，直到等待结束，可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；

对已经运行结束的线程调用`join()`方法会立刻返回。

interrupt() 中断线程，对线程的调用看她是否中断，isInterrupted（）标示获取自身是否中断，如果目标线程处于等待状态，该线程会抛出异常InterruptedException，一般线程处于中断状态，应该立刻结束自身线程，线程间共享变量需要使用`volatile`关键字标记，确保每个线程都能读取到更新后的变量值

## 四、线程安全

### 1. 同步代码块

> 把操作共享的自动代码锁起来，运行完毕则释放锁

- 格式

```java
synchronized(锁){
        操作共享数据的代码
        }
```

特点：

- 锁默认打开，有一个线程进去了，锁默认关闭
- 里面的代码全部执行完毕，线程出现，锁自动打开

代码demo:

```java
public class MyThread extends Thread {
    // 业务场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票
    // 存在3个问题：
    // 1、三个窗口在售卖同一张票
    // 2、票会被超卖
    // 最终原因：线程的随机性，随机执行的时候会进行抢夺资源，导致变量ticket没有被修改，从而售卖同一张票
    // 解决方案：线程A售卖票1的时候将其锁住，线程A售卖完毕，然后再让B进行售卖其他票，从而开始使用同步代码块

    static int ticket = 0;  // 0-99

    // 锁对象，锁对象必须是唯一的，加入static 变成一个唯一值
    static Object object = new Object();

    @Override
    public void run() {

        while (true) {
            // 同步代码块
            // 锁一个对象 一般使用的是当前类的字节码，用其保证唯一
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(this.getName() + ",正在售卖，第" + ticket + "张票！");
                } else {
                    System.out.println("票已经售罄！");
                    break;
                }
            }
        }
    }

}
```

### 2.同步方法

> 就是将synchronized 关键字加到方法上

格式：

```java
修饰符 synchronized 返回值类型 方法名（方法参数）{}
```

特点：

- 同步方法是锁住方法里面所有的代码
- 锁对象不能自己指定，如果是非静态，则是this， 如果是静态，则是当前类的字节码文件对象

  代码demo：

```java
public class MyRunnable implements Runnable {

    // 场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票
    // 使用同步方法来实现

    // 定义的共享数据
    int ticket = 0;
    // 1.循环
    // 2.同步代码块，同步方法
    // 3.判断共享数据是否到达了末尾，如果到了末尾就结束

    @Override
    public void run() {

        while (true) {
            if (method()) break;
        }

    }

    private synchronized boolean method() {

        if (ticket < 100) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "：正在售卖第" + ticket + "张票！");
        } else {
            System.out.println("票已经售罄！");
            return true;
        }
        return false;
    }
}

```

### 3.Lock锁

> lock锁 比synchronized 提供了更多的操作规范，可以手动释放锁，手动加锁

常用的方法：

- void lock():获取锁
- void unlock():释放锁

使用:

> Lock是接口不能实例化，这里采用它的实现类ReentrantLock实例化，ReentrantLock的构造方法ReentrantLock() ：创建一个ReentrantLock实例

代码demo：

```java
public class MyCallable implements Callable<Integer> {

    // 场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票

    static int ticket = 1;

    // 定义了一个锁lock，静态的是为了防止多线程锁不生效，这里使用的Callable接口实现，不需要添加静态，因为这个Callable的实现类是共用的
    static   lock = new ReentrantLock();

    @Override
    public Integer call() throws Exception {

        while (true) {
            // 手动加锁
            lock.lock();
            // 这里使用try  catch  finally 是为了保证每次运行完，一定释放锁，不然锁没有被释放，占用资源
            try {
                if (ticket > 100) {
                    break;
                } else {
                    TimeUnit.MILLISECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "：正在售卖第" + ticket + "张票！");
                    ticket++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // 手动释放锁
                lock.unlock();
            }

        }
        return 0;
    }

}
```

## 五、死锁

> 死锁是指两个或两个以上的进程（线程）在执行过程中，由于竞争资源或者由于彼此通信而造成的一种阻塞的现象，若无外力作用，它们都将无法推进下去。此时称系统处于死锁状态或系统产生了死锁，这些永远在互相等待的进程（线程）称为死锁进程（线程）。

形成死锁的条件：

（1）互斥条件：线程(进程)对于所分配到的资源具有排它性，即一个资源只能被一个线程(进程)占用，直到被该线程(进程)释放

（2）请求与保持条件：一个线程(进程)因请求被占用资源而发生阻塞时，对已获得的资源保持不放。

（3）不剥夺条件：线程(进程)已获得的资源在末使用完之前不能被其他线程强行剥夺，只有自己使用完毕后才释放资源。

（4）循环等待条件：当发生死锁时，所等待的线程(进程)必定会形成一个环路（类似于死循环），造成永久阻塞

代码演示：

```java
public class DeadLockDemo {
    private static final Object resource1 = new Object();//资源 1
    private static final Object resource2 = new Object();//资源 2

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程 1").start();
        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + "get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "get resource1");
                }
            }
        }, "线程 2").start();
    }
}
```

## 六、生产者和消费者（等待唤醒机制）

> 生产者消费者模式是一个十分经典的多线程协作的模式

### 1. 常见方法

    - void wait():  当前线程等待，直到被其他线程唤醒
    - void notity():  随机唤醒单个线程
    - void notifyAll(): 唤醒所有线程

### 2. 思路分析

![thread-wait-notify](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-wait-notify.png)

### 3. 代码演示

```java
```

### 4. 等待唤醒机制（阻塞队列方式来实现）

实现思路：

![thread-blockingqueue-1](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-blockingqueue-1.png)

具体实现类

- ArrayBlockingQueue,有界阻塞队列，底层是一个数组，必须需要指定大小实现方式如下

```java
    public static void arrayBlockQueue(){
        // 创建了一个有界阻塞队列，并且指定大小为1，必须指定大小
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);
        try{
        // 向队列里面存放了一条数据
        queue.put("面条");
        }catch(InterruptedException e){
        throw new RuntimeException(e);
        }
        try{
        // 从队列中取出数据
        String take=queue.take();
        System.out.println(take);
        }catch(InterruptedException e){
        throw new RuntimeException(e);
        }

        }
```

- LinkedBlockingQueue 无界数组，最大值为int的最大值，

```java
    public static void linkedBlockingQueue(){

        LinkedBlockingQueue<String> queue=new LinkedBlockingQueue<>(1);
        try{
        // 存放数据
        queue.put("数据");
        }catch(InterruptedException e){
        throw new RuntimeException(e);
        }
        String take=null;
        try{
        // 取出数据
        take=queue.take();
        }catch(InterruptedException e){
        throw new RuntimeException(e);
        }
        System.out.println(take);
        }
```

![thread-blockingqueue](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-blockingqueue.png)

## 十、线程池

创建线程池的步骤：

1. 创建线程池

2. 提交任务

3. 所有的任务全部执行完毕，关闭线程池（在实际开发中，线程池不用关闭，服务器中静态变量初始化好连接池，所以不能关闭）

### （一）创建线程池三种方式：

![threadpool](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/threadpool.png)

```java
/**
     * 方式一：缓存线程池 缓存类型，大小不受限制
     */
    public static void cashedThreadPool() {

        // 1、创建一个可缓存的线程池对象
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        // 2、线程池提交任务，里面需要传一个线程的任务，Runnable 接口和 Callable接口均可以，这里使用的是匿名对象的方式来实现
        cachedThreadPool.submit(new Runnable() {
            @Override
            public void run() {

                for (int j = 0; j < 5; j++) {
                    System.out.println(Thread.currentThread().getName() + "-----" + j);
                }
            }
        });

        // 3.关闭线程池，
        cachedThreadPool.shutdown();

    }

```

```java
  public static void fixThreadPool() {

        int numberOfThreads = 3; // 指定线程池中的线程数量
        // 创建一个固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        // 提交任务给线程池 10个线程，每个线程执行10次
        for (int i = 0; i < 5; i++) {
            // 提交任务
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + "  " + j);
                    }
                }
            });

        }
        // 关闭任务：它会等待正在执行的任务先完成，然后再关闭
        executorService.shutdown();
    }
    /**
     * 方式二：singleThreadPoolExecutor 单线程池
     * /单线程化
     */

    public static void singleThreadPoolExecutor() {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            singleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + "  " + j);
                    }
                }
            });
        }

        singleThreadExecutor.shutdown();

    }
```

线程池主要核心原理

- 创建一个池子，池子中是空的
- 提交任务时，池子会创建新的线程对象，任务执行完毕，线程归还池子下回再次提交任务时，不需要创建新的线程，直接复用已有的线程即可
- 但是如果提交任务时，池子中没有空闲线程，也无法创建新的线程，任务就会排队等待

### （二）自定义线程池：

使用 ThreadPoolExecutor构造函数创建 (推荐使用这种方式）

- corePoolSize:核心线程数
- maximumPoolSize:最大线程数 (最大线程数 = 核心线程数 + 非核心线程数)
- keepAliveTime:线程空闲时间（值）
- unit: 参数keepAliveTime的时间单位，比如秒，分，小时，天等 TimeUnit.SECONDS,TimeUnit.MINUTES,TimeUnit.HOURS,TimeUnit.DAYS
  等等,其实就是空闲时间（单位）
- workQueue:任务队列
  1. linkedBlockingQueue (无界队列) ：队列长度不受限制，当请求越来越多时(任务处理速度跟不上任务提交速度造成请求堆积)
  可能导致内存占用过多OOM
  2. ArrayBlockingQueue,（有界队列） 队列长度受限，当队列满了就需要创建多余的线程来执行任务
  3. SynchronousQueue,（同步移交队列） 队列不作为任务的缓冲方式，可以简单理解为队列长度为零
- threadFactory:线创建线程的工厂类，（其实就是创建线程的方式）默认使用Executors.defaultThreadFactory()
  ，也可以使用guava库的ThreadFactoryBuilder来创建，一般默认实现了，不用传递

- 饱和策略或拒绝策略

    1. AbortPolicy：中断抛出异常

    2. DiscardPolicy：默默丢弃任务，不进行任何通知

    3. DiscardOldestPolicy：丢弃掉在队列中存在时间最久的任务

    4. CallerRunsPolicy：让提交任务的线程去执行任务(对比前三种比较友好一丢丢)

![thread-policy](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/thread-policy.png)

线程池执行任务的过程：

1. 当线程数小于核心线程数，创建线程

2. 当线程数大于等于核心线程数，且任务队列未满时，将任务放到任务队列中

3. 当线程大于等于核心线程数，且任务队列已满

4. 若线程数小于最大线程数，创建线程

5. 若线程数等于最大线程数，抛出异常，拒绝任务

   ![threadpool-wrok](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/threadpool-wrok.png)

所有参数的默认值：

- corePoolSize=1
- queueCapacity=Integer.MAX_VALUE
- maxPoolSize=Integer.MAX_VALUE
- keepAliveTime=60s
- allowCoreThreadTimeout=false
- rejectedExecutionHandler=AbortPolicy()

如何设置,需要根据几个参数来决定

- task:每秒的任务数，假设为1000

- taskcost：每个任务花费时间，假设为0.1s

- responsetime：系统允许容忍的最大响应时间，假设为1s * 做几个计算

- corePoolSize =每秒需要多少个线程处理？

  一颗CPU核心同一时刻只能执行一个线程，然后操作系统切换上下文，核心开始执行另一个线程的代码，以此类推，超过cpu核心数，就会放入队列，如果队列也满了，就另起一个新的线程执行，所有推荐：
  corePoolSize =((cpu核心数 * 2) + 有效磁盘数)，java可以使用Runtime.getRuntime().availableProcessors()获取cpu核心数

- queueCapacity =* (coreSizePool/taskcost)*responsetime * 计算可得
  queueCapacity = corePoolSize/0.1*
  1。意思是队列里的线程可以等待1s，超过了的需要新开线程来执行。切记不能设置为Integer.MAX_VALUE，这样队列会很大，线程数只会保持在corePoolSize大小，当任务陡增时，不能新开线程来执行，响应时间会随之陡增。

- maxPoolSize = (max(tasks)-queueCapacity)/(1/taskcost) * 计算可得 maxPoolSize = (1000-corePoolSize)/10，即(
  每秒并发数-corePoolSize大小) / 10 *

  （最大任务数-队列容量）/每个线程每秒处理能力 = 最大线程数 -
  rejectedExecutionHandler：根据具体情况来决定，任务不重要可丢弃，任务重要则要利用一些缓冲机制来处理

- keepAliveTime和allowCoreThreadTimeout采用默认通常能满足 计算密集型线程池：数量一般为 N+1个 N为CPU核心数
  IO密集型：数量一般为：2N + 1个 N为CPU核心数

#### 演示：

```java

    // 获取服务器的cpu个数
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int COUR_SIZE = CPU_COUNT * 2;
    private static final int MAX_COUR_SIZE = CPU_COUNT * 4;

    public static void threadPoolExecutorTest() {
        long keepAliveTime = 1L;
        // 创建线程池
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(COUR_SIZE, MAX_COUR_SIZE, keepAliveTime,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(100),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
        // 提交任务
        threadPoolExecutor.execute(() -> {
            try {
                Thread.sleep(3 * 1000);
                System.out.println("任务1执行线程：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threadPoolExecutor.execute(() -> {
            System.out.println("任务2执行线程：" + Thread.currentThread().getName());
        });
        // 立刻关闭线程池  shutdownNow() 立刻关闭线程池，不管任务是否执行完毕
        threadPoolExecutor.shutdown();

    }
```

自定义线程池小结

1. 创建一个空的池子
2. 有任务提交时，线程池会创建线程去执行任务，执行完毕归还线程

不断地提交任务，会有三个临界点：

1. 当核心线程满时，再提交任务就会排队
2. 当核心线程满，队伍满时，会创建临时线程
3. 当核心线程满，队伍满，临时线程满时，会触发任务拒绝策略
