package com.guice.service.impl;

import com.google.inject.Inject;
import com.guice.service.Vehicle;

public class SeaTransport {

	private Vehicle vehicle;
	
	@Inject
	public SeaTransport(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void move() {
		vehicle.move();
	}
}
