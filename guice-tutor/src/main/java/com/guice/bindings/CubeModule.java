package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.guice.service.impl.Cube;

public class CubeModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}
	
	@Provides
	public Cube provideCube() {
		Cube cube = new Cube(30,20,10);
		return cube;
	}
}
