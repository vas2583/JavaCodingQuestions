package com.nit.controlstructure;

import java.util.Scanner;

public class BiggestDigitInNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the Numebr::");
		int num=sc.nextInt();
		int big=0;
		while(num!=0) {
		   int d=num%10;
		   if(d>big){
			   big=d;
		   }
		   num=num/10;
		}
		System.out.println(big+"==>is Bigeest NuMBER:;");

	}

}
