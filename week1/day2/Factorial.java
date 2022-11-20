package week1.day2;

public class Factorial {

	public static void main(String[] args) {

		int input = 5;

		int fact = 1;
		//Here it will multiply like 1*2*3*4*5
		/*for (int i = 1; i <= input; i++) {

			fact = fact * i;

		}*/
		//Here it will multiply like *5*4*3*2*1
		for (int i = input; i >= 1; i--) {

			fact = fact * i;

		}
		System.out.println("Factorial of 5 is:" + fact);

	}
		

}
