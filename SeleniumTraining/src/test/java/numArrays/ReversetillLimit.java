package numArrays;

public class ReversetillLimit {
	
	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4,5,6,7};
		int l = 4;
		for(int i=0;i<l/2;i++) { 
			//l/2---> 2 times only the swap should occur
			//System.out.print(l-i-1 +" ");
			
		int tmp = a[i]; //{1,2} 
		
		a[i] = a[l-i-1]; //{4,3}
		//System.out.print(a[i]);
		a[l-i-1] = tmp; 
		
		
	//	System.out.print(a[l-i-1]);
		
			
		}
		System.out.print("\n");
		for(int j=0;j<a.length;j++) {
			//System.out.print("\n");
		System.out.print(a[j] +" ");
			
		}
		
	}

}
