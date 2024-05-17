package assignments;
public class cubeofdigit {
	 int sum=0;
	public void cube(int number) {
		while(number!=0)
		{
		int digit= number%10;
		sum=sum+digit*digit*digit;
		number=number/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {  
		 cubeofdigit cod = new cubeofdigit();
		 cod.cube(223);
	}

		}	
