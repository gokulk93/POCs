package com.gokul.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 

public class ListUsingLambdaExp {

	public static void main(String[] args) {
		
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		
		//Prior Java 8 :
		for (String feature : features) {
		   System.out.println(feature);
		}

		//In Java 8:
		features.forEach(n -> System.out.println(n));
		// Even better use Method reference feature of Java 8
		features.forEach(System.out::println);
		
		Predicate<String> p = (s)->s.startsWith("D");
		// Iterate through the list 
        for (String st:features) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        } 
        


        int a = 5; 
  
        // lambda expression to define the calculate method 
        Square sqr = (int x)->x*x; 
        
        int ans = sqr.calculate(a);
        System.out.println(ans);
        
        
        
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    	IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
    	System.out.println("Highest prime number in List : " + stats.getMax());
	}	
		

}
