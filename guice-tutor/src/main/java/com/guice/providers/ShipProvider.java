package com.guice.providers;

import com.google.inject.Provider;
import com.guice.service.impl.Ship;

public class ShipProvider implements Provider<Ship> {

	public Ship get() {
		Ship ship = new Ship();
		return ship;
	}

}
