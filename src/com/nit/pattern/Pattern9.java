package com.nit.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int row_count=5;
		for(int i=1;i<=row_count;i++) {
			for(int j=row_count-i;j>=0;j--) {
				System.out.print("*");
				
				
			}
			System.out.println();
		}

	}

}
