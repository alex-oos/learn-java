[TOC]

# 数组（Array）

## 一、数组概念
数组：

- 通俗的讲：一组数
- 本质上：数组是一个容器，用来装数据

数组(array)的定义：（了解）
    就是把一组相同数据类型的数据，按照一定的顺序排列，组合到一起。
    我们把这组相同数据类型的变量，数据，用一个统一的名称进行管理。这个统一的名称，叫做数组名。
    其中的每一个数据我们称为元素(element)，如何表示一个元素，通过下标，索引（index）
    这个数组的元素的个数，我们称为数组的长度（length)

## 二、如何声明一个数组
语法格式：
    元素的数据类型[] 数组名;

## 三、如何为数组初始化
### 1、数组本身初始化：
​    确定数组的长度，确定元素的个数
​    本质上，申请一整块连续的空间，用来装数据

    语法格式：
       数组名 = new  元素的数据类型[数组的长度];
### 2、数组的元素初始化
​    如果数组的元素不赋值，有初始值，有默认初始值。

    数据类型：
    基本数据类型（8种）
    引用数据类型：类、接口、数组、枚举
    
    byte,short,int,long ： 默认为0
    float,double：0.0
    boolean：false
    char：\u0000  Unicode编码值为0的字符
    引用类型：默认为null
    
    也可以手动初始化。

#### 2.1 一维数组

语法格式：
   数组名[下标] = 值;

```java
// 动态初始化
int[] arr = new int[3]; // 定义一个数组并且给定其长度，目前默认数值都是0 这是属于动态初始化
arr[0] = 3;
arr[1] = 9;
arr[2] = 8;
// 静态初始化
int[] arr[] = new int[]{3,9,8}; // 定义一个数组，并且赋值，这属于静态初始化
```

```java
    public static void main(String[] args){
        //请组长把本组的每一个学员的成绩，录入，并保存
        //后续可能需要，找最高分，最低分，排序，....

        //这么做不方便后面的统一管理，例如：排序等
		/*
		int s1 = 89;
		int s2 = 87;
		int s3 = 56;
		*/

        //int a;//声明变量

        //int[] scores;//声明数组
        //scores = new int[5];//数组的初始化，确定数组的长度，一共可以装5个int的整数

        //元素的数据类型：int
        //数组名：scores
        //数组的长度：scores.length，值是5
        //下标的范围：0~4
        //元素有哪些？scores[0],scores[1],scores[2],scores[3],scores[4]
        int[] scores = new int[5];

		/*
		System.out.println("第一个元素的值是：" + scores[0]);
		System.out.println("第二个元素的值是：" + scores[1]);
		System.out.println("第三个元素的值是：" + scores[2]);
		System.out.println("第四个元素的值是：" + scores[3]);
		System.out.println("第五个元素的值是：" + scores[4]);
		//System.out.println("第五个元素的值是：" + scores[5]);//错误的，会导致数组下标越界异常
		*/

        for(int index = 0; index<5; index++){
            System.out.println("第"+ (index+1)+"个元素的值是：" + scores[index]);
        }
        scores[0] = 89;//第一个元素，第一个数据
        scores[1] = 87;//第二个元素，第一个数据
        scores[2] = 56;//第三个元素，第一个数据
        scores[3] = 99;//第四个元素，第一个数据
        scores[4] = 78;//第五个元素，第一个数据

        //赋值之后再遍历，挨个看看元素的值
        for(int index = 0; index<scores.length; index++){
            System.out.println("第"+ (index+1)+"个元素的值是：" + scores[index]);
        }
    }
```



#### 2.2多维数组

语法格式：

- （动态初始化）：int[][] arr = new int[3][2];

  > 定义了一个名称为arr的二维数组
  > 二维数组中有3个一维数组
  > 每个一维数组中有2个元素
  > 一维数组的名称分别为arr[0],arr[1],arr[2]
  >
  > 给第一个一维数组1脚标位赋值为78写法是：arr[0][1] = 78;

