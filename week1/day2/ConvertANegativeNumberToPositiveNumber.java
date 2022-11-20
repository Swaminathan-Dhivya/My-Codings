package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number = -40;
		
		if(number<0) {
			int positivevalue=(~(number-1));
			System.out.println("Negative value converted to Positive = "+positivevalue);
		}

	}

}
