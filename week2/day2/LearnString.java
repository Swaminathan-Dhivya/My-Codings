package week2.day2;

import javax.print.DocFlavor.CHAR_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnString {

	public static void main(String[] args) {
		//String literal
		String S="Test Leaf";
		
		System.out.println("Length of the Strings"+S.length());
		
		//to get the position of a specific char
				int indexof=S.indexOf('W');
				System.out.println("Index position of"+indexof);
				
		//String object
		String s=new String("TestLeaf");
		System.out.println(s.length());
		
		//To compare the string
		if(S.equals(s)) {
			System.out.println(S+" and "+s+"are Matching");
		}
		else {
			System.out.println("Not matching");
		}
		//To get the number of characters in a string
		System.out.println("number of characters in a string"+S.length());
		
		//To convert a string to a char array
		char[] chliteral=S.toCharArray();
		System.out.println(chliteral[8]);
		//Incase the string is given in runtime n to get the last letter
		char ch=S.charAt(S.length()-1);
		
		//SUbstring
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,6));
	}

}
