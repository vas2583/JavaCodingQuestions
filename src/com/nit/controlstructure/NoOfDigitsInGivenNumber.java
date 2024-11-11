package com.nit.controlstructure;

import java.util.Scanner;

public class NoOfDigitsInGivenNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the num::");
		num=sc.nextInt();
		int noofDigits=0;
		while(num!=0) {
			num=num/10;
			noofDigits++;
			
		}
		System.out.println(noofDigits);
		

	}

}
