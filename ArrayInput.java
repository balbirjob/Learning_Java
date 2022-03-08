package com.array;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Arry");
		int num=sc.nextInt();
		System.out.println("............................");
		System.out.println("Size of Arry:" +num);
		
		
		//...........................................
                  //		integer Input in Array
		//...........................................
//		int fist[]=new int[num];
//		System.out.println("Enter the element of Arry");
//		for(int i=0;i<num;i++)
//		{
//			fist[i]=sc.nextInt();
//		}
		
		
		//...........................................
        //		Float Input in array
       //...........................................
		
//		float seco[]=new float[num];
//		System.out.println("Enter the element of Arry");
//		for(int i=0;i<num;i++)
//		{
//		seco[i]=sc.nextFloat();
//		}
		
		

		//...........................................
        //		Double Input in array
       //...........................................

//		Double thre[]=new Double[num];
//		System.out.println("Enter the element of Arry");
//		for(int i=0;i<num;i++) 
//		{
//			thre[i]=sc.nextDouble();
//		}
		
		
		//...........................................
        //		Char Input in array
       //...........................................
	
		char forth[]=new char[num];
		System.out.println("Enter the element of Arry");
		//forth[]=sc.next().toCharArray();
		for(int i=0;i<num;i++)
		{
			forth[i]=sc.next().charAt(0); 
		}
		System.out.println("............................");
		System.out.println("Print the element of Arry");
		for(int i=0;i<num;i++) 
		{
			System.out.print(forth[i]+"  ");
		}
		
		sc.close();

	}

}
