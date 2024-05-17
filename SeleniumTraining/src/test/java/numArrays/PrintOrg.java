package numArrays;

import java.util.HashSet;
import java.util.Set;

public class PrintOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,1,2,3,4,5,2,3,6};
		int visited = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=visited) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=visited;
				}
			}
			System.out.println(a[i]);
		}

	}
		int arr[] = {1,2,3,1,2,3,4,5,2,3,6};
		Set<Integer> s = new HashSet<Integer>();
		for(int k =0;k<arr.length;k++ ) {
			s.add(arr[k]);
		}
		System.out.print(s);

}}
