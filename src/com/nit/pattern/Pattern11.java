package com.nit.pattern;

public class Pattern11 {
	static int row_count=5;
	public static void ivaluePrint() {
		for(int i=1;i<=row_count;i++) {
			for(int j=1;j<=row_count;j++) {
				System.out.print(i);
				
			}
			System.out.println();
		}

	}
	public static void jvaluePrint() {
		for(int i=1;i<=row_count;i++) {
			for(int j=1;j<=row_count;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		ivaluePrint();
		System.out.println();
		jvaluePrint();
	}
	

}
