package com.nit.interveiwPrograms;

import java.util.Arrays;

public class StringWithSubString {

	public static void main(String[] args) {
		String str="Internet chrome safari opera";
		//String s=str.substring(9);
		//System.out.println(s);
		
		String[] s=str.split("\\s");
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++) {
			String s1=s[i]+"-1";
			System.out.print(s1+" ");
		}
		

	}

}
