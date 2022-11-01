package Practical;
//Write a java program to find the duplicate values of an array of integer values
public class DuplicateValues {
public static void main(String[] args) {
	int arr[]= {25,56,55,89,12,25,55,55};
	boolean b=true;
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				b=false;
			System.out.println(arr[i]);
			break;
			}
	}
}
	if(b==true) {
		System.out.println("There is no duplicate value present in the array");
	}
	else
	{
		System.out.println("Duplicate value is present in the array");
	}
}
}
