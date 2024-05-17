package trainingAssignments;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0 ; i<n; i++ ) {
        	arr[i] = sc.nextInt();
        }
		for(int i=0 ; i<n; i++) {
			System.out.println(arr[i]);
	}

	}
}
