package com.gokul.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Person{
	Integer number;
	public Person(Integer number){
		this.number=number;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + "]";
	}
	
	
	
}
class SortByNumber implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.number !=null && o2.number != null)
			return o1.number - o2.number;
		else if(o1.number == null)
			return 1;
		else
			return -1;
		
	}
	
}
public class SortingNullObject {

	public static void main(String[] args) {
		
		ArrayList<Person> ar = new ArrayList<Person>();
		ar.add(new Person(1));
		ar.add(new Person(7));
		ar.add(new Person(4));
		ar.add(new Person(6));
		ar.add(new Person(3));
		ar.add(new Person(9));
		ar.add(new Person(null));
		ar.add(new Person(6));
		ar.add(new Person(null));
		ar.add(new Person(null));
		IntStream.range(0, ar.size()).forEach(i->System.out.println(ar.get(i)));
		Collections.sort(ar, new SortByNumber());
		System.out.println("****************");
		IntStream.range(0, ar.size()).forEach(i->System.out.println(ar.get(i)));
		
	}

}
