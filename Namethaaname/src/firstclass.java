import java.util.Arrays;
import java.util.Scanner ;
public class firstclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length()==b.length()) {
			char[] arr1=a.toLowerCase().toCharArray();
			char[] arr2=b.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			a= new String(arr1);
			b=new String(arr2);
			System.out.println(a.equals(b) ? "Anagrams":"Not Anagrams");
			
		
	
		
		}

	}

}
