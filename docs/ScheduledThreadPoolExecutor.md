[TOC]



------



# ScheduledThreadPoolExecutor

## 一、概述

> java 中ScheduledExecutorService接口是基于线程池设计的定时任务类,每个调度任务都会分配到线程池中的一个线程去执行,也就是说,任务是并发执行,互不影响。
> 其中的一个实现类是ScheduledThreadPoolExecutor

(1)>ScheduledThreadPoolExecutor实现ScheduledExecutorService接口，实现了一些定时任务处理的方法。

(2)>ScheduledThreadPoolExecutor继承了ThreadPoolExecutor，可以通过线程池进行任务的管理和调度。

## 二、常用方法

### 1、schedule 方法

> 该方法的作用是提交一个延迟执行的任务，任务从提交时间算起延迟单位unit的deplay时间后执行，提交的不是周期任务，任务只会执行一次

```java
ScheduledFuture<?> schedule(Runnable var1, long period, TimeUnit var4);
ScheduledFuture<V> schedule(Callable<V> var1, long var2, TimeUnit var4);

```

参数解析：

- Runnable 需要运行的任务
- period  间隔时间
- unit参数是时间单元

代码demo：

```java
 ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);
  System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
// 使用的Runnable 匿名函数编写的
service.schedule(() -> {
            System.out.println("我是使用schedule方法执行");
            Thread thread = Thread.currentThread();
            System.out.println("我是间隔1s执行的任务，线程名称为：" + thread.getName() + ",线程ID为：" + thread.getId() + ",当前时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }, 1, TimeUnit.SECONDS);  // 延1秒后开始执行
```

```java
 ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);
 System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是使用schedule方法执行");
                Thread thread = Thread.currentThread();
                System.out.println("我是间隔1s执行的任务，线程名称为：" + thread.getName() + ",线程ID为：" + thread.getId() + ",当前时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 1, TimeUnit.SECONDS);  // 延1秒后开始执行
```

```java
ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);
//使用 Callable 实现，该实现有返回值，可以接收返回的数据
ScheduledFuture<Object> future = service.schedule(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("我是使用schedule方法执行");
                Thread thread = Thread.currentThread();
                System.out.println("我是间隔1s执行的任务，线程名称为：" + thread.getName() + ",线程ID为：" + thread.getId() + ",当前时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                return null;
            }
        }, 1, TimeUnit.SECONDS);// 延1秒后开始执行

        Object o = future.get();
        System.out.println(o);
```

输出结果为：

```tex
当前时间为：2024-03-18 14:31:01
我是使用schedule方法执行
我是间隔1s执行的任务，线程名称为：pool-1-thread-1,线程ID为：21,当前时间：2024-03-18 14:31:02
```



### 2、scheduleAtFixedRate方法

> 该方法相对起始时间点以固定频率调用指定的任务（fixed-rate任务)。当把任务提交到线程池并延迟initialDelay时间后开始执行任务command。然后从initialDelay+period时间点再次执行，而后在initialDelay+2*period时间点再次执行，循环往复，直到抛出异常或者调用了任务的cancel方法取消了任务，或者关闭了线程池。
>

参数讲解：

- command 任务实例
- initialDelay参数是初始化延迟时间
- period参数是间隔时间
- unit参数是时间单元

```java
public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)
```

（1）：当任务实例commod执行的时间小于延迟间隔时间delay情况

```java

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);

        System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("结束测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 5, 5, TimeUnit.SECONDS); // 延迟5秒后执行，每隔3秒执行一次
```

执行结果为：

```tex
当前时间为：2024-03-18 15:15:06
开始测试，当前时间为：2024-03-18 15:15:11
结束测试，当前时间为：2024-03-18 15:15:14
 #第二次执行时间是第一次时间 + period 即11 + 5 = 16；
开始测试，当前时间为：2024-03-18 15:15:16
结束测试，当前时间为：2024-03-18 15:15:19
```

​	（2）：当任务实例commod执行的时间大于间隔时间period情况

修改 TimeUnit.SECONDS.sleep(3); 为  TimeUnit.SECONDS.sleep(6);，执行查看运行结果！

执行结果为：

```
当前时间为：2024-03-18 15:19:57
开始测试，当前时间为：2024-03-18 15:20:02
结束测试，当前时间为：2024-03-18 15:20:08
开始测试，当前时间为：2024-03-18 15:20:09
结束测试，当前时间为：2024-03-18 15:20:15
```

总结
ScheduleAtFixedRate 每次执行时间为上一次任务开始起向后推一个时间间隔。分为两种情况：
（1）若command执行的时间小于period若每次执行时间为 :initialDelay, initialDelay+period, initialDelay+2*period, …；*

（2）若command执行的时间大于period，则command执行完，下一次任务将立即执行！下即下一次任务不会按照预期的时间间隔执行，每次执行时间为 :initialDelay, initialDelay+taskExecutorTIme, initialDelay+2*taskExecutorTIme, …；

taskExecutorTIme为任务执行的时间！

### 3.scheduleWithFixedDelay方法

> 该方法的作用是，当任务执行完毕后，让其延迟固定时间后再次运行（fixed-delay任务）。其中initialDelay表示提交任务后延迟多少时间开始执行任务command，delay表示当任务执行完毕后延长多少时间后再次运行command任务，unit是initialDelay和delay的时间单位。任务会一直重复运行直到任务中抛出了异常，被取消了，或者关闭了线程池。

参数：

- command参数是任务实例，
- initialDelay参数是初始换延迟时间，
- delay参数是延迟间隔时间，
- unit参数是时间单元
```java
public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
```
（1）：当任务实例commod执行的时间小于延迟间隔时间delay情况

```java
 ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                System.out.println("开始测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("结束测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 5, 3, TimeUnit.SECONDS); // 延迟5秒后执行，每隔3秒执行一次
```

执行结果：

```
当前时间为：2024-03-18 15:34:23
开始测试，当前时间为：2024-03-18 15:34:28
结束测试，当前时间为：2024-03-18 15:34:29
#第二次执行的时间 == 第一次任务开始时间+任务处理时间+delay延迟时间
#即 32 == 28 + 3秒 +  3秒 
开始测试，当前时间为：2024-03-18 15:34:32
结束测试，当前时间为：2024-03-18 15:34:33
```

（2）：当任务实例commod执行的时间大于延迟间隔时间delay情况

修改 TimeUnit.SECONDS.sleep(3); 为  TimeUnit.SECONDS.sleep(6);，执行查看运行结果！

```tex
当前时间为：2024-03-18 15:38:28
开始测试，当前时间为：2024-03-18 15:38:33
结束测试，当前时间为：2024-03-18 15:38:39
#第二次任务执行开始时间 == 第一次任务执行开始时间 + 任务处理的时间 + delay延迟时间
#即 42 == 33 + 6 + 3
开始测试，当前时间为：2024-03-18 15:38:42
结束测试，当前时间为：2024-03-18 15:38:48
```

3：总结
不管任务command执行的时间是多长，下一次任务的执行时间都是上一次任务执行完后在等待延迟间隔delay时间后执行下一次任务。
ScheduleWithFixedDelay 每次执行时间为上一次任务结束起向后推一个时间间隔，即每次执行时间为：initialDelay, initialDelay+executeTime+delay, initialDelay+2*executeTime+2*delay



## 三、ScheduledExecutorService的创建方式



参考地址：

https://www.cnblogs.com/xuwc/p/14053613.html