package com.liaoxuefeng.day8;

enum Weekday1 {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

/**
 * @Auther: 李将
 * @Date: 2020/5/29 18:42
 * @Descprition:
 */
class Weesskday {

 /*   public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;*/


    public static void main(String[] args) {
        Weekday1 day = Weekday1.SUN;
        if (day == Weekday1.SAT || day == Weekday1.SUN) {
            System.out.println("work at home!");
        } else {
            System.out.println("work at office!");
        }
    }

}