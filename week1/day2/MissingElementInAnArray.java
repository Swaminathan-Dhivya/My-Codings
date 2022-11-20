package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 3, 4, 1, 6, 8 };
		int n = arr.length + 1;
		// Arrays.sort(arr);
		int sum = (n * (n + 1) / 2);
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println(sum);

		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

	}

}
