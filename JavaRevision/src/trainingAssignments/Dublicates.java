package trainingAssignments;

import java.util.Arrays;

public class Dublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j = 0;
		int[] arr= {1,3,2,0,2,1,8};
		boolean visited[] = new boolean[arr.length];
    	System.out.println(Arrays.toString(visited));
		for(i=0;i<arr.length;i++) {
			int count=1;
		    if(visited[i]==false) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				  count++;
				  visited[j]=true;
				}
			}
			if(count==1) {	
				System.out.println(arr[i]);
		}
		}		
		}

	}}


