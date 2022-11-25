package week3.day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 50 };

		Set<Integer> set = new TreeSet<Integer>();
		for (int i : data) {
			set.add(i);
		}
		System.out.println("Numbers in the Set"+set);
		List<Integer> li=new ArrayList<Integer>(set);
		
		System.out.println("Second Largest number in an array is: " + (li.get(li.size()-2)));

	}

}
