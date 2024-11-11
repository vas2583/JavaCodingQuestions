//Write a Program to take an input of List of Strings 
//and returns a list of unique strings.
//Input = {“Hyderabad”, “Telangana”, “India”, “Hyderabad”,“Mumbai”, “Pune”}
//Ouput = {Telangana, India, Mumbai, Pune}

package com.nit.interviewprgms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintUniqueStringsInlList {
	

	public static void unique() {
		int a[] = {1,1,2,2,3};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			map.put(a[i],map.getOrDefault(a[i],0)+1);	
		    }
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
		}
	}
	public static void uniqueString() {
		String[] s= {"Hyderabad","Telangana","India","Hyderabad","Mumbai","Pune"};
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length;i++) {
			map.put(s[i],map.getOrDefault(s[i],0)+1);
		}
	     for(Map.Entry<String,Integer> entry:map.entrySet()) {
	    	 if(entry.getValue()==1) {
	    		 System.out.println(entry.getKey());
	    	 }
	     }
	}
		
	public static void main(String[] args) {
		List<String>str=List.of("Hyderabad","Telangana","India","Hyderabad","Mumbai","Pune");
		Set<String>s=new HashSet(str);
		List<String> li=new ArrayList<>(s);
		for(String s1:li)
			System.out.print(s1+" ");
		System.out.println("=====================");
		unique();
		uniqueString();
		
	    		 }
	    	
	    		 
	    	 
			
		
		

	}


