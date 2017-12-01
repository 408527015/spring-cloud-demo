package com.dreamyao.spring.cloud.common.annotation;

import com.alibaba.druid.pool.DruidDataSource;
import com.dreamyao.spring.cloud.common.condition.DruidMasterExistsCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/29
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnClass(DruidDataSource.class)
@Conditional(DruidMasterExistsCondition.class)
public @interface DruidMasterExistAnnotation {
}
