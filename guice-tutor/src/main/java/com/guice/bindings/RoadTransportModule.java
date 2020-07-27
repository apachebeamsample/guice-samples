package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.guice.service.Road;
import com.guice.service.Vehicle;
import com.guice.service.impl.Car;

public class RoadTransportModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Vehicle.class).annotatedWith(Road.class)
		.to(Car.class);
	}

}
