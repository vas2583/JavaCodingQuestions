package com.nit.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInListCol {

	public static void main(String[] args) {
		List<String> input=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the No of the Strings");
		int n=sc.nextInt();
		System.out.println("enter the String::");
		for(int i=0;i<=n;i++) {
			 String list=sc.nextLine();
			 input.add(list);
		}
		
		Set<String> uni=new HashSet<String>(input);
		
		List<String> unique=new ArrayList<String>(uni);
	     for(String uniques:unique) {
	    	 System.out.print(uniques+" ");
	     }
	}

}
