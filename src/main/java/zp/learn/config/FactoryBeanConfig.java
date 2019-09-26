package zp.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zp.learn.bean.ColorFactoryBean;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 11:46
 */
@Configuration
@ComponentScan("zp.learn")
public class FactoryBeanConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean() {

        return new ColorFactoryBean();
    }


}