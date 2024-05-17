package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Narma");
		hm.put(2, "makka");
		hm.put(3,"ani");
		System.out.println(hm);
		for(Entry<Integer,String> hm1:hm.entrySet()) {
			System.out.println(hm1);
			if(hm1.getKey()==1) {
				System.out.println(hm1.getValue());;
			}
		}
		
		

	}

}
