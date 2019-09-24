package zp.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zp.learn.bean.Person;

/**
 * @author zp
 * @Description:
 * @date 2019-09-24 18:02
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);

    }
}