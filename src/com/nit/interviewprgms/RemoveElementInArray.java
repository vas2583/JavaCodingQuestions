//Given one Array with some values(3,1,2,3,4,5) 
//and need to remove  the value randomly of user’s choice
package com.nit.interviewprgms;

import java.util.Scanner;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int[] arr= {3,1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the remove element");
		int str=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(str==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
				 arr[j]=arr[j+1];
			    }
			break;
			
		  }
		}
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
				
	}

}
