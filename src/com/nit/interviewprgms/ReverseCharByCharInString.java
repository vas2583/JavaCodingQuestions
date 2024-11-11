/*Reverse the String without changing it's position
String str = “Hyderabad is a city”;
Output = “dabaredyH si a ytic”;*/
package com.nit.interviewprgms;

public class ReverseCharByCharInString {

	public static void main(String[] args) {
		String str="Hyderabad is a city";
		String[] s=str.split("\\s");
		for(String s1:s) {
			System.out.println(s1);
		}
		  for(int i=0;i<s.length;i++) {
			String reverse=s[i];
			StringBuffer sb=new StringBuffer(reverse);
			StringBuffer re=sb.reverse();
			System.out.print(re+" ");
			
		}

	}

}
