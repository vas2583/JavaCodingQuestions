/*Remove the junk characters in a String
String str = S@#$T%^&*@R)(*I123N~!@#$G;
Ouput = STRING*/
package com.nit.interviewprgms;

public class RemoveJunkSpeaceInString {

	public static void main(String[] args) {
		String s="S@#$T%^&*@R)(*I123N~!@#$G";
		String str=s.replaceAll("[^A-Z]","");
		System.out.println(str);
		

	}

}
