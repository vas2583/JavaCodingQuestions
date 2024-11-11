package com.nit.array;

public class PrimeNumberInRangePrintFirstTwo {

	public static void main(String[] args) {
	
		int a=100,b=200;
		int[] arr=new int[100];
		int data=0;
		int k=0;
		for(int i=a;i<=b;i++) {
			int count=0;
			 for(int j=1;j<=i;j++) {
				 if(i%j==0) {
					 count++; 
				 }
				 
			 }
			 if(count==2) {
				 arr[k]=i;
				 k++;
				 data++;
			 }
		}
		for(int i=0;i<data;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