- （动态初始化）：int [ ] [ ] [][] arr = new int[3] [ ];

  > 二维数组中有3个一维数组。
  >
  > 每个一维数组都是默认初始化值null (注意：区别于格式1）
  >
  > 可以对这个三个一维数组分别进行初始化
  >
  > arr[0] = new int[3]; arr[1] = new int[1]; arr[2] = new int[2];

```java
int[][] arr = new int[3][2];
int[][] arr = new int[3][2];
arr[0] = new int[2];
arr[1] = new int[3];
arr[2] = new int[4];

int[][] arr = new int[3][];
arr[0] = new
```

```java
  public static void main(String[] args) {
        //    1、二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};  //一维数组
        //    静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 4}};
        //    动态初始化1
        String[][] arr2 = new String[2][2];
        //    动态初始化2
        String[][] arr3 = new String[3][];


        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);

        arr3[1] = new String[4];
        System.out.println("arr3 = " + arr3[1][0]);

        //    3、获取数组的长度
        System.out.println("arr1.length = " + arr1.length);
        System.out.println("arr1[0].length = " + arr1[0].length);
        System.out.println("arr1[1].length = " + arr1[1].length);

    //    4、如何遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] +",");
            }
            System.out.println();
        }
```



## 四、如何表示数组的各个概念

1、数组的元素：数组名[下标]
2、下标的范围：[0,数组的长度-1]

       为什么从0开始？
       数组名也是一个变量，而且是一个引用数据类型的变量。
       数组名存储的是这块连续内存空间的首地址。
       第一个元素：数组名[0]表示距离首地址的偏移量为0
       第二个元素：数组名[1]表示距离首地址的偏移量为1
3、数组的长度：数组名.length


## 五、数组内存和分配空间

Jvm内存概念：

- 栈（stack）：主要存放局部变量 

- 方法区： 主要存放常量池和静态域

- 堆（heap）：new出来的结构：对象、数组等

![jvm-memory](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/jvm-memory.png)



![one-array-memory](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notebook/one-array-memory.png)
## 六、数组相关算法

1. 数组元素的赋值(杨辉三角、回形数等)

   杨辉三角形

   ```java
       public static void main(String[] args) {
           //1、定义一个二维数组
           int[][] arr = new int[10][];
   
           //2、给数组的元素赋值
           for (int i = 0; i < arr.length; i++) {
               arr[i] = new int[i + 1];
   
               //2、1给首元素赋值
               arr[i][0] = arr[i][i] = 1;
               //2、2给每行非首末元素赋值
               for (int j = 1; j < arr[i].length-1; j++) {
                   arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
               }
   
   
           }
   
           //3、遍历二维数组
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   System.out.print(arr[i][j] + "   ");
   
               }
               System.out.println();
           }
   
   ```

   回形数

   ```
   ```

   

2. 求数值型数组中元素的最大值、最小值、平均数、总和等

   

   ```java
       public static void main(String[] args) {
   
           int[] array = new int[10];
           int sum = 0;
           for (int i = 0; i < array.length; i++) {
               // array[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
               array[i] = new Random().nextInt(100);
               sum += array[i];
   
           }
           System.out.println("总和是： " + sum);
           int maxSize = array[0];
           int minSize = array[0];
   
           for (int i = 0; i < array.length; i++) {
               if (maxSize < array[i]) {
                   maxSize = array[i];
               }
               if (minSize > array[i]) {
                   maxSize = array[i];
               }
   
           }
           System.out.println("minSize = " + minSize);
           System.out.println("maxSize = " + maxSize);
           int average = sum / array.length;
           System.out.println("average = " + average);
   
       }
   ```

   

3. 数组的复制、反转、查找(线性查找、二分法查找)

   ```java
       // 一、数组的复制：
       public static void arrayCopy() {
   
           String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};
   
           // 数组的复制(区别于数组变量的赋值：arr1 = arr)
           String[] arr1 = new String[arr.length];
           // 该赋值是深拷贝，
           System.arraycopy(arr, 0, arr1, 0, arr.length);
   
           arr[0] = "Demo";
           // 遍历输出
           for (int i = 0; i < arr1.length; i++) {
               System.out.print(arr1[i] + "  ");
           }
           System.out.println();
       }
   
       // 二、数组的反转
       public static void arrayReverse() {
   
           String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};
   
           //    数组的反转
           //    方式一： 从中间分割，直接将第一个和最后一个替换，一一替换
           for (int i = 0; i < arr.length / 2; i++) {
               String temp = arr[i];
               arr[i] = arr[arr.length - 1 - i];
               arr[arr.length - 1 - i] = temp;
           }
           //    方式二： 定义了两个指针，从数组两端开始进行遍历，直接替换两个端的数据，为了更快一些
           for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
               String tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
           }
           // 方式三：定义了一个新的数组，直接将索引值倒序，输入到一个新的数组中
           String[] tmp = new String[arr.length];
           for (int i = 0; i < arr.length; i++) {
               tmp[i] = arr[arr.length - 1 - i];
           }
           arr = tmp;
   
           // 遍历输出
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + "  ");
           }
           System.out.println();
   
       }
   
       // 数组的查找
       // 线性查找
       public static void arraySearchOne() {
   
           String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};
           String dest = "BB";
           boolean isFlag = true;
           // 暴力解法
           for (int i = 0; i < arr.length; i++) {
               if (dest.equals(arr[i])) {
                   System.out.println("找到元素了，他的索引值是： " + i);
                   isFlag = false;
                   break;
   
               }
           }
           if (isFlag) {
               System.out.println("很遗憾没有找到该值");
           }
   
           //   工具类实现：
           Arrays.sort(arr);
           int i = Arrays.binarySearch(arr, dest);
           boolean isSucess = i == 1;
           System.out.println(isSucess);
       }
   
       // 二分查找
       // 前提：数组必须有序
       public static void arraySearchTwo() {
   
           int[] arr = new int[10];
           for (int i = 0; i < arr.length; i++) {
               arr[i] = (int) (Math.random() * 100);
               for (int j = 0; j < i; j++) {
                   if (arr[j] == arr[i]) {
                       i--;
                       break;
                   }
               }
           }
           // 先给他排序
           Arrays.sort(arr);
           System.out.println(Arrays.toString(arr));
           int tmp = (int) (Math.random() * 100);
           System.out.println(tmp);
           int head = 0;   // 首索引
           int end = arr.length - 1;  // 尾索引
           boolean isFlags = true;
           while (head < end) {
               int middle = end / 2;   // 中间值
               if (tmp == arr[middle]) {
                   System.out.println("找到了元素,索引值为：" + middle);
                   isFlags = false;
                   break;
               } else if (tmp < arr[middle]) {
                   head = middle + 1;
               } else {
                   end = middle - 1;
               }
           }
           if (isFlags) {
               System.out.println("很遗憾没有找见该元素");
           }
       }
   
   
   ```

   

4. 数组元素的排序算法

    冒泡排序算法

     ```java
         public static void main(String[] args) {
     
             int[] array = new int[10];
             // 随机生成十个不重复的元素
             for (int i = 0; i < array.length; i++) {
                 array[i] = (int) (Math.random() * 100);
                 for (int j = 0; j < i; j++) {
                     if (array[i] == array[j]) {
                         i--;
                         break;
                     }
                 }
             }
             // 进行冒泡排序
             // 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
             // 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
             // 针对所有的元素重复以上的步骤，除了最后一个。
             // 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
             // 第一个for循环来控制外层循序，一共循环n-1次
             for (int i = 0; i < array.length - 1; i++) {
                 // 第二次循环来对比数据，一一替换
                 for (int j = 0; j < array.length - 1 - i; j++) {
                     if (array[j] > array[j + 1]) {
                         int tmp = array[j];
                         array[j] = array[j + 1];
                         array[j + 1] = tmp;
                     }
                 }
             }
     
             System.out.println(Arrays.toString(array));
         }
     ```



## 七、十大内部排序算法

- **选择排序**

> 直接选择排序、堆排序

- **交换排序**

​	> 冒泡排序、快速排序

- **插入排序**

> 直接插入排序、折半插入排序、Shell排序

- **归并排序**
- **桶式排序**
- **基数排序**

## 八、数组的工具类：Arrays

在java.util包
（1）Arrays.sort(数组名)：从小到大排序
（2）Arrays.toString(数组名)：把数组的元素拼接成一个字符串，[元素1，元素2，元素3...]
（3）Arrays.fill(数组名，value值）：把数组每一个元素都填充为value值
（4）Arrays.fill(数组名，from,to, value值）：把数组[from,to)的位置填充为value值
（5）Arrays.copyOf(原数组名,新数组的长度)：用一个新数组接收一下
    新数组 = Arrays.copyOf(原数组名,新数组的长度);
（6）Arrays.copyOfRange(原数组名，from, to)：to可以超过原数组的下标范围，新数组的长度是to-from，to不包含
    新数组 = Arrays.copyOfRange(原数组名,from, to);
（7）Arrays.binarySearch(数组名，要查找的value值)
    这个方法的前提，必须保证数组是有序，否则结果是不保证正确的

```java
 public static void function() {

        int[] arr = {3, 2, 1, 6, 7};

        Arrays.sort(arr);

        // 看结果
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 6);

        System.out.println("6在arr数组中的位置是：" + index);

        // 填充
        Arrays.fill(arr, 5);// 填充所有元素为5

        // 看结果
        System.out.println(Arrays.toString(arr));

        // 填充[0,2)的元素为5
        Arrays.fill(arr, 0, 2, 5);

        // 看结果
        System.out.println(Arrays.toString(arr));

        int[] newArray = Arrays.copyOf(arr, 10);

        // 看结果
        System.out.println(Arrays.toString(newArray));

        int[] newArray1 = Arrays.copyOfRange(arr, 2, 10);

        // 看结果
        System.out.println(Arrays.toString(newArray1));


        // for each 遍历打印数组中的元素
        for (int n : arr) {
            System.out.println("n = " + n);

        }
    }
```

