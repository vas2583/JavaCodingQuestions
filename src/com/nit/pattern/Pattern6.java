package com.nit.pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int row_col=5;
		for(int i=1;i<=row_col;i++) {
			for(int j=1;j<=row_col;j++) {
				if(j==1||i==5||i==j) {
					System.out.print("*");	
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
