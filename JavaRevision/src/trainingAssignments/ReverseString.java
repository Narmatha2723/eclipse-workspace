package trainingAssignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nation = "India";
        char[] arr = nation.toCharArray();
        for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
        
	}
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            
    	}   
        System.out.print('\n');
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
            
    	} 
}
}