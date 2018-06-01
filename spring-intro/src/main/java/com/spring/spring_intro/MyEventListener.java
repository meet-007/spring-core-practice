package com.spring.spring_intro;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventListener {
	@EventListener
	public void onMyApplicationEvent(final ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}

}
