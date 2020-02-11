package com.gokul.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		
///////////////TYPES OF STREAMS//////////////////////////////////////////	
	/*	
		//Type 1
		Arrays.asList("a1", "a2", "a3")
			    .stream()
			    .findFirst()
			    .ifPresent(System.out::println);  // a1
		//Type 2
		Stream.of("a1", "a2", "a3")
			    .findFirst()
			    .ifPresent(System.out::println);  // a1
		//Type 3 
		IntStream.range(1, 4)
	    			.forEach(System.out::print); //123
		
		*/
///////////////ORDER OF PROCESSING/////////////////////////////////////////		
		
	
		
		
/*		System.out.println("***************************************");
		//Order of processing
		Stream.of("d2", "a2", "b1", "b3", "c")
			    .map(s -> {
			        System.out.println("MAP: " + s);
			        return s.toUpperCase();
			    })
			    .filter(s -> {
			        System.out.println("FILTER: " + s);
			        return s.startsWith("A");
			    })
			    .forEach(s -> System.out.println("FOREACH: " + s));
		
		
		

		
		System.out.println("***************************************");
		Stream.of("d2", "a2", "b1", "b3", "c")
			    .filter(s -> {
			        System.out.println("filter: " + s);
			        return s.startsWith("a");
			    })
			    .map(s -> {
			        System.out.println("map: " + s);
			        return s.toUpperCase();
			    })
			    .forEach(s -> System.out.println("foreach: " + s));*/
		
		
		
	/*	
		System.out.println("***************************************");
		Stream.of("d2", "a2", "b1", "b3", "c")
			    .sorted((s1, s2) -> {
			        System.out.printf("sort: %s; %s\n", s1, s2);
			        return s1.compareTo(s2);
			    })
			    .filter(s -> {
			        System.out.println("Filter: " + s);
			        return s.startsWith("a");
			    })
			    .map(s -> {
			        System.out.println("Map: " + s);
			        return s.toUpperCase();
			    })
			    .forEach(s -> System.out.println("ForEach: " + s));
		
		
		
		
		
		System.out.println("***************************************");
		Stream.of("d2", "a2", "b1", "b3", "c")
			    .filter(s -> {
			        System.out.println("filter: " + s);
			        return s.startsWith("a");
			    })
			    .sorted((s1, s2) -> {
			        System.out.printf("sort: %s; %s\n", s1, s2);
			        return s1.compareTo(s2);
			    })
			    .map(s -> {
			        System.out.println("map: " + s);
			        return s.toUpperCase();
			    })
			    .forEach(s -> System.out.println("forEach: " + s));
		
		*/
		
		
		

//////////////////REUSING STREAMS///////////////////////////
		System.out.println("Reusing streams");
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		Stream<List<String>> stream = 
			    Stream.of(names);
			       
		
			stream.forEach(System.out::println);
			
//			stream.anyMatch(s -> true);    // ok
//			stream.noneMatch(s -> true);   // IllegalStateException
			
			
			
			
		Supplier<Stream<String>> streamSupplier =
				    () -> Stream.of("d2", "a2", "b1", "b3", "c")
				            .filter(s -> s.startsWith("a"));

		streamSupplier.get().anyMatch(s -> true);   // ok
		streamSupplier.get().forEach(System.out::println);  // ok
		
		
///////////////////FUNCTIONAL INTERFACE////////////////////////////////////
		// This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random();
        // Print the random value using get() 
        System.out.println(randomValue.get()); 
        
        
        
	}
	
		

}
