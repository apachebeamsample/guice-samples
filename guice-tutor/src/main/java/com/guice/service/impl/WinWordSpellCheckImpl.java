package com.guice.service.impl;
import java.util.logging.Logger;
public class WinWordSpellCheckImpl extends SpellCheckImpl {
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	@Override
	public void checkSpelling() {
		logger.info("Microsoft Word check spelling");
	}
}
