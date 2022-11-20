package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum;

				System.out.print("Fibonacci Series are:" +firstNum);
				
				for(int i=1;i<=8;i++) {
					sum=firstNum+secNum;
					firstNum=secNum;
					secNum=sum;
					System.out.print(","+sum);
				}
			
	}

}
