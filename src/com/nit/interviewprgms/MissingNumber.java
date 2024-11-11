package com.nit.interviewprgms;

public class MissingNumber {

	public static void main(String[] args) {
		int[] i= {1,2,3,5,6,7,8,9,10};
	     int count=0;
	     int count1=0;
	     for(int j=0;j<i.length;j++) {
	    	 count=count+i[j];
	     }
	     for(int k=1;k<=10;k++) {
	    	 count1=count1+k;
	     }
	     System.out.println(count1-count);
	}

}
