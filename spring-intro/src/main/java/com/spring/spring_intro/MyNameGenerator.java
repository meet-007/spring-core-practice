package com.spring.spring_intro;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class MyNameGenerator implements BeanNameGenerator {

	public String generateBeanName(final BeanDefinition definition, final BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		//		As a general rule, consider specifying the name with the annotation whenever other components may be making explicit references to it. On the other hand,
		//		the auto-generated names are adequate whenever the container is responsible for wiring.
		return "meet";
	}

}
