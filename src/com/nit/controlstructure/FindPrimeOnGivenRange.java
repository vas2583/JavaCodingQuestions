package com.nit.controlstructure;

public class FindPrimeOnGivenRange {

	public static void main(String[] args) {
		int x=2;
		int y=5;
		for(int i=x;i<=y;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" is Prime");
			}
		}
		
	}

}
