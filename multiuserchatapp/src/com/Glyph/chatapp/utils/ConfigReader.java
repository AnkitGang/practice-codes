package com.Glyph.chatapp.utils;

import java.util.ResourceBundle;

public class ConfigReader {
	ConfigReader(){} //we made this constructor so that no one can make object of this class. they must call getValue.
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getValue(String key) {
		return rb.getString(key);
	}
}
