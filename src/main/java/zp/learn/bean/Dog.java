package zp.learn.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 14:34
 */
@Component
public class Dog {

    @PostConstruct
    public void init(){

        System.out.println("dog�ĳ�ʼ������������");
    }
    @PreDestroy
    public void destroy(){

        System.out.println("dog�����ٷ���������");
    }
}