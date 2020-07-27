package com.guice.service.impl;

import com.guice.service.Vehicle;
import java.util.logging.Logger;

public class Car implements Vehicle {

	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	public void move() {
		
		logger.info(this.getClass().getSimpleName()+" moves on road");

	}

}
