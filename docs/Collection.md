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
6. 获取元素第一次出现位置： int indexof(Object var1)
6. 获取元素最后一次出现位置：int lastIndexOf(Object var1)
6. 将此集合中指定索引位置的元素修改为 element 参数指定的对象。 此方法返回此集合中指定索引位置的原元素:E set(int index,
   Eelement)
10. 返回一个新的集合，新集合中包含 fromlndex 和 tolndex 索引之间的所有元素。包含 fromlndex 处的元素，不包含 tolndex
    索引处的元素:List<E> subList(int fromlndex, int tolndex)
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

​       

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

        String key2 = "a";
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

> SortedMap保证遍历时以key的顺序来进行排序，例如放入的key是"apple"、”pear“."orange"，遍历的顺序一定是"apple"、”orange“、”pear“，因为String 默认按照字母进行排序，它的实现类是：TreeMap

```java
 Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
```

**注意：使用TreeMap，放入的Key必须实现Comparable接口，String、Integer 这些类都已经实现Comparable 接口。因此可以直接作为Key使用。作为Value的对象则没有任何要求。如果作为Key的class没有实现`Comparable`接口，那么，必须在创建`TreeMap`时同时指定一个自定义排序算法：**

```java
public class Main {
    public static void main(String[] args) {
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(map.get(new Person("Bob"))); // 2
    }
}

class Person {
    public String name;
    Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "{Person: " + name + "}";
    }
}

```

> 注意到`Comparator`接口要求实现一个比较方法，它负责比较传入的两个元素`a`和`b`，如果`a<b`，则返回负数，通常是`-1`，如果`a==b`，则返回`0`，如果`a>b`，则返回正数，通常是`1`。`TreeMap`内部根据比较结果对Key进行排序。
>
> 从上述代码执行结果可知，打印的Key确实是按照`Comparator`定义的顺序排序的。如果要根据Key查找Value，我们可以传入一个`new Person("Bob")`作为Key，它会返回对应的`Integer`值`2`。
>
> 另外，注意到`Person`类并未覆写`equals()`和`hashCode()`，因为`TreeMap`不使用`equals()`和`hashCode()`。

#### 六、Set

> Set用于存储不重复的元素集合

set 有以下几种方法：

1. boolean add(E,e):将元素添加到Set中
2. boolean remove（Object e） 删除
3. boolean contains（Object e）判断是否包含元素

```java
 		Set<String> set = new HashSet<>();
        System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false，添加失败，因为元素已存在
        System.out.println(set.contains("xyz")); // true，元素存在
        System.out.println(set.contains("XYZ")); // false，元素不存在
        System.out.println(set.remove("hello")); // false，删除失败，因为元素不存在
        System.out.println(set.size()); // 2，一共两个元素
```

`**Set`的元素和`Map`的key类似正确实现`equals()`和`hashCode()`方法，否则该元素无法正确地放入`Set`**

##### 1.HashSet

> HashSet 是无序的，实现了Set接口，但是没有实现SortedSet接口

##### 2. TreeSet

> TreeSet是有序的，实现了SortedSet接口,添加的元素必须正确实现`Comparable`接口，如果没有实现`Comparable`接口，那么创建`TreeSet`时必须传入一个`Comparator`对象。

```java
public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("orange");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
```

#### 七、Queue

> Queue(队列)，实现了先进先出的有序表，

Queue与List的区别：

1. List可以在任意位置添加元素
2. Queue只能将元素添加到队列末尾，从队列头部取出元素

Queues方法：

1. int size():获取队列长度

2. boolean add(E)/boolean offer(E)：添加元素，调用`add()`方法，当添加失败时（可能超过了队列的容量），它会抛出异常，调用`offer()`方法来添加元素，当添加失败时，它不会抛异常，而是返回`false`

3. E remove()/E poll()： 获取队首元素并从队列中删除，`Queue`是一个空队列，调用`remove()`方法，它会抛出异常，`poll()`方法来取出队首元素，当获取失败时，它不会抛异常，而是返回`null`：

4. E element()/E peek()：获取队首元素但并不从队列中删除。

   ```
   public class Main {
       public static void main(String[] args) {
           Queue<String> q = new LinkedList<>();
           // 添加3个元素到队列:
           q.offer("apple");
           q.offer("pear");
           q.offer("banana");
           // 队首永远都是apple，因为peek()不会删除它:
           System.out.println(q.peek()); // apple
           System.out.println(q.peek()); // apple
           System.out.println(q.peek()); // apple
       }
   }
   ```

##### 1. PriorityQueue:

> `PriorityQueue`实现了一个优先队列：从队首获取元素时，总是获取优先级最高的元素

区别：

`PriorityQueue`实现了一个优先队列：从队首获取元素时，总是获取优先级最高的元素

**注意：`PriorityQueue`默认按元素比较的顺序排序（必须实现`Comparable`接口），也可以通过`Comparator`自定义排序算法（元素就不必实现`Comparable`接口）。**

