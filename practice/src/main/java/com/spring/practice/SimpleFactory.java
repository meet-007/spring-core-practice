package com.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class SimpleFactory {

	@Bean(name = "lion")
	Animal Lion() {
		final Lion lion = new Lion();
		lion.setSpeed(44);
		lion.setType("4asdfasdf");
		lion.setWeight(42);
		return lion;
	}

	@Bean(name = "tiger")
	Animal Tiger() {
		final Tiger tiger = new Tiger();
		tiger.setSpeed(44);
		tiger.setType("4asdfasdf");
		tiger.setWeight(42);
		return tiger;
	}
}
