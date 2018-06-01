package com.spring.practice.practicenew;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DisplayBeanPostProcessor2 implements BeanPostProcessor,Ordered {

	public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("DisplayBeanPostProcessor2 in before initiallizaion method bean name is : ->"+beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("DisplayBeanPostProcessor2 in after initiallizaion method bean name is : ->"+beanName);
		return bean;
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
