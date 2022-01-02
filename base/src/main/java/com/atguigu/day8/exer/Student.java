package com.atguigu.day8.exer;


/**
 * @author Alex
 * @since 2021/12/8 3:35 下午
 * 4. 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * <p>
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
public class Student {

    private int number;

    private int state;

    private int score;

    @Override
    public String toString() {
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }


    public void create(Student[] stus) {
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = (i + 1);
            //年级：[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩：[0,100]
            stus[i].score = Math.round(100);
        }
    }

    /**
     * @param studentsArray student数组
     * @param state         年级
     *                      <p>
     *                      查找年级为3的学生
     *                      </p>
     */
    public void searchState(Student[] studentsArray, int state) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].state == state) {
                System.out.println(studentsArray[i].toString());
            }
        }
    }

    /**
     * 使用冒泡排序按学生成绩排序，并遍历所有学生信息
     *
     * @param stus
     */
    public void sort(Student[] stus) {
        for (int i = 0; i < stus.length; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //如果需要换序，交换的是数组的元素：Student对象！！！
                    final Student tmp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 遍历输出
     *
     * @param students
     */
    public void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].toString();
        }
    }

    public static void main(final String[] args) {
        Student[] stus = new Student[20];
        Student student = new Student();
        student.create(stus);
        student.searchState(stus, 3);
        student.sort(stus);
        student.print(stus);


    }


}
