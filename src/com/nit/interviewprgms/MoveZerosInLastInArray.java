/*Move the zero elements to the end of array.
a.    input --> int a []={0,1,2,0,3,0,0};
b. output-->
int a []={1,2,3,0,0,0,0};  */ 
package com.nit.interviewprgms;

public class MoveZerosInLastInArray {

	public static void main(String[] args) {
		int[] ele= {0,1,2,0,3,0,0};
		int index=0;
		for(int i=0;i<ele.length;i++) {
			if(ele[i]!=0) {
				ele[index]=ele[i];
				index++;	
			}
			
			
		}
		while(index<ele.length) {
			ele[index]=0;
			index++;
		}

		for(int e:ele) {
			System.out.print(e+" ");
		}
	}

}
