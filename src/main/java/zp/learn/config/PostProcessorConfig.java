package zp.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zp
 * @Description:  BeanPostProcessor 接口在 bean初始化方法前后回调
 * @date 2019-09-26 15:22
 */
@Configuration
@ComponentScan("zp.learn")
public class PostProcessorConfig {
}