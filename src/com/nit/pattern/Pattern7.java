package com.nit.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int row_col=7;
		int mid=(row_col/2)+1;
		for(int i=1;i<=row_col;i++) {
			for(int j=1;j<=row_col;j++) {
				if(i==mid || j==mid)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
