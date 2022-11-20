package week2.day2;
//Given a string s consisting of words and spaces, 
//return the length of the last word in the string.

public class JavaCh1 {

	public static void main(String[] args) {
		String s = "fly me  to  the moon";
		String[] split=s.split(" ");
		int length =split[split.length-1].length();
		System.out.println("Length of the last word in the string ("
		+split[split.length-1] +")"+" is "+length);
	}

}
