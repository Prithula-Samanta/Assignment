package Assignment;
import java.util.Scanner;
//write a java program to test if an array contains a specific value
public class SpecificValue {
	public static void main(String[] args) {
		int arr[]= {12,45,56,89,55};
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the target value. " );
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
				break;
		}
		}
	if(count==1) {
		System.out.println("The target value is found.");
	}
	else {
		System.out.println("The target value is not found.");

	}
}}
