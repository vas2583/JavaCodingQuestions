//Write a Program to remove duplicates from an array using loops. 
//Input = [“Hyderabad”, “Telangana”, “India”, “Hyderabad”, “Mumbai", "Mumbai” “Pune”]
//Ouput = [Hyderabad,Telangana, India, Mumbai, Pune]

package com.nit.interviewprgms;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		String[] st={"Hyderabad", "Telangana", "India", "Hyderabad", "Mumbai", "Mumbai", "Pune"};
	      	String temp[] =new String[st.length];
	      	int uniqueCount=0;
	      for(int i=0;i<st.length;i++) {
	    	  boolean isDuplicate=false;
	    	  for(int j=0;j<uniqueCount;j++) {
	    		  if(st[i].equals(temp[j])) {
	    			  isDuplicate=true;
	    			  break;
	    		    }
	    	  
	    		  }
	    	  if(!isDuplicate) {
	    		  temp[uniqueCount]=st[i];
	    		  uniqueCount++;
	    	     }
	    	  }
	      
	      System.out.print("uniques::");
	      for(int i=0;i<uniqueCount;i++) {
	    	  System.out.print(temp[i]+" ");
	      }
	}
}
	
	
