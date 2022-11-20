package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("makeCall method executed");

	}
	
	public void sendMsg() {
		System.out.println("sendMsg method executed");

	}

public static void main(String[] args) {
	Mobile m = new Mobile();
	m.makeCall();
	m.sendMsg();
// We can call the method which is in the another class 
// but in the same package	
	Sample S=new Sample();
	S.printText();

}
}