```java
public class Main {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}

```

##### 2.Deque

> 允许两头都进，两头都出，这种队列叫双端队列（Double Ended Queue），学名`Deque`

特点：

- 既可以添加到队尾，也可以添加到队首；
- 既可以从队首获取，又可以从队尾获取。

`Deque`实现了一个双端队列（Double Ended Queue），它可以：

>  将元素添加到队尾或队首：addLast()/offerLast()/addFirst()/offerFirst()；
> 从队首／队尾获取元素并删除：removeFirst()/pollFirst()/removeLast()/pollLast()；
> 从队首／队尾获取元素但不删除：getFirst()/peekFirst()/getLast()/peekLast()；
> 总是调用xxxFirst()/xxxLast()以便与Queue的方法区分开；
> 避免把null添加到队列。

```java
    Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerFirst("C");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
```

**我们发现`LinkedList`真是一个全能选手，它即是`List`，又是`Queue`，还是`Deque`。但是我们在使用的时候，总是用特定的接口来引用它，这是因为持有接口说明代码的抽象层次更高，而且接口本身定义的方法代表了特定的用途。**



#### 八、Stack

> 栈（Stack）是一种先进后出的数据结构

##### 1.Stack只有入栈和出栈的操作：

- 把元素压栈：push（E）
- 取栈顶的元素"弹出"：pop（E）
- 取栈顶的元素但是不弹出：peek（E）

##### 2.Deque实现Stack的功能：

- 把元素压栈：push（E）/addFirst(E)
- 把栈顶元素弹出：pop(E)/removeFirst()
- 取栈顶元素但不弹出：pop(E)/peekFirst()

##### 3.Stack的用途：

整数进行进制的转换就可以利用栈。

```java
public class Main {

    /*
     * 栈（Stack） 是一种现后进后出的数组结构
     * */
    public static void function() {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }

    }

    static String toHex(int n) {
        Deque<String> deque = new LinkedList<>();
        String result = "";
        int remain = n;
        while (n < 16) {
            remain = n % 16;
            deque.push(Integer.toHexString(remain));
            n = n / 16;
        }
        deque.push(Integer.toHexString(n));
        while (!deque.isEmpty()) {
            result += deque.pop();
        }
        return result;

    }

    public static void main(String[] args) {
        function();
    }

```



#### 九、Collections

> `ollections`是JDK提供的工具类，同样位于`java.util`包中。它提供了一系列静态方法，能更方便地操作各种集合

#####  Collections 的用法：

1. 创建空集合

   1. 创建空List：`List<T> emptyList()`
   2. 创建空Map：`Map<K, V> emptyMap()`
   3. 创建空Set：`Set<T> emptySet()`

   ```java
   List<String> list1 = List.of();
   List<String> list2 = Collections.emptyList();
   ```

   

2. 创建单元素集合

   1. 创建一个元素的List：`List<T> singletonList(T o)`
   2. 创建一个元素的Map：`Map<K, V> singletonMap(K key, V value)`
   3. 创建一个元素的Set：`Set<T> singleton(T o)`

   ```java
   List<String> list1 = List.of("apple");
   List<String> list2 = Collections.singletonList("apple");
   ```

   

3. 不可变集合

   1. 封装成不可变List：`List<T> unmodifiableList(List<? extends T> list)`
   2. 封装成不可变Set：`Set<T> unmodifiableSet(Set<? extends T> set)`
   3. 封装成不可变Map：`Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m)`

   ```java
    List<String> mutable = new ArrayList<>();
           mutable.add("apple");
           mutable.add("pear");
           // 变为不可变集合
           List<String> immutale = Collections.unmodifiableList(mutable);
           immutale.add("orange");
   ```

   **变为不可以变集合就不能添加元素了，所以以上代码会报错**

4. 线程安全集合

   1. 线程安全的List：`List<T> synchronizedList(List<T> list)`
   2. 线程安全的Set：`Set<T> synchronizedSet(Set<T> s)`
   3. 线程安全的Map：`Map<K,V> synchronizedMap(Map<K,V> m)`

5. 排序：Collections`可以对`List`进行排序。因为排序会直接修改`List`元素的位置，因此必须传入可变`List

   ```java
   Collections.sort(list);
   ```

   ```java
   List<String> list = new ArrayList<>();
           list.add("apple");
           list.add("pear");
           list.add("orange");
   		//排序前
           System.out.println(list);
           //排序
           Collections.sort(list);
           // 排序后
           System.out.println(list);
   ```

6. 洗牌

   ```java
           Collections.shuffle(list);
   ```
   
   ```java
    List<Integer> list = new ArrayList<>();
           for (int i = 0; i < 10; i++) {
               list.add(i);
           }
           // 洗牌前：
           System.out.println(list);
   		// 洗牌
           Collections.shuffle(list);
           //洗牌后
           System.out.println(list);
   ```
   
   
   
   
   
   ​	
