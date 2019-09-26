package zp.learn.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import zp.learn.bean.Car;
import zp.learn.bean.Person;
import zp.learn.condition.LinuxCondition;
import zp.learn.condition.MyImportBeanDefinitionsRegister;
import zp.learn.condition.MyImportSelector;
import zp.learn.condition.WindosCondition;

/**
 * @author zp
 * @Description:
 * @date 2019-09-24 18:13
 */
@Configuration
@ComponentScan(value = "zp.learn",excludeFilters ={
        @ComponentScan.Filter(
                type = FilterType.ANNOTATION,classes = Controller.class)} )
@Import({MyImportSelector.class, MyImportBeanDefinitionsRegister.class})
public class MainConfig {
    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(18);
        person.setName("zhangsan");
        return person;
    }
    @Conditional(LinuxCondition.class)
    @Bean
    public Car car1 (){

        return new Car("linuxCar", "red");
    }

    @Conditional(WindosCondition.class)
    @Bean
    public Car car2 (){

        return new Car("winCar", "yellow");
    }



}