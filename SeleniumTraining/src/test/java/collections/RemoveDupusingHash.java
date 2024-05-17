package collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupusingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,1,2,3,4,5,9,7,9,7,6,8};
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);

	}

}
