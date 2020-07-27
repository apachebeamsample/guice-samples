package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.SeaTransportModule;
import com.guice.service.impl.SeaTransport;

public class SeaTransportDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new SeaTransportModule());
		SeaTransport seaTransport = injector.getInstance(SeaTransport.class);
		seaTransport.move();
	}

}
