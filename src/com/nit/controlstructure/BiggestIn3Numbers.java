package com.nit.controlstructure;

import java.util.Scanner;

public class BiggestIn3Numbers {

	public static void main(String[] args) {
		//if
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x::");
		x=sc.nextInt();
		System.out.println("enter the y::");
		y=sc.nextInt();
		System.out.println("enter the z::");
		z=sc.nextInt();
		if(x>y && x>z)
			System.out.println(x+"==> is big");
		else if(y>x && y>z)
			System.out.println(y+"==>is big");
		else
			System.out.println(z+"==> is big");
		
		//using ternary
		System.out.println("=====================");
		int big=x>y?(x>z?x:z):(y>z?y:z);
		System.out.println(big);
	}

}
