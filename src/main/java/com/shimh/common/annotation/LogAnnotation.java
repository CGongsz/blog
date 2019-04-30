package com.shimh.common.annotation;

import java.lang.annotation.*;

/**
 *
 * @author shimh
 * <p>
 * 2018年4月18日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operation() default "";
}
