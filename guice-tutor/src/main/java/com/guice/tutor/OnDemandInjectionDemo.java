package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.TextEditorModule;
import com.guice.service.SpellCheck;
import com.guice.service.impl.SpellCheckImpl;
import com.guice.service.impl.TextEditor;

public class OnDemandInjectionDemo {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new TextEditorModule());
		SpellCheck spellCheck = new SpellCheckImpl();
		injector.injectMembers(spellCheck);
		TextEditor textEditor = injector.getInstance(TextEditor.class);
		textEditor.doSpellChecking();
	}

}
