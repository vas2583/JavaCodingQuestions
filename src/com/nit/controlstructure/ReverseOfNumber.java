package com.nit.controlstructure;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number::");
	     num=sc.nextInt();
	     int temp=num;
	     int rev=0;
	     while(num!=0) {
	    	 int d=num%10;
	    	 rev=rev*10+d;
	    	 num=num/10;
	    	 
	     }
	     System.out.println(rev);
	     if(temp==rev) {
	    	 System.out.println("PalanDrome number::");
	     }

	}

}
