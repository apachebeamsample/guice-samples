package com.guice.bindings;

import com.google.inject.AbstractModule;
import com.guice.service.SpellCheck;
import com.guice.service.impl.SpellCheckImpl;
import com.guice.service.impl.WinWordSpellCheckImpl;

public class TextEditorModule extends AbstractModule {

	@Override
	protected void configure() {
		
		
		  bind(SpellCheck.class).to(SpellCheckImpl.class);
		 // bind(SpellCheckImpl.class).to(WinWordSpellCheckImpl.class);
		 
		
	}
	
}