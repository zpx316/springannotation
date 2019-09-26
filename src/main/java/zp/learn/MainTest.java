package zp.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zp.learn.config.MainConfig;

/**
 * @author zp
 * @Description:
 * @date 2019-09-24 18:02
 */
public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ac.getBeanDefinitionCount());

    }
}