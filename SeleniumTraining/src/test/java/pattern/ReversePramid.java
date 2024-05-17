package pattern;

public class ReversePramid {

	public static void main(String[] args) {
		 
		int a = 4;
		for(int i=a;i>0;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("**************");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("**************");
		int b = 4321;
		while(b>0) {
			System.out.println(b);
			b=b/10;
			
			
		}
		

	}

}
