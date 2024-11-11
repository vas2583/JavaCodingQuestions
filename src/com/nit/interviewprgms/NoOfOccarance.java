//Count the no.of occurrences each digit 
//in given array [1,1,1,3,2,2,2,2,0,0,0] 
//using HashMapOuput: 1=3, 3=1, 2=4, 0=3
package com.nit.interviewprgms;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccarance {
	public static void countOfArrayElementsUsingMap() {
		int[] a= {1,1,1,3,2,2,2,2,0,0,0};
		HashMap<Integer,Integer> mapCount=new HashMap<>();
		for(int num:a) {
			mapCount.put(num,mapCount.getOrDefault(num,0)+1);
		     }
		for(Map.Entry<Integer, Integer> entry:mapCount.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		countOfArrayElementsUsingMap();

	}

}
