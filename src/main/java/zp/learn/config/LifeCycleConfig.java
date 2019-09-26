package zp.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zp.learn.bean.Car;

/**
 * @author zp
 * @Description:
 * 1> ��xml <bean init-method = destory-method = ></bean> ��ǩ��ָ��
 * 2>@Bean ע������ initMethod destroyMethod ָ��
 * 3>ʵ�ֽӿ�InitializingBean DisposableBean  ʵ��ָ������
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