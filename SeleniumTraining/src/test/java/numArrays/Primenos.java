package numArrays;

public class Primenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 75;
		int temp=0;
		for(int i=2;i<=9;i++) {
			if(a!=i) {
		if(a%i==0) {
			System.out.println(a + "is not a prime");
			temp=1;
			break;
		}
		}
	}
		if(temp==0) {
			System.out.println(a + "is a prime");
			
		}
	}

}
