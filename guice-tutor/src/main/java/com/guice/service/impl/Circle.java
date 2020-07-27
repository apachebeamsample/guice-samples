package com.guice.service.impl;

import java.math.BigDecimal;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Circle {

	private BigDecimal pi;
	private BigDecimal radius;
	
	@Inject
	public Circle(@Named("PI") BigDecimal pi,@Named("radius") BigDecimal radius) {
			this.pi = pi;
			this.radius = radius;
	}
	
	public BigDecimal areaOfCircle() {
		return pi.multiply(radius).multiply(radius).setScale(2,BigDecimal.ROUND_FLOOR);
	}
}
