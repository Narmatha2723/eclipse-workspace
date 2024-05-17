package assignments;

public class unlabled {
	public static void main(String[] args) {
		String[] str = {"mnjb","dugu","efed","null","jbdf"};
		for(int i=0;i<str.length;i++) {
			if(str[i]==null) {
				continue;
			}
			System.out.println(str[i]);
		}
			
		}

}
