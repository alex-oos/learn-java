package com.liaoxuefeng.bObject.bCoreClass.cEnum;


/**
 * @author Alex
 *
 * @since 2020/6/2 14:25
 */
public class TestSwitch {

    public static void main(String[] args) {

        WeekDay day = WeekDay.SUN;

        switch (day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process " + day);
        }
    }

}
