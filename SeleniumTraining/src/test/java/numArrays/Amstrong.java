package numArrays;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,m=0;
		while(n>0) {
			int a=n%10;
		    m=m+(a*a*a);
			n=n/10;
		
			}
		System.out.println(m);

	}

}
