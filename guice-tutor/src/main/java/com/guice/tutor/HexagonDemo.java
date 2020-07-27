package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.HexagonModule;
import com.guice.service.impl.Hexagon;

public class HexagonDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new HexagonModule());
		Hexagon hexagon  = injector.getInstance(Hexagon.class);
		hexagon.draw();

	}

}
