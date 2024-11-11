package com.nit.controlstructure;

import java.util.Scanner;

public class NumberIsAmstrongOrNot {
  public static void twoDigit(int num) {
	  int temp=num;
	  int dec=0;
	  int sum=0;
	  while(num!=0) {
		 dec=num%10;
		 sum=sum+dec*dec;
		 num=num/10;
	  }
	  if(temp==sum) {
		  System.out.println("amstrong number");
	  }
	  else
		  System.out.println("not a amstrong Number");
  }
  
  public static void threeDigit(int num) {
	  int temp=num;
	  int dec=0;
	  int sum=0;
	  while(num!=0) {
		 dec=num%10;
		 sum=sum+dec*dec*dec;
		 num=num/10;
	  }
	  if(temp==sum) {
		  System.out.println("amstrong number");
	  }
	  else
		  System.out.println("not a amstrong Number");
  }
  
  public static void main(String[] args) {
	  int no;
	  int n1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the twoDigit Number::");
	 no=sc.nextInt();
	  twoDigit(no);
	  System.out.println("enter the three Digit Number::");
	  n1=sc.nextInt();
	  threeDigit(n1);
}
}
