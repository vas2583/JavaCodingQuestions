package com.nit.pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int row_count=5;
		int p=(row_count/2)+1;
		for(int i=1;i<=row_count;i++) {
			for(int j=1;j<=row_count;j++) {
				if(i+j==p+1||j-i==p-1||i+j==8) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
