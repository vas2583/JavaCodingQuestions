package com.nit.array;

import java.util.Scanner;

public class RemoveTheElementInArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,60,70,80};
		Scanner sc=new Scanner(System.in);
		int removeEle=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(removeEle==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
