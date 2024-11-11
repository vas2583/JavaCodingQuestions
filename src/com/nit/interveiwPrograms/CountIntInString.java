package com.nit.interveiwPrograms;

import javax.xml.stream.events.Characters;

public class CountIntInString {

	public static void main(String[] args) {
		String str="abc123def456gh67";
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				int digit=ch[i]-'0';
				sum=sum+digit;
			}
		}
		System.out.println(sum);
		
		
		char c1='a';
		char c2='A';
		int c3=c1-c2;
		System.out.println(c1-c2);
	}
}
