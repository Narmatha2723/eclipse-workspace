package numArrays;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "Narmatha is an Automation Test Engineer";
		String Long[] = longStr.split(" ");
		System.out.println(Long[1].length());
		int min=0,max=0;
		for(int i=0;i<Long.length;i++) {
			for(int j=i+1;j<Long.length;j++) {
				if(Long[i].length()<Long[j].length()) {
					min=Long[i].length();
					
				}
				else if(Long[i].length()>Long[j].length()) {
					max=Long[i].length();
				}
			}
		}
		System.out.println(min +","+max);
		

	}

}
