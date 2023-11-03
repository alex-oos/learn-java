package com.liaoxuefeng.bObject.bCoreClass.cEnum;

/**
 * @author LiJiang
 * @since 2021/6/28 15:39
 */
public enum WeekDay {
    /**
     * 星期一
     */
    MON(1, "星期一"),
    /**
     * 星期二
     */
    TUE(2, "星期二"),
    /**
     * 星期三
     */
    WED(3, "星期三"),
    /**
     * 星期四
     */
    THU(4, "星期四"),
    /**
     * 星期五
     */
    FRI(5, "星期五"),
    /**
     * 星期六
     */
    SAT(6, "星期六"),
    /**
     * 星期日
     */
    SUN(0, "星期日");

    public final int dayVaule;

    private final String chinese;

    WeekDay(int dayVaule, String chinese) {
        this.dayVaule = dayVaule;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
