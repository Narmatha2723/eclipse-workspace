package string;

public class VertHorzString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent = "Collections are containers";
		String sentArr[] = sent.split(" ");
		for(int i=0;i<sentArr.length;i++) {
			if(i%2==0) {
				System.out.println(sentArr[i]);
			}
			else {
				for(int j=0;j<sentArr[i].length();j++) {
				System.out.println(sentArr[i].charAt(j));
			}
				
		}

	}

}
}