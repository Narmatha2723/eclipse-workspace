package string;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Selenium";
		int count=0;
		char arr[] = word.toCharArray();
		System.out.println(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'|| arr[i]=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
