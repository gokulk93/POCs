package com.gokul.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CustomSorting {

	public static void main(String[] args) {


        List<Integer> lst = new ArrayList<Integer>(12);
		lst.add(10);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(4);
		lst.add(8);
		lst.add(3);
		
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i));
			lst.add(1,999);
			System.out.println(lst.get(i+1));
			break;
			
		}
		/*Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext()) {
			Integer val = itr.next();
			if(val>4) {
				//System.out.println(val);
				itr.remove();		
			}
		}*/
                 	System.out.println(lst);


	}

}
