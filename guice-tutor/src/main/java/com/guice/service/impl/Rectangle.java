package com.guice.service.impl;

import java.util.logging.Logger;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.guice.service.Shape;


public class Rectangle implements Shape {

	private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
	private int length;
	@Inject @Named("b")
	private int breadth;
	
	
	private int height;
	
	public void draw() {
		
		logger.info("I am a "+this.getClass().getSimpleName()
			 +" with length:"+length+" and breadth:"+breadth
			 +" and height:"+height);
	}

	public int getLength() {
		return length;
	}

	@Inject
	public void setLength(@Named("l") int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	@Inject(optional=true)
	public void setHeight(int height) {
		this.height = height;
	}

}
