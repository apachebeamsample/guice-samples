package com.guice.tutor;

import java.util.logging.Logger;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.CircleModule;
import com.guice.service.impl.Circle;

public class CircleDemo {
private static final Logger logger = Logger.getLogger(CircleDemo.class.getSimpleName());
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CircleModule());
		Circle circle = injector.getInstance(Circle.class);
		logger.info("Area of circle is:"+circle.areaOfCircle());
	}

}
