package com.event_example.appctxevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( final String[] args )
	{
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		final EmailService emailService = (EmailService)context.getBean("emailService");
		emailService.sendEmail("known.spammer@example.org", "hello");
		emailService.sendEmail("known.hacker@example.org", "hi");
		emailService.sendEmail("meetchaudhary97@gmail.com", "hi");
		emailService.sendEmail("raj2102197@gmail.com", "hi");
	}
}
