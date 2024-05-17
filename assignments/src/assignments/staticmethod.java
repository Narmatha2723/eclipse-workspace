package assignments;

public class staticmethod {
		int a=5;
		int b=10;
        int c=a+b;
	public void simple() {
		System.out.println(c);
	}
	public static void main(String[] args) {
		int a=5;
		int b=10;
        int c=a+b;
		staticmethod d=new staticmethod();
		d.simple();
	}
}