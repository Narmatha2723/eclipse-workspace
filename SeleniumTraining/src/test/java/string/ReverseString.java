package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Narmatha Eswaran is an engineer";
		String[] arr = name.split(" ");
		
		// print array elements in a ascending order
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] +'\t');
		}
		//print array elements in a descending order
		System.out.println('\n');
		for(int i=arr.length-1;i>=0;i--) {
		   System.out.print(arr[i] +'\t');
		}
		System.out.println('\n');
		//print array elements which is in a even place
		for(int i=0;i<=arr.length-1;i=i+2) {
			System.out.print(arr[i] +'\t');
		}
		//print array elements which is in a even place and in reverse
		System.out.println('\n');
		for(int i=arr.length-1;i>=0;i=i-2) {
		   System.out.print(arr[i] +'\t');
		}
		//print array elements which is in a odd place
		System.out.println('\n');
		for(int i=1;i<=arr.length-1;i=i+2) {
			System.out.print(arr[i] +'\t');
		}
		System.out.println('\n');
		//print array elements which is in a even place and in reverse
		for(int i=arr.length-1;i>=1;i=i-2) {
		   System.out.print(arr[i] +'\t');
		}
	
	

	}

}
