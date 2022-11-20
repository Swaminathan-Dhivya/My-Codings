package week1.day2;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arr= {6,7,8,4,9,8};
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println(arr[j]);
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate value(s) are: " +arr[i]);
				}
			}
		}

	}

}
