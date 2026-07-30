package com.Taskday30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShipmentApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com/Taskday30");
		OrderDispatch bean = context.getBean("dispatch",OrderDispatch.class);
		bean.dispatchOrder();
	}
}
