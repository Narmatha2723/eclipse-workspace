package numArrays;

public class Primeno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int temp=0;
		for(int i=2;i<9;i++) {
			if(n!=i) {
			if(n%i==0) {
				temp++;
			}
		}
		}	
		System.out.println(temp);
		if(temp==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
