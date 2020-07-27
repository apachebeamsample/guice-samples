package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.RailTransportModule;
import com.guice.service.impl.RailTransport;

public class RailTransportDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new RailTransportModule());
		RailTransport railTransport =
				injector.getInstance(RailTransport.class);
		railTransport.move();
	}

}
