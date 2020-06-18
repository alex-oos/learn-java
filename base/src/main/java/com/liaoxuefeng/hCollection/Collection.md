[TOC]



### 集合（Collection）

> 集合就是“由若干个确定的元素所构成的整体，定义在java.utill包中

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
> 使用迭代器（Iterator）,好处是无需知道集合内部是按照什么方式存储的.
> Iterator对象有两个方法：boolean hasNext()判断是否有下一个元素，E next()返回下一个元素。因此，使用Iterator遍历List代码如下：
```java

public static void main(String[] args){
        // List接口提供的of()方法，根据给定元素快速创建List：
        List<Integer> integerList = List.of(1, 2, 5);

        // 使用Iterator 遍历list
        for (Iterator<Integer> integerIterator = integerList.iterator(); 			           integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            System.out.println("next = " + next);

        }
  
}
       
```
#### 四、List
> List是一种有序列表,可以允许重复
##### 1. List<E> 接口方法：

1. 在末尾添加一个元素：void add(E e)
2. 在指定索引添加一个元素：void add(int index, E e)
3. 删除指定索引的元素：int remove(int index)
4. 删除某个元素：int remove(Object e)
5. 获取指定索引的元素：E get(int index)
6. 获取链表大小（包含元素的个数）：int size()
```java
  List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(0, "banner");
        list.add(1, "apple");
        list.remove(0);
        list.remove("apple");
        list.get(0);
        list.size();
        System.out.println("list = " + list);
        System.out.println("list = " + list.size());

```



#####  2.  List的实现方式：

###### 		1. List接口提供的of()方法

```java
     // List接口提供的of()方法，根据给定元素快速创建List：
        List<Integer> integerList = List.of(1, 2, 5);
```

###### 		2. ArrayLIst

> 动态数组实现的非线程安全的集合

```java
        List<String> list = new ArrayList<>();

```

###### 		3.LinkList

> 基于链表实现的非线程安全的集合。

```java
        List<String> list1 = new LinkedList<>();

```



##### 3.遍历List

> 使用迭代器，Iterator，`Iterator`对象有两个方法：`boolean hasNext()`判断是否有下一个元素，`E next()`返回下一个元素。因此，使用`Iterator`遍历`List`代码如下

```java
 List<String> list = List.of("apple", "pear", "banana");
		//Iterator 遍历
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
		//for each 遍历
  for (String s : list) {
            System.out.println(s);
        }

```

#### 五、Map

> Map<K,V> 是一种键值映射表，存储方式时key，Value格式

特点：

- ##### map 中key是不能重复的，vaule是可以重复的

- Map是无序的，遍历的时候不能保证其顺序

- Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉

   遍历map：

> 对`Map`来说，要遍历`key`可以使用`for each`循环遍历`Map`实例的`keySet()`方法返回的`Set`集合，它包含不重复的`key`的集合

```java
 // for each 使用 Map实例的keySet()遍历出
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
        // for each 使用 Map的entrySet()集合，它包含每一个key-value映射：
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
```



##### 1.HashMAp 的使用：

> ##### 作为key必须覆写equals() 和hashCode()方法

使用`Map`必须保证：

1. 作为`key`的对象必须正确覆写`equals()`方法，相等的两个`key`实例调用`equals()`必须返回`true`；

2. 作为`key`的对象还必须正确覆写`hashCode()`方法，且`hashCode()`方法要严格遵循以下规范：

   ​	a: 如果equals()返回true，则hashCode()返回值必须相等

   ​	b: 如果equals()返回false，则hashcode()返回值尽量不要相等

```java
  String key1 = "a";
        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 123);

        String key2 = new String("a");
        map.get(key2); // 123

        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
```

##### 2.EnumMap的使用:

>  在内部以一个非常紧凑的数组存储value，并且根据`enum`类型的key直接定位到内部数组的索引，并不需要计算`hashCode()`，不但效率最高，而且没有额外的空间浪费。

```java
  Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
```



##### 3. SortedMap()的使用：

> SortedMap保证遍历时以key的顺序来进行排序，例如放入的key是"apple"、”pear“."orange"，遍历的顺序一定是"apple"、”orange“、”pear“，因为String 默认按照字母进行排序

```java
 Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
```

