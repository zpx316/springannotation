package zp.learn.bean;

/**
 * @author zp
 * @Description:
 * @date 2019-09-25 11:24
 */
public class Car {

    private String name ;
    private String color ;

    public void init(){

        System.out.println("car初始化方法被调用");
    }

    public void destroy(){
        System.out.println("car销毁方法被调用");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}