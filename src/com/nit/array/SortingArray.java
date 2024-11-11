package com.nit.array;

public class SortingArray {
	public static void sortString() {
		String[] str= {"vasu","anjana","shiva","priya"};
		String temp=null;
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length-1;j++) {
				//Ascending order
				if(str[j].compareTo(str[j+1])>0) {
			//Desending Order
					//if(str[j].compareTo(str[j+1])<0) {
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
			
		}
		for(String st:str) {
			System.out.print(st+" ");
		}
		System.out.println();
		
	}
	public static void sortInt() {
		int[] a= {6,4,7,9,8,1,3,2,5};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				//Ascending Order
				if(a[j]>a[j+1]) {
					//Desending Order
				 // if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
        for(int i : a) {
        	System.out.print(i+" ");
        }
        System.out.println();
	}

	public static void main(String[] args) {
		sortString();
		sortInt();
		
		
	}

}
