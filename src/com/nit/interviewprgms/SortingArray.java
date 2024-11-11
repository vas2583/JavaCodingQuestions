/*Write a Program to sort an array using Collections(List/Set/Map
Input = [1,3,5,7,9,2,4,6,8]
Output=[1,2,3,4,5,6,7,8,9]
Note:Try this program using strings as well.*/
package com.nit.interviewprgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {
   public static void reverseArray() {
	   Integer[] i= {1,3,5,7,9,2,4,6,8,9};
	   List<Integer>li=new ArrayList<>(Arrays.asList(i));
	   Collections.sort(li);
	   System.out.print(li);   
   }
   public static void reverseString() {
	   String[] str= {"apple","cat","banana","high","elep","dept"};
	   List<String>li=Arrays.asList(str);
	   Collections.sort(li);
	   System.out.print(li);
   }
   public static void main(String[] args) {
	   reverseArray();
	   System.out.println();
	   reverseString();
   }
}
