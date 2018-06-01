package com.event_example.appctxevent;

import org.springframework.context.ApplicationEvent;

class BlackListEvent extends ApplicationEvent{
	private final String address;
	public BlackListEvent(final Object source, final String address, final String test) {
		super(source);
		this.address = address;
	}

	public void message() {
		System.out.println("can't send email to "+address);
	}

	//	public ResolvableType getResolvableType() {
	//		// TODO Auto-generated method stub
	//		return null;
}

