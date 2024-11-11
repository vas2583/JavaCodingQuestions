package com.nit.controlstructure;

import java.util.Scanner;

public class ArthematicOperationUsingSwitch {

	public static void main(String[] args) {
		int a,b;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the Operator::");
		System.out.println("enter a::");
		a=sc.nextInt();
		System.out.println("enter b::");
		b=sc.nextInt();
		System.out.println("enetr operator::");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':
			int c=a+b;
			System.out.println(c);
			break;
		  case '-':
			int c1=a-b;
			System.out.println(c1);
			break;
		 case '*':
			int c2=a*b;
			System.out.println(c2);
			break;
		default:
			System.out.println("enter the correct Operator");
			
		}
		

	}

}
