package com.gokul.poc;

public class Test {

	public static void main(String[] args) {

		Long l = new Long(785l);
		Integer i = new Integer(786);
		String s = new String("234");
		
		System.out.println(l.hashCode());
		System.out.println(i.hashCode());
		System.out.println(s.hashCode());
	}

}

