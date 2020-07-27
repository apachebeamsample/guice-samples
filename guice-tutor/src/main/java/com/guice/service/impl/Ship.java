package com.guice.service.impl;

import com.guice.service.Vehicle;
import java.util.logging.Logger;

public class Ship implements Vehicle {
	private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
	public void move() {
		logger.info(this.getClass().getSimpleName()+" sails in the sea");
	}

}
