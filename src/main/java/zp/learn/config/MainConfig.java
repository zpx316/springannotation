package zp.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zp.learn.bean.Person;

/**
 * @author zp
 * @Description:
 * @date 2019-09-24 18:13
 */
@Configuration
public class MainConfig {
    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(18);
        person.setName("zhangsan");
        return person;
    }
}