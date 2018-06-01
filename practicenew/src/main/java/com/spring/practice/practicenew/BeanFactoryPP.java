package com.spring.practice.practicenew;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPP implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("inside bean factory post processor");

	}

}
