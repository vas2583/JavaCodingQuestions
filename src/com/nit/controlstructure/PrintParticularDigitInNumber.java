package com.nit.controlstructure;

import java.util.Scanner;

public class PrintParticularDigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number::");
		int num=sc.nextInt();
		System.out.println("enter the search Number");
	     int searchNum=sc.nextInt();
	     boolean found=false;
		while(num!=0) {
			int d=num%10;
			if(d==searchNum) {
				found=true;
			    }
			num=num/10;
		}
		
		if(found==true) 
			System.out.println("search Number found");
			else
				System.out.println("search Numebr is Not Found");
		}
	}


