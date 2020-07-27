package com.guice.service.impl;

import java.util.logging.Logger;

import com.google.inject.Inject;
import com.guice.service.Shape;

public class Cube implements Shape {
	
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	private int length;
	private int breadth;
	private int height;
	
	@Inject
	public Cube(int length,int breadth,int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

		public void draw() {
		
			logger.info("I am a cube");
			logger.info("Length:"+length);
			logger.info("Breadth:"+breadth);
			logger.info("Height:"+height);
		}

	

}
