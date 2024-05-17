package string;

import java.util.HashSet;
import java.util.Set;

public class printOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'s','t','r','s','t','i','n','g','r'};
		String str = "";
		for(int i=0;i<c.length;i++) {
			if(!str.contains(String.valueOf(c[i]))) {
				str += String.valueOf(c[i]);
			}
		}
		System.out.println(str);
		
		Set<Character> s = new HashSet<Character>();
		for(int i=0;i<c.length;i++) {
			s.add(c[i]);
		}
		System.out.println(s);
		System.out.println(s);

	}

}
