package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.guice.service.Vehicle;
import com.guice.service.impl.Train;

public class RailTransportModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Vehicle.class).annotatedWith(Names.named("railways"))
		.to(Train.class);
	}

}
