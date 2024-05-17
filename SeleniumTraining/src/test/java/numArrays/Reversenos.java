package numArrays;

public class Reversenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234567890;
		String n1 = Integer.toString(n);
		char []c=n1.toCharArray();
		System.out.println(c);
		int len = c.length;
		System.out.println(len);
		for(int i=len-1;i>=0;i--) {
			System.out.print(c[i]);
		
		}
		System.out.println('\n');
//		String s="narmatha";
//	char []c1=s.toCharArray();
//	System.out.println(c1);
		int m=0;
		for(int i=1;i<=10;i++) {
			m=n%10;
			System.out.print(m);
			n=n/10;
		}

	}

}
