package numArrays;

public class PalindromicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=120,j;
		
		for(int i=100;i<=n;i++) {
			    int org=i,rev=0;
				while(i>0) {
				 j =i%10;
				 rev = rev*10+j;
				i=i/10;
			}
			i = org;	
			if(org==rev) {
				System.out.println(org);
			
			}
		}

	}

}
