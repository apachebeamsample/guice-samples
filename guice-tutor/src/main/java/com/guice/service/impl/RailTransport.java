package com.guice.service.impl;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.guice.service.Vehicle;
public class RailTransport {

	private Vehicle vehicle;
	
	@Inject
	public RailTransport(@Named("railways") Vehicle vehicle) {
			this.vehicle = vehicle;
	}
	
	public void move() {
		vehicle.move();
	}
}
