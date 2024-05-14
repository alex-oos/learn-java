package com.atguigu.day12oop.exer3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 * @since 2021/12/16 4:57 下午
 * <P></p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kid extends ManKind {

    private int yearsOld;

    @Override
    public void employeed() {
        System.out.println("kid should study and no job");
    }

    public void printAge() {
        System.out.println("yearsOld = " + yearsOld);
    }

}
