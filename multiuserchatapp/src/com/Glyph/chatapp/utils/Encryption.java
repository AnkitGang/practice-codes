package com.Glyph.chatapp.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface Encryption {
	public static String passwordEncypt(String plainPassword) throws NoSuchAlgorithmException {
		String encryptedPassword = null;
		MessageDigest messageDigest = MessageDigest.getInstance("MD5"); //MD5 is a cryptographic hash algorithm used to generate a 128-bit digest from a string of any length.
		messageDigest.update(plainPassword.getBytes());  //update method takes only array of bytes
		byte[] encrypt = messageDigest.digest();
		StringBuffer sb = new StringBuffer();
		for(byte b : encrypt) {
			sb.append(b);
		}
		encryptedPassword = sb.toString();
		return encryptedPassword;
	}
}
