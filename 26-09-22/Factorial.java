// wap Find the factorial of a number 

import java.util.Scanner;

public class Factorial {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of n ");
	   int n=sc.nextInt();
	   int fact=1;
	   for(int i=1;i<=n;i++) {
		   fact = fact*i;   //4=> 1*2*3*4*=24
	   }
	   
	   System.out.println("The Factorial of " +n+ " is " +fact);
	   

	   
	   
   }
 }
