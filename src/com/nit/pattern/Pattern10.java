package com.nit.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int row_col=5;
		for(int i=1;i<=row_col;i++) {
			for(int j=1;j<=row_col;j++) {
				if((i+j)%2==0){
					System.out.print("+");
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		

	}

}
