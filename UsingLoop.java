//There are two type of loop 
package com.array;
public class UsingLoop {

	public static void main(String[] args) {
		int a[]= {10,-2,4,5,7,44,70,-4,-2,-9};
		/*
		 This is normal for loop to print data using index value 
		  
		 for(int i=0;i<a.length;i++)
		{
			System.out.println("The index of array " +(i+1)+ " and the element present in array "+a[i]);
		}
      */
	
	   System.out.println(" Element of the array");
	   
	   //this is for  each loop It come in java 5
	   for(int num : a) 
	   {
		   System.out.print(num+ " ");  
		   
	   }
	
	
	}

}
