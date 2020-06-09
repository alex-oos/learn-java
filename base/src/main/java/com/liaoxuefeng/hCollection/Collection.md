### 集合（Collection）
    集合就是“由若干个确定的元素所构成的整体，定义在java.utill包中
    
#### 一、集合的分类：
1. List：一种有序列表的集合，例如，按索引排序的Student的List
2. Set：一种保证没有重复元素的集合，例如：所有无重复名称的Student的set
3. Map: 一种通过键值（key-value） 查找的映射表集合，例如，根据Student 的name查找对应Student的Map

#### 二、集合的特点：
1. 实现了接口和实现类相分离，例如，有序表的接口是List，具体的实现类是ArrayList，LinkedList等
2. 支持泛型，可以限制在一个集合中只能放入同一种数据类型的数据，例如
```java
    List<String> list = new ArrayList<>() //只能放入String类型
```
#### 三、集合的访问：
1. 使用迭代器（Iterator）,好处是无需知道集合内部是按照什么方式存储的
