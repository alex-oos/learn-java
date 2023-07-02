package day4;


/**
 * @ClassName ShallowCopy
 * @Description
 * @Author Alex
 * @Date 2022/6/12 21:32
 * @Version 1.0
 */
public class ShallowCopy {


}

class Address implements Cloneable {

    private  String  name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Address clone() {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
        return (Address) clone;
    }

}

class  Persion implements  Cloneable {
    
}
