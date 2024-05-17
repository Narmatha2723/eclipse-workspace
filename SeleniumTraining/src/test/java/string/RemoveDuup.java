package string;

public class RemoveDuup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Banana";
		String empty = "";
		for(int i=0;i<name.length();i++) {
			if(!empty.contains(String.valueOf(name.charAt(i)))) {
				empty +=name.charAt(i);
			}
			}
		System.out.println(empty);
//		int dup[] = {2,1,4,1,1,5,6,7,3,2,5};
//		char ety[] = new char[dup.length];
//		for(int j=0;j<dup.length;j++) {
//			for(int k=0;k<dup.length;k++) {
//			if(dup[j]!=ety[k]) {
//				System.out.println(ety[k]);
//				
//			}
//			}
//		}

	}
	

}
