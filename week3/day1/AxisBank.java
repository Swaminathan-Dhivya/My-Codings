package week3.day1;

public class AxisBank {
	public void deposit() {
		System.out.println("Deposited in Axis bank");
	}
	public static void main(String[] args) {
		
		AxisBank a=new AxisBank();
		a.deposit();
		BankInfo b=new BankInfo();
		b.deposit();
	}

}
