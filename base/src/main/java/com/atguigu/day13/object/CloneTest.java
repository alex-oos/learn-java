package com.atguigu.day13.object;


/**
 * @author Alex
 * @date 2021/12/17 3:35 下午
 * <P></p>
 */
public class CloneTest {

    public static void main(String[] args) {
        Animal a1 = new Animal("AA");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象：" + a1);
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}

class Animal implements Cloneable {

    private String name;

    public Animal() {
        super();
    }

    Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

}