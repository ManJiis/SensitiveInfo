package top.b0x0.sensitiveinfo.util.sensitive;

import java.lang.annotation.*;

/**
 * 配合SensitiveInfoUtils.noSensitiveObject()方法
 * <p>
 * 用于标注实体字段敏感字段类型
 * {@link top.b0x0.sensitiveinfo.util.sensitive.SensitiveType}}
 *
 * @author TANG
 * @date 2021-06-15
 * @since 2.0.0
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SensitiveInfoType {

    SensitiveType value();

}
