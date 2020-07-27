package com.guice.bindings;

import java.math.BigDecimal;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CircleModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BigDecimal.class).annotatedWith(Names.named("PI"))
		.toInstance(new BigDecimal(3.142));
		bind(BigDecimal.class).annotatedWith(Names.named("radius"))
		.toInstance(new BigDecimal(10));
	}

}
