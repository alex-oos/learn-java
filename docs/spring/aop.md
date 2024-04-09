[TOC]

# Spring 之AOP注解

## AOP思想:

AOP(Aspect Oriented Programming)
是一种面向切面的编程思想。面向切面编程是将程序抽象成各个切面，即解剖对象的内部，将那些影响了多个类的公共行为抽取到一个可重用模块里，减少系统的重复代码，降低模块间的耦合度，增强代码的可操作性和可维护性。AOP把软件系统分为两个部分：核心关注点和横切关注点。业务处理的主要流程是核心关注点，与之关系不大的部分是横切关注点。横切关注点的一个特点是，他们经常发生在核心关注点的多处，而各处都基本相似。比如权限认证、日志、事务处理、增强处理。

## AOP的使用场景:

权限认证、日志、事务处理、增强处理

## @Aspect的使用以及基本概念:

### 1.切面类

@Aspect： 定义切面类，加上@Aspect、@Component注解

```java

@Aspect
@Component
//设置注解执行的顺序
@Order(2)
public class AnnotationAspectTest {

}
```

### 2.切点 @Pointcut

```java
/**
 * 定义切点,切点为对应controller
 */
@Pointcut("execution(public * com.example.zcs.Aop.controller.*.*(..))")
public void aopPointCut() {

}
```

注：execution表达式第一个*表示匹配任意的方法返回值，第二个*表示所有controller包下的类，第三个*表示所有方法,第一个..表示任意参数个数。

### 3.Advice，

在切入点上执行的增强处理，主要有五个注解：

- @Before 在切点方法之前执行
- @After 在切点方法之后执行

- @AfterReturning 切点方法返回后执行
- @AfterThrowing 切点方法抛异常执行
- @Around 属于环绕增强，能控制切点执行前，执行后

### 4.JoinPoint ：

方法中的参数JoinPoint为连接点对象，它可以获取当前切入的方法的参数、代理类等信息，因此可以记录一些信息，验证一些信息等；

### 5.使用&&、||、!、三种运算符来组合切点表达式，表示与或非的关系；

### 6.@annotation(annotationType) 匹配指定注解为切入点的方法；

### 具体代码实现:

1.AopController，用于校验aop是否生效:

```java

@Controller
@RequestMapping("aop")
public class AopController {

    @RequestMapping("test")
    @ResponseBody
    public String aopTest(User user) {
        // System.out.println(user);
        System.out.println("aop测试");
        return "success";

    }

    @TestAnnotation(flag = false)
    @RequestMapping("aopAnnotationTest")
    @ResponseBody
    public String aopAnnotationTest(User user) {
        // System.out.println(user);
        System.out.println("aopAnnotationTest");
        return "success";

    }

}

```

2.AspectTest，具体的切面类，用于添加横切逻辑,切点使用execution表达式进行匹配

```java

@Aspect
@Component
// 设置注解执行的顺序
@Order(1)
public class AspectTest {

    /**
     * 定义切点,切点为对应controller
     */
    @Pointcut("execution(public * com.example.zcs.Aop.controller.*.*(..))")
    public void aopPointCut() {

    }

    @Before("aopPointCut()")
    public void testbefor(JoinPoint joinPoint) {

        illegalParam(joinPoint);
        System.out.println("执行方法之前执行。。。。。");
    }

    @After("aopPointCut()")
    public void testAfter(JoinPoint joinPoint) {
        // illegalParam(joinPoint);
        System.out.println("执行方法之后执行。。。。。");
    }

    /**
     * 获取请求参数
     *
     * @param joinPoint
     * @return
     */
    private static void illegalParam(JoinPoint joinPoint) {

        if (joinPoint == null) {
            return;
        }
        boolean flag = false;
        try {
            // 参数值
            Object[] args = joinPoint.getArgs();
            if (args != null) {
                for (Object o : args) {
                    System.out.println(o);

                }
            }
        } catch (Exception e) {
        }
    }

}

```

3.AnnotationAspectTest类，具体的切面类，用于添加横切逻辑,切点指定注解

```java

@Aspect
@Component
// 设置注解执行的顺序
@Order(2)
public class AnnotationAspectTest {

    /**
     * 定义切点,切点为添加了注解的方法
     */
    @Pointcut("@annotation(com.example.zcs.Aop.annotation.TestAnnotation)")
    public void aopPointCut() {

    }


    @Around("aopPointCut()")
    public Object Around(ProceedingJoinPoint point) throws Throwable {

        System.out.println("AnnotationAspectTest Around start ");
        // 获取注解和注解的值
        TestAnnotation annotation = getAnnotation(point);
        if (annotation != null) {
            boolean flag = annotation.flag();
            System.out.println("注解flags的值:" + flag);
        }

        // 获取参数
        Object[] args = point.getArgs();

        for (Object arg : args) {
            System.out.println("arg ==>" + arg);
        }

        // 去调用被拦截的方法
        Object proceed = point.proceed();

        return proceed;
    }

    // 获取注解
    public TestAnnotation getAnnotation(ProceedingJoinPoint point) {

        Signature signature = point.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method != null) {
            return method.getAnnotation(TestAnnotation.class);
        }
        return null;
    }

}

```

4.注解类TestAnnotation

```java

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestAnnotation {

    boolean flag() default true;

}
```

原文链接：https://blog.csdn.net/weixin_38860401/article/details/124908507
