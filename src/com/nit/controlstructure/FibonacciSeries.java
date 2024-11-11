package com.nit.controlstructure;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x=-1;
		int y=1;
		int num=10;
		int f=0;
		for(int i=1;i<=10;i++) {
		    f=x+y;
		    System.out.println(f);
		    x=y;
		    y=f;
		}
		

	}

}
