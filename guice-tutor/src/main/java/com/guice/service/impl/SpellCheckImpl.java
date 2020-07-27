package com.guice.service.impl;

import java.util.logging.Logger;

import com.guice.service.SpellCheck;

public class SpellCheckImpl implements SpellCheck {
	private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
	public void checkSpelling() {
		logger.info("Checking spelling....");
	}
	
}