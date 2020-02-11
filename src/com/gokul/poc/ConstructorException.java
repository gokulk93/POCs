package com.gokul.poc;

import java.util.List;
import java.util.stream.Stream;

class A{
	public A(){
		try{
			System.out.println("In Constructor");
			throw new Exception();
		}catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
	}
	public void call(){
		System.out.println("method");
	}


	
}
public class ConstructorException {
	public static void main(String[] args) {
		A a = new A();
		List<A> list = null;
		list.stream().forEach(e -> e.call());
		System.out.println("Successfully created object");
		Object o1 ="xxx";
		Object o2 ="xxx";
		System.out.println(o1.equals(o2));
		String []array = {"1","2","5","8","6","3","7"};
		int[] arrayInt = Stream.of(array).mapToInt(Integer::parseInt).toArray();
	
	}
}
