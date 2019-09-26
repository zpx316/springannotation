package zp.learn.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 14:25
 */
@Component
public class Cat implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("cat 的销毁方法被调用");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat的初始化方法被调用");
    }
}