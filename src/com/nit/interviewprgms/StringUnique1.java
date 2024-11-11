package com.nit.interviewprgms;

public class StringUnique1 {

	public static void main(String[] args) {
		String[] st={"Hyderabad", "Telangana", "India", "Hyderabad", "Mumbai", "Mumbai", "Pune"};
		String[] temp=new String[st.length];
		int uniqueCount=0;
		for(int i=0;i<st.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<uniqueCount;j++) {
				if(st[i].equals(temp[j])) {
					duplicate=true;
				}
			   }
			  if(!duplicate) {
				  temp[uniqueCount]=st[i];
				  uniqueCount++;
			  }
				
			}
		for(int i=0;i<uniqueCount;i++) {
			System.out.print(temp[i]+" ");
		}
		}

}
