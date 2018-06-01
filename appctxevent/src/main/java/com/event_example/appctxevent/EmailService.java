package com.event_example.appctxevent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class EmailService  {

	private List<String> blackList;
	@Autowired
	private ApplicationEventPublisher publisher;

	public void setBlackList(final List<String> blackList) {
		this.blackList = blackList;
	}

	//	public void setApplicationEventPublisher(final ApplicationEventPublisher publisher) {
	//		this.publisher = publisher;
	//	}

	public void sendEmail(final String address, final String text) {

		if (blackList.contains(address)) {
			final BlackListEvent event = new BlackListEvent(this, address, text);
			publisher.publishEvent(event);
			return;
		}
		// send email...
	}
}
