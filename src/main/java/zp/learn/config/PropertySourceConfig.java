package zp.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import zp.learn.bean.Person;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 15:32
 */
@Configuration
@ComponentScan("zp.learn")
@PropertySource("classpath:/person.properties")
public class PropertySourceConfig {

    @Bean
    public Person person(){

        return new Person();
    }
}