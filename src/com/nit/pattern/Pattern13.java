package com.nit.pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int row_count=5;
		for(int i=1;i<=row_count;i++) {
			for(int j=1;j<=row_count;j++) {
				if(i+j>=row_count+1) {
					System.out.print(i);
				}
				else
					System.out.print(" ");
			    }
			System.out.println();
		}
		

	}

}
