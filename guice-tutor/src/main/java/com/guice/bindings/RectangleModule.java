package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class RectangleModule extends AbstractModule {

	@Override
	protected void configure() {
		
		bind(int.class).annotatedWith(Names.named("l"))
		.toInstance(10);
		bind(int.class).annotatedWith(Names.named("b"))
		.toInstance(5);
	}

}
