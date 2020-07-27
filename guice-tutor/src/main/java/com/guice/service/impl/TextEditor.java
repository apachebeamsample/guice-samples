package com.guice.service.impl;

import com.google.inject.Inject;
import com.guice.service.SpellCheck;

public class TextEditor {

	private SpellCheck spellCheck;
	
	@Inject
	public TextEditor(SpellCheck spellCheck) {
		this.spellCheck = spellCheck;
	}
	
	public void doSpellChecking() {
		spellCheck.checkSpelling();
	}
}
