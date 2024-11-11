package com.nit.controlstructure;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int factorialNum;
		int res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number::");
		factorialNum=sc.nextInt();
		for(int i=1;i<=factorialNum;i++) {
			res=res*i;
		}
		System.out.println(res);
		

	}

}
