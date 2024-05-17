package javapractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setmethods {
	
	public static void main(String args[]) {
		
		Set<String> sets = new HashSet<String>();
		sets.add("nithya");
		sets.add("anitha");
		System.out.println(sets);
		Iterator<String> it = sets.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
	}

}
