package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.RoadTransportModule;
import com.guice.service.impl.RoadTransport;

public class RoadTransportDemo {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new RoadTransportModule());
		RoadTransport roadTransport = 
				injector.getInstance(RoadTransport.class);
		roadTransport.move();
	}

}
