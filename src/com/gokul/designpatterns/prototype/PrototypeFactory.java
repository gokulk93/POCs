package com.gokul.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	private static Map<String , PrototypeCapable> prototypes = new HashMap<String , PrototypeCapable>();
	 
	static
    {
        prototypes.put("movie", new Movie());
        prototypes.put("album", new Album());
       
        
    }
	
	
	public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
	
	

}
