package com.gokul.poc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CholocateDistribution {

	public static void main(String[] args) {

		int chocolateCounts;
		int personCount;
		Scanner sc = new Scanner(System.in);
		chocolateCounts=sc.nextInt();
		personCount=sc.nextInt();
		Map<Integer, Integer> distributionList = new HashMap<Integer, Integer>();
		
		while(chocolateCounts>0){
			for(int i=1;i<=personCount;i++){
				if(chocolateCounts>0 ){
					if(distributionList.containsKey(i)){
						distributionList.put(i, distributionList.get(i)+i);
						chocolateCounts -= i;
						
					}else{
						distributionList.put(i, i);
						chocolateCounts -= i;
					}
				}else{
					break;
				}
				
			}
		}
		System.out.println(distributionList);
	}

}
