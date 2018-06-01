package com.spring.spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@Configuration
//@Import(value = AppJavaConfig.class)
@ComponentScan(basePackages = "com.spring.spring_intro")
@PropertySource("classpath:/com/spring/spring_intro/app.properties")
@Profile("dev")
public class AppJavaConfig2 {

	@Bean("triangle")
	@Conditional(ConditionalBeanDemo.class)
	Shape Triangle(final Point pointA, final Point pointB, final Point pointC) {
		final Triangle triangle = new Triangle();
		triangle.setPointA(pointA);
		triangle.setPointB(pointB);
		triangle.setPointC(pointC);
		return triangle;
	}
	@Autowired
	Environment env;
	@Autowired
	ResourceLoader rl;
	@Bean
	Resource myResource() {
		return rl.getResource("com/spring/spring_intro/app.properties");
	}

	@Bean
	public Point pointA() {

		final Point center = new Point();
		center.setX(env.getRequiredProperty("triangle.pointa", Integer.class));
		center.setY(5);
		return center;
	}

	@Bean
	public Point pointB() {
		final Point center = new Point();
		center.setX(3);
		center.setY(6);
		return center;
	}

	@Bean
	public Point pointC() {
		final Point center = new Point();
		center.setX(3);
		center.setY(7);
		return center;
	}

	@Bean
	public MessageSource messageSource() {
		final ResourceBundleMessageSource mymessagesource = new ResourceBundleMessageSource();
		mymessagesource.setBasenames("messagesource1","messagesource2");
		return mymessagesource;
	}
}
