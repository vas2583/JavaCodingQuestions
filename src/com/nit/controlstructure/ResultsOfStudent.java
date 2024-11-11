package com.nit.controlstructure;

import java.util.Scanner;

public class ResultsOfStudent {

	public static void main(String[] args) {
		int m,p,c,total;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Maths Marks::");
		m=sc.nextInt();
		System.out.println("enter the physics marks::");
		p=sc.nextInt();
		System.out.println("enetr the che::");
		c=sc.nextInt();
		total=m+p+c;
		avg=total/3;
		if(m<40 ||p<40 ||c<40)
			System.out.println("fail");
		else if(avg>60)
			System.out.println("firstClass");
		else if(avg>50)
			System.out.println("secondClass");
		else
			System.out.println("Third Class");
		
		
	}

}
