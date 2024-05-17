package numArrays;

public class multiplyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=435;
		int mul = 1;
		while(a>0) {
			int n=a%10;
			mul=mul*n;
			a=a/10;
			
		}
		System.out.println(mul);

	}

}
