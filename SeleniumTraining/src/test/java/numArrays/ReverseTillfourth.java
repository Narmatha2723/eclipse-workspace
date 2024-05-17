package numArrays;

public class ReverseTillfourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7};
		int i;
		for(i=0;i<=a.length;i++) {
			if(i<4) {
				for(i=3;i<=a.length;i--) {
					System.out.print(a[i]);
				}
				
			}
			
			else{ System.out.print(a[i]); }
			 
		}
		
		

	}}
		
//		int a[]={1,2,3,4,5,6,7};
//		
//		int lmt = 4;
//		int i;
//		for(i=0;i<lmt;i++) {
//			
//		int tmp = a[i];
//		a[i] = a[lmt-1-i];
//		a[lmt-1-i] = tmp;
//		
//		
//			
//		}
//		System.out.println(a[i]);
//		
//	}
//}
//4321567