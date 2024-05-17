package numArrays;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int first=1,sec=1,curr=0;
		System.out.println(first);
		System.out.println(sec);
		while(n>0) {
			curr=first+sec;
			System.out.println(curr);
			first=sec;
			sec=curr;
			n--;
		}

	}

}
