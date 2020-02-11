package com.gokul.java8;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;

/*
 * Base64 variants 
 * 
 * */

public class EncoderDecoder {

	public static void main(String[] args) {
		
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
		 // Basic
		String normalString = "Encrypted message nothing to say!";
		String encodedString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8) );
		System.out.println("Basic Encoder encrypted message : "+encodedString);
		
		byte[] decodedByteArray = decoder.decode(encodedString);
		System.out.println("Basic Decoder Decrypted message : " +new String(decodedByteArray));
		
		System.out.println("**************************************");

		String originalUrl = "https://www.google.co.nz/search?q=java&cad=h";
		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
		System.out.println("URL and File Safe Encoder encrypted message : "+encodedUrl);
		
		byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
		String decodedUrl = new String(decodedBytes);
		System.out.println("URL and File Safe Encoder decrypted message : "+decodedUrl);
		
		System.out.println("**************************************");
		
		StringBuilder buffer = new StringBuilder();
	    for (int count = 0; count < 10; ++count) {
	        buffer.append(UUID.randomUUID().toString());
	    }
	    
	    byte[] encodedAsBytes = buffer.toString().getBytes();
	    String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);
	    System.out.println("Encoded message : "+encodedMime);
	    
	    byte[] decodedmessage = Base64.getMimeDecoder().decode(encodedMime);
	    String decodedMime = new String(decodedmessage);
	    System.out.println("Decoded Message : "+ decodedMime);
		
	}

}
