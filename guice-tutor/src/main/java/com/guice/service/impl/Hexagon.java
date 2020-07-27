package com.guice.service.impl;

import java.util.logging.Logger;

import com.google.inject.Inject;
import com.guice.service.Shape;

public class Hexagon implements Shape {

	private Logger logger;
	@Inject
	public Hexagon(Logger logger) {
		this.logger = logger;
	}
	public void draw() {
		
		logger.info(this.getClass().getSimpleName()+" has 6 sides.");

	}

}
