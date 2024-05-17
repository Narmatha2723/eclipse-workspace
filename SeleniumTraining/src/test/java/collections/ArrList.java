package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		arr.add(1,4);
		System.out.println(arr);
		List<Integer> arr1=Arrays.asList(1,2,3,4,5);
		System.out.println(arr1);
		for(int a:arr) {
			System.out.println(a);
		}
		Iterator<Integer> it = arr1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
