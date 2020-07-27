package com.guice.service.impl;

import java.util.logging.Logger;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.guice.service.Shape;

public class Square implements Shape {
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	private int length;
	public Square() {
		
	}
	
	@Inject
	public Square(@Named("l")int length) {
		this.length = length;
	}
	
	public void draw() {

		logger.info("I am a "+this.getClass().getSimpleName()+" of length:"+length);

	}

}
