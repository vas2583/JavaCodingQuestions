package com.nit.interveiwPrograms;

public class CountOfDigits {
	public static void occurance(int[] a) {
		int count=0;
		int occuranceNum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==occuranceNum) {
				count++;
			}
		}
		System.out.println(occuranceNum+" is Repeted in==>"+count);
	}

	public static void main(String[] args) {
		int[] arr= {1,1,1,3,2,2,2,2,0,0,0};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					count++;	
				}
			}
		}
		System.out.println(count);
		System.out.println("=================");
		occurance(arr);

	}

}
