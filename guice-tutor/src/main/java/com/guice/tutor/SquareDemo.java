package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.SquareModule;
import com.guice.service.impl.Square;

public class SquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Injector injector = Guice.createInjector(new SquareModule());
		Square square = injector.getInstance(Square.class);
		square.draw();
	}

}
