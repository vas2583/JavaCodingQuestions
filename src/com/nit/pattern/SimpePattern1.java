package com.nit.pattern;

import java.util.Scanner;

public class SimpePattern1 {

	public static void main(String[] args) {
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the Row Count::");
		row=sc.nextInt();
		int col;
		System.out.println("enter the Col::");
		col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1; j<=col;j++) {
				System.out.print("hello"+" ");
			}
			System.out.println();
		}

	}

}
