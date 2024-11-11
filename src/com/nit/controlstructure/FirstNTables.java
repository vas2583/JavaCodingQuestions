package com.nit.controlstructure;

import java.util.Scanner;

public class FirstNTables {

	public static void main(String[] args) {
		int howManyTables;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count Of Tables");
		howManyTables=sc.nextInt();
		for(int i=1;i<=howManyTables;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\n");
			}
			System.out.println("");
			
			
			
		}

	}

}
