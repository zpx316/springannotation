package zp.learn.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import zp.learn.bean.Rainbow;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 11:07
 */
public class MyImportBeanDefinitionsRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        RootBeanDefinition beanDefinition = new RootBeanDefinition(Rainbow.class);
        beanDefinitionRegistry.registerBeanDefinition("rainbow",beanDefinition);
    }
}