package numArrays;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		int original=a;
		int reverse=0;
		while(a>0) {
		   int n=a%10;
		   reverse = reverse*10+n;
		   a=a/10;
		}
		System.out.println(reverse);
		if(original==reverse) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
