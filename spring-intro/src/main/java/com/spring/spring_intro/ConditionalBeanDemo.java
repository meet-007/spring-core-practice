package com.spring.spring_intro;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalBeanDemo implements org.springframework.context.annotation.Condition{

	public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		final Environment env = context.getEnvironment();
		return env.containsProperty("create.shape");
	}

}
