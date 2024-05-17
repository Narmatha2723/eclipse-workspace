package trainingAssignments;

import java.util.Scanner;

public class LinearSearch {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
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
        System.out.println("Enter the element to be found:");
        int n1 = sc.nextInt();
        if(n1==arr[0]) {
        	System.out.println("Element is being at 0th index");
             }
        else if(n1!=arr[0]){
        	for(int i=1;i<arr.length;i++) {
        		if(n1==arr[i]) {
        			System.out.println("Element is being at"+" " +"th index");	
        	     	}
        	  }
             }
        else {	
        	System.out.println("Element not exist");
    	}
        
        
	}

}
