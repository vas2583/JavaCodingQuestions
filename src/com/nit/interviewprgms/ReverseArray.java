/*WAP to Print the reverse of a string     
Input = “Hyderabad is a Metropolitan city”*/      
package com.nit.interviewprgms;

public class ReverseArray {
	static String s="Hyderabad is a Metropolitan city";
   public static void reverseOfString() {
	    char[] ch=s.toCharArray();
	      int length=ch.length;
	      for(int i=length-1;i>=0;i--) {
	    	  System.out.print(ch[i]);
	      }
   }
   public static void reverseStringWords() {
	  
	   String[] a=s.split("\\s");
	   for(int i=a.length-1;i>=0;i--) {
		   System.out.print(a[i]+" ");
	   }
   }
	public static void main(String[] args) {
		 System.out.println(s);
		reverseOfString();
		System.out.println();
		reverseStringWords();
		
	      }
		

	}


