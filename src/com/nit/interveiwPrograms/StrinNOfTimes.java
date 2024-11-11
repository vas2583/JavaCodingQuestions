package com.nit.interveiwPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StrinNOfTimes {
	public static void printDuplicatesinArray() {
		int[] a= {1,2,4,1,2,3,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+"==> Duplicate Number");
				}
			}
			
		}
	}
	public static void removeDulicate() {
		int[] a= {1,2,4,1,2,3,5};
		//1st Method Using Set inter face
		  Set<Integer> set=new HashSet();
		  for(int i=0;i<a.length;i++) {
			  set.add(a[i]);
		  }
		  Object[] temp=set.toArray();
		   for(int i=0;i<temp.length;i++) {
			   System.out.print(temp[i]+" ");
		   }
		   System.out.println("--------------");
		//2nd without collection
		   int[] temp1=new int[a.length];
		   int uniqueElement=0;
		   for(int k=0;k<a.length;k++) {
			   boolean isDuplicate=false;
			   for(int l=0;l<uniqueElement;l++) {
				   if(a[k]==temp1[l]) {
					   isDuplicate=true;
					   break;
				   }
			   }
			   if(!isDuplicate) {
				   temp1[uniqueElement]=a[k];
				   uniqueElement++;
			   }
		   }
		   for(int m=0;m<uniqueElement;m++) {
			   System.out.print(temp1[m]+" ");
		   }
		  
	}
	public static void removeWhiteSpeaceString() {
		String str="s@#1$*uhg&(";
		String str1=str.replaceAll("[^A-z a-z 1-9]","");
		System.out.println(str1+"==>ofter removeing WhiteCharacters");
	}
	public static void sumOfNumInString() {
		String str="abc123def456gh78";
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&& ch[i]<='9') {
				int x=ch[i]-'0';
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}
	public static void NoOfOccrunace() {
		int[] a= {1,3,2,4,1,2,3,1};
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
			for(int i=0;i<a.length;i++) {
				int n=a[i];
				if(map.containsKey(n)) {
					int count=map.get(n);
					count++;
					map.replace(n,count);	
				}
				else
					map.put(n,1);	
			}
			for(Integer a1:map.keySet()) {
				System.out.print(a1+"="+map.get(a1)+" ");
			}
			System.out.println();
			System.out.println(map.entrySet());
			
		}
	
	public static void convertStringNumeric() {
		String str="aaabbc";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c);
				count++;
				map.replace(c,count);
			}
			else {
				map.put(c,1);
			}
		}
		for(Character key:map.keySet()) {
			System.out.print(key+""+map.get(key));
			
		}
		System.out.println(map.entrySet());
	}
	public static void withOutPredefined() {
		String str="a3b2c1";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				System.out.print(ch[i]);
			}
			else {
				int x=ch[i]-'0';
				for(int j=1;j<x;j++) {
					System.out.print(ch[i-1]);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		String str="3a2b1c";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
			else {
				int x=Character.getNumericValue(str.charAt(i));
				  for(int j=1;j<x;j++) {
					  System.out.print(str.charAt(i+1));  
				  }
				 
			}    
		}
		System.out.println();
		System.out.println("====================");
		withOutPredefined();
		System.out.println
		("====================");
		convertStringNumeric();
		System.out.println("====================");
		NoOfOccrunace();
		System.out.println("====================");
		sumOfNumInString();
		System.out.println("====================");
		removeWhiteSpeaceString();
		System.out.println("====================");
		printDuplicatesinArray();
		System.out.println("====================");
		removeDulicate();
	}

}
