package com.nit.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int row_col=5;
		for(int i=1;i<=row_col;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j>=row_col+1) {
					System.out.print("*"+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
