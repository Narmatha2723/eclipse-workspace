package string;

public class PrintAlternateString {
	public static void main(String[] args) {
		String text = "Selenium Testing";
		String TextArr[] = text.split(" ");
		char text1[]=TextArr[0].toCharArray();
		char text2[]=TextArr[1].toCharArray();
		for(int i=0;i<=TextArr[1].length();i++) {
			System.out.println(text1[i]);
			try {
			for(int j=i;j<=i;j++) {
				System.out.println(text2[j]);
			}
			}
			catch(Exception e) {
				System.out.println("exception caught" +e);
			}
			
		}
	}

}
