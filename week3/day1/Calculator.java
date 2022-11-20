package week3.day1;

public class Calculator {
	public void add(int a1,int a2) {
		System.out.println("Addition of two numbers:"+(a1+a2));
	}
	public void add(int a1,int a2,int a3) {
		System.out.println("Addition of three numbers:"+(a1+a2+a3));
	}
	
	//Sub
	public void sub(double d1,double d2) {
		System.out.println("Subtraction of two(double) numbers:"+(d1-d2));
	}
	
	public void sub(int s1,int s2) {
		System.out.println("Subtraction of two(int) numbers:"+(s1-s2));
	}
	
	//Multiplication
	public void mul(double m1,double m2) {
		System.out.println("Multiplication of two(double) numbers:"+(m1*m2));
	}
	
	public void mul(int m1,double m2) {
		System.out.println("Multiplication of two(one int and one double) numbers:"+(m1*m2));
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(8,8);
		c.add(10,10,10);
		c.sub(30,20);
		c.sub(32.5,20);
		c.mul(20.5,10);
		c.mul(20,10.5);
	}

}
