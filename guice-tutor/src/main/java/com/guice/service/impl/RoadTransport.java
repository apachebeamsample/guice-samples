package com.guice.service.impl;

import com.google.inject.Inject;
import com.guice.service.Road;
import com.guice.service.Vehicle;

public class RoadTransport {

	private Vehicle vehicle;
	
	@Inject
	public RoadTransport(@Road Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void move() {
		vehicle.move();
	}
}
