package com.nit.array;

import java.util.Arrays;

public class CopyArryReverseOrder {

	public static void main(String[] args) {
		int[] a=new int[4];
		int[] b=new int[a.length];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
System.out.println("original Arrray");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
    }
//copy the Array
  System.out.println("reverse array");
   for(int i=0;i<b.length;i++) {
    	   b[i]=a[a.length-1-i];
    	
      }
   	
     System.out.println("B array is:");
       for(int i=0;i<b.length;i++) {
    	   System.out.print(b[i]+" ");
       }
       System.out.println("");
       System.out.println(Arrays.toString(b));
       
		

	}

}
