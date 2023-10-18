package com.atguigu.day12.exer3;


import lombok.Data;

/**
 * @author Alex
 * @since 2021/12/16 4:53 下午
 * <P></p>
 */
@Data
public class ManKind {

    private int sex;

    private int salary;

    public ManKind() {
    }
    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("sex:" + "man");
        } else if (sex == 0) {
            System.out.println("sex = " + "woman");
        }
    }
    public void employeed() {
        String info = (salary == 0) ? "no job" : "job";
        System.out.println("info = " + info);
    }


}
