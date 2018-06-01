package com.event_example.appctxevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
@Component
public class BlackListNotifier3 {

	public void setNotificationAddress(final String notificationAddress) {
	}
	@EventListener
	@Async
	@Order(1)
	public void onApplicationEvent(final ApplicationEvent event) {
		// notify appropriate parties via notificationAddress...
		System.out.println("B3---"+event.toString());
	}
}