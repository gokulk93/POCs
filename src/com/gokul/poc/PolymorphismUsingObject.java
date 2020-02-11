package com.gokul.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class B{
	int[] a={1,2,3};
	
	public void convert(String a, String b){
		System.out.println("In string");
	}
	public void convert(Object a, Object b){
		System.out.println("In object");
	}
	public void show(){
		System.out.println("Array Size :"+a.length);
	}
}
public class PolymorphismUsingObject {
	public static void main(String[] args) {
		B a = new B();
		a.convert(null, "bv");
		a.convert(2, 1);
		a.convert("ab",1);
		a.show();
		Integer[] numberArray={4,3,2,8,1};
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(numberArray)); 
		numbers.stream().filter(i->i%2==0).sorted().forEach(System.out::println);
	}

}
