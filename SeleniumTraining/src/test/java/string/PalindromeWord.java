package string;

public class PalindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="Nithya";
		String rev = "";
		for(int i=word.length()-1;i>=0;i--) {
			 rev=rev+word.charAt(i);
			 }
		System.out.println(word);
		System.out.println(rev);
		if(word.equalsIgnoreCase(rev)) {
			System.out.println("palindrome String");
		}
		else {
			System.out.println("not a palindrome string");
		}
		
	}

}
