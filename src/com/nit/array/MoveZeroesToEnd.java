package com.nit.array;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] a= {0, 1, 2, 0, 3, 0, 0};
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		 
        	for(int i=0;i<a.length;i++) {
        		System.out.print(a[i]);
        	}
        }
        
	}


