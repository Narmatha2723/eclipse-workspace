package string;

import java.util.Scanner;

public class Fizzbuzz {
	
	public void result(int i) {
		 if(i%3==0 && i%5==0) {
			System.out.println("fizzbuzz");
		}
		 else if(i%3==0) {
			System.out.println("fizz");
		}
		else if(i%5==0) {
			System.out.println("buzz");
		}
		else {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Fizzbuzz FB = new Fizzbuzz();
		for(int i=1;i<=n;i++) {
			FB.result(i);
			
		}

	}

}
