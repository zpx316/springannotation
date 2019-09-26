package zp.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zp.learn.bean.Car;

/**
 * @author zp
 * @Description:
 * 1> 在xml <bean init-method = destory-method = ></bean> 标签中指定
 * 2>@Bean 注解属性 initMethod destroyMethod 指定
 * 3>实现接口InitializingBean DisposableBean  实现指定方法
 * 4>JSR-250 @PostConstruct @PreDestroy
 *
 *
 *
 *
 *
 * @date 2019-09-26 14:16
 */
@Configuration
@ComponentScan("zp.learn")
public class LifeCycleConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car() {

        return new Car("zhangsan", "lisi");
    }
}