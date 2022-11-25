package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitstring = text.split(" ");
		System.out.println("Original Text:" + text);
		
		Set<String> onlyunique = new LinkedHashSet<String>();
		for (int i = 0; i < splitstring.length; i++) {
			onlyunique.add(splitstring[i]);
			
		}
		
		String uniquewords =onlyunique.toString();
		uniquewords=uniquewords.replace(",","");
		System.out.println("Removed duplicate words from the Original Text:" +uniquewords );
	}

}
