package zp.learn.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 11:43
 */
public class ColorFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        Color color = new Color();
        return color;
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return true;
    }
}