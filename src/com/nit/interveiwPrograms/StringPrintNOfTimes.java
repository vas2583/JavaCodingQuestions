package com.nit.interveiwPrograms;


public class StringPrintNOfTimes {

	public static void main(String[] args) {
		String str="a3b2c1";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))){
				System.out.print(str.charAt(i));
				
			}
			else{
				int x=Character.getNumericValue(str.charAt(i));
				for(int j=1;j<x;j++) {
					System.out.print(str.charAt(i-1));
					
				}
				
			}
		}

	}

}
