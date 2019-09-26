package zp.learn.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zp
 * @Description:
 * @date 2019-09-26 10:28
 */
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //�˴�����дȫ����
        return new String[]{"zp.learn.bean.Color","zp.learn.bean.Blue"};
    }
}