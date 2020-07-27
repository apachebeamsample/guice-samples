package com.guice.tutor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.bindings.TextEditorModule;
import com.guice.service.impl.TextEditor;

/**
 * Hello world!
 *
 */
public class TextEditorDemo 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.doSpellChecking();
    }
}
