package com.Assignment;
/*
 * 1. Write a Java program to find the index of an array element
 */
import java.util.Scanner;

public class FindIndex {
  public static void findIndex(int arr[],int n) {
	  boolean b=false;  
	  for(int i=0;i<arr.length;i++) {  // using for loop for traversing an array 
		  if(arr[i]==n) {
			  b=true;
			  System.out.println("The index of this array element is "+i);
			  break;
		  }
		  
	  }
	  if(b==false) {
		  System.out.println("This element is not present inside the array");
	  }
  }
  public static void main(String[] args) {
	int arr[]= {3,6,8,2,7,9,4};  // array inc and dec 
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the element's index you want to find");
		int n=sc.nextInt();
		findIndex(arr,n);
	}
}
}