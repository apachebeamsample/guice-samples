package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.guice.providers.ShipProvider;
import com.guice.service.Vehicle;

public class SeaTransportModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Vehicle.class).toProvider(ShipProvider.class);
	}

}
