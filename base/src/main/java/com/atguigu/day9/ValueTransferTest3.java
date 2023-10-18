package com.atguigu.day9;


/**
 * @author Alex
 * @since 2022/1/20 8:05 上午
 */
public class ValueTransferTest3 {

    public static void main(String[] args) {
        ValueTransferTest3 v = new ValueTransferTest3();
        v.first();
    }
    private void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println("v.i = " + v.i);
    }
    private void second(Value v, int i) {

        i = 0;
        v.i = 20;
        Value v1 = new Value();
        v = v1;
        System.out.println("v.i = " + v.i + " i:" + i);
    }

}

class Value {

    int i = 15;

}
