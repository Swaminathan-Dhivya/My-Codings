package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class setDuplicate {
	

	public static void main(String[] args) {
		String companyName="google";
		char[] company=companyName.toCharArray();
		Set<Character> onlyunique=new HashSet<Character>();
		for(int i=0;i<company.length;i++) {
			//String s=String.valueOf(company[i]).;		
			onlyunique.add(company[i]);
		}
		System.out.println(onlyunique);
	}

}
