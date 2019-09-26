package zp.learn.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zp
 * @Description:
 * @date 2019-09-24 17:58
 */
public class Person {
    @Value("${person.name}")
    private String name ;

    private Integer age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}