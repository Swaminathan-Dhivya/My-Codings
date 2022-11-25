package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 3, 4, 1, 6, 8,4,10 };
		
		
		Set<Integer> numbersinset=new TreeSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			numbersinset.add(arr[i]);
		}
		System.out.println("Given numbers are in Ascending Order: "+numbersinset);
		List<Integer> lst=new ArrayList<Integer>(numbersinset);
		for (int i = 0; i < lst.size()-1; i++) {
			if(lst.get(i)==lst.get(i+1)) {
            continue;				
			}else {
                for (int index = lst.get(i) + 1; index < lst.get(i+1); index++) {
                    System.out.println("Missing number is: "+index );
                }
            }
		}
	}
}
		/*for (int j = 1; j < numbersinset.size()+1; j++) {
			if(!numbersinset.contains(j))
			{
				System.out.println("Missing number is: "+j);
			}
		}

	}

}*/
