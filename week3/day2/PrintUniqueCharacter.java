package week3.day2;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.math3.ode.FirstOrderIntegrator;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String text="babu";
		
		Set<Character> uniquechar=new HashSet<Character>();
		 char[] character=text.toCharArray();
		for(int i=0;i<character.length;i++) {

            if(uniquechar.contains(character[i])) {

                uniquechar.remove(character[i]);

            }

            else

            {

            uniquechar.add(character[i]);

            }

        

}

        System.out.println(uniquechar);



}
}
	// value in the text.toCharArray() will put it in "i"
	/*
	 * for(char i:text.toCharArray()) { uniquechar.add(i);
	 * 
	 * }System.out.println("Character is unique"+uniquechar); }
	 * 
	 * }
	 */
