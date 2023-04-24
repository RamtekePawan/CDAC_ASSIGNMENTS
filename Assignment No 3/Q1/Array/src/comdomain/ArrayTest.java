package comdomain;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest{
	static Scanner sc = new Scanner(System.in);
	static void operations(int size) {
		int[] arr = new int[ size ];
		int sum = 0;
		for ( int i = 0,j=1; i < (arr.length); ++i,++j) {
			System.out.print("Enter Element at "+(j)+" Position :");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Contents of array : " +Arrays.toString(arr));	
		System.out.println("Sum of Array: " +sum);	
		System.out.println("Average of Array : " +sum/size);	
		Arrays.sort(arr);// Array Sorted
		System.out.println("Largest element in Array : "+ arr[arr.length-1]);
		System.out.println("Smallest element in Array : "+ arr[0]);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}

}