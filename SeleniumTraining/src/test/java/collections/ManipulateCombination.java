package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulateCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,1,5,6,7,3};
		int count =0;
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.println(a[i] +","+a[j]);
				count++;
				int ans = a[i]*a[j];
				arr.add(ans);
			}
		}
		System.out.println(count);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println("Minimum: " +arr.get(0));
		System.out.println("Maximun: " +arr.get(arr.size()-1));
		
		

	}

}
