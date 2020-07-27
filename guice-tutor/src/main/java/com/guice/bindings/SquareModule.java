package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.guice.service.Shape;
import com.guice.service.impl.Square;

public class SquareModule extends AbstractModule {
	
	

	@Override
	protected void configure() {
		try {
			bind(Shape.class).toConstructor(Square.class.getConstructor(int.class));
			bind(int.class)
	         .annotatedWith(Names.named("l"))
	         .toInstance(10);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
