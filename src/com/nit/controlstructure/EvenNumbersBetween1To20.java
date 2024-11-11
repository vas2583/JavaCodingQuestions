package com.nit.controlstructure;

import java.util.Scanner;

public class EvenNumbersBetween1To20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Upto numbers");
		num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(i%2==0) {
				System.out.println("even Numer::"+i);
			  }
			else
				System.out.println("odd number::"+i);
			
			i++;
		}
		

	}

}
