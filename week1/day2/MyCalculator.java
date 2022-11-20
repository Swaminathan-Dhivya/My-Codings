package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int Addresult=cal.add(5,2,80);
		int Subresult=cal.sub(50,20);
		double Mulresult=cal.mul(5000,200);
		float Divresult=cal.divide(50.52f,20f);
		System.out.println("Addition of two float numbers:"+Addresult);
		System.out.println("Subtraction of two float numbers:"+Subresult);
		System.out.println("Muliplication of two float numbers:"+Mulresult);
		System.out.println("Division of two float numbers:"+Divresult);
		
	}

}
