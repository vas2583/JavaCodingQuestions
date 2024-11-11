package com.nit.controlstructure;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the Num::");
	   int num=sc.nextInt();
	   int sum=0;
	   while(num!=0) {
		   int d=num%10;
		   sum=sum+d;
		   num=num/10;
		   
	   }
	   System.out.println(sum);

	}

}
