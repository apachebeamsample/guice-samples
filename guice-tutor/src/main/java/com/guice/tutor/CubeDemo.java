package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.CubeModule;
import com.guice.service.impl.Cube;

public class CubeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Injector injector = Guice.createInjector(new CubeModule());
		Cube cube = injector.getInstance(Cube.class);
		cube.draw();
	}

}
