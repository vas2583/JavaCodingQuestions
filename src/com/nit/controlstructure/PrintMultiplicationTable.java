package com.nit.controlstructure;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		int TableNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Table Num::");
		 TableNum=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(i+"*"+TableNum+"="+(TableNum*i));
			i++;
		}

	}

}
