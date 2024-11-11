package com.nit.controlstructure;

import java.util.Scanner;

public class FactrosOfNumberAndNoOfFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+"==>is Factor of The Num"+num);
				count++;
				sum=sum+i;
			}
		}
		System.out.println(count+"==>the Count Of Factors");
		
		if(count==2) {
			System.out.println(num+"==>prime Number ");
		}
		
        
	}

}
