package string;

public class ReverseAlter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Narmatha Eswaran is an engineer";
		String[] arr = name.split(" ");
		
		
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				char RevArr1[] = arr[i].toCharArray();
				for(int j=RevArr1.length-1;j>=0;j--) {
					System.out.print(RevArr1[j]);
					
				}	
				System.out.print('\t');
				}
			else {
			System.out.print(arr[i]);
			System.out.print('\t');
			}
			
		}

	}

}
