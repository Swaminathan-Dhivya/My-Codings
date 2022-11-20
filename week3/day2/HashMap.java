package week3.day2;

import java.util.Map;
import java.util.HashMap;

public class HashMap {

	public static void main(String[] args) {
		int[] number= {1,3,2,1,4,2};
		Map<Integer, Integer> occ=new HashMap <Integer, Integer>();
		for(int i=0;i<number.length;i++) {
			//java 1.8
			//map.put(number[i],map.getOrDefault(number[i],0)+1)
			if(occ.containsKey(number[i])) {
				
				occ.put(number[i], occ.get(number[i])+1);
			}
			else {
				occ.put(number[i],1);
			}
			System.out.println(occ);
		}
	}

}
