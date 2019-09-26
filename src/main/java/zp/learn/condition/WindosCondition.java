package zp.learn.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zp
 * @Description:
 * @date 2019-09-25 11:10
 */
public class WindosCondition implements Condition {


    public boolean matches(ConditionContext conditionContext,
                           AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println(osName);
        if(osName.contains("Mac")){
            return true;
        }
        return false;
    }
}