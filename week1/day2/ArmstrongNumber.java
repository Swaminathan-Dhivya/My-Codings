package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int calculated, reminder, original;
		
		calculated=0;
		
		original=input;
		
		while(original>0) {
			reminder=original%10;
			original=original/10;
			calculated+=Math.pow(reminder, 3);
			
		}
		 if(calculated == input)
	         System.out.println(input + " is an Armstrong number");
	      else
	         System.out.println(input + " is not an Armstrong number");
	   }

		

	}


