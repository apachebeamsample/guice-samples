package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.RectangleModule;
import com.guice.service.impl.Rectangle;

public class RectangleDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new RectangleModule());
		Rectangle rect = injector.getInstance(Rectangle.class);
		rect.draw();
	}

}
