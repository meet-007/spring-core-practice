package com.springinaction.knight_quest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class KnightMain {
	public static void main(final String[] args) {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		final Knights knight = context.getBean(Knights.class);
		knight.embarkOnQuest();
		context.close();
	}
}
