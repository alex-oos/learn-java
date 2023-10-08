package com.atguigu.day2.typechange;

class TestTypeChangeExer1 {
    public static void main(String[] args) {
        //String str1 = 4;        //�ж϶Դ�����Ӧ�ü�˫����
        String str2 = 3.5f + "";             //�ж�str2�Դ���
        System.out.println(str2);        //�����3.5
        System.out.println(3 + 4 + "Hello!");     //�����7Hello!
        System.out.println("Hello!" + 3 + 4);      //�����Hello!34
        System.out.println('a' + 1 + "Hello!");    //�����98Hello!
        System.out.println("Hello" + 'a' + 1);     //�����Hello!a1
    }
}
