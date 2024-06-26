package com.atguigu.day13.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 * @since 2021/12/17 3:22 下午
 * <P></p>
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    private String name;

    private int age;

    //自动生成的equals() 直接对比内存地址值
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Customer other = (Customer) obj;
        if (age != other.age) return false;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }


    //重写的原则：比较两个对象的实体内容(即：name和age)是否相同
    //手动实现equals()的重写
   /*  @Override
    public boolean equals(Object obj) {

        System.out.println("Customer equals()....");
        if (this == obj) {
            return true;
        }else if (obj instanceof Customer) {
            Customer cust = (Customer) obj;
            //比较两个对象的每个属性是否都相同
            //if (this.age == cust.age && this.name.equals(cust.name)) {
            //    return true;
            //} else {
            //    return false;
            //}

            //或
            return this.age == cust.age && this.name.equals(cust.name);
        } else {
            return false;

        }

    } */


    //自动实现
    @Override
    public String toString() {

        return "Customer [name=" + name + ", age=" + age + "]";
    }

}
