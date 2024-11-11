package com.nit.controlstructure;

import java.util.Scanner;

public class NumberIsPositiveAndNagetive {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the Numebr::");
	int num=sc.nextInt();
	if(num<0)
		System.out.println(num+"==> is Negative");
	else
		System.out.println(num+"===>is positve");

	}

}
