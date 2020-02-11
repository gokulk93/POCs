package com.gokul.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum {

	public static void main(String[] args) {

		int[] a = {5,5,8,9,6,3,7,4,8,3,6,9};
		Arrays.sort(a);
		int sum =0;
		int min = a[0];
		for(int num : a){
			sum +=num;
		}
		System.out.println(sum);
		System.out.println(min);
		System.out.println(sum-min);
		
		List<String> names= new ArrayList<String>();
		names.add("abc");
		names.add("xyz");
		names.add("abc");
		names.add("fgh");
		names.add("ijk");
		names.add("ijk");
		names.stream().filter(i -> Collections.frequency(names, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
