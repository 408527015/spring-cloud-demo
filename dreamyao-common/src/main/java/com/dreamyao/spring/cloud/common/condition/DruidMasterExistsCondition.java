package com.dreamyao.spring.cloud.common.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/29
 */
public class DruidMasterExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().containsProperty("master.datasource.url");
    }
}
