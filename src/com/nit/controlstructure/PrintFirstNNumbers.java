package com.nit.controlstructure;

import java.util.Scanner;

public class PrintFirstNNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num::");
	int num=sc.nextInt();
	int i=1;
	while(i<=num) {
		System.out.print(i+" ");
		i++;
	}
	System.out.println("");

	}

}
