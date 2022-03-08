package com.input;

import java.util.Scanner;

class Test{
	void display(char ch,String str,int a,float b,double c) {
		System.out.println("The charter value of Charter :"+ch);
		System.out.println("The charter value of String :"+str);
		System.out.println("The charter value of Integer :"+a);
		System.out.println("The charter value of Float :"+b);
		System.out.println("The charter value of Double :"+c);
		
	}	
}


public class UserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any charter value from key board :");
		char ch=s.next().charAt(0);
		System.out.println("Enter any String value from key board :");
		String str=s.nextLine();
		System.out.println("Enter any Integer value from key board :");
		int a=s.nextInt();
		System.out.println("Enter any Float value from key board :");
		float b=s.nextFloat();
		System.out.println("Enter any Double value from key board :");
		double c=s.nextDouble();
		s.close();
		Test t=new Test();
		t.display(ch,str,a,b,c);

	}

}
