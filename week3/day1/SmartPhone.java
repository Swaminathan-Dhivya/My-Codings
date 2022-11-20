package week3.day1;

public class SmartPhone extends AndroidPhone{
 public void connectWhatsApp() {
	 System.out.println("connectWhatsApp");
 }
 
 public void takeVideo() {
		System.out.println("takeVideo from smart phone");
	}

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.takeVideo();
		/*
		 * System.out.println("Mobile class methods"); s.sendMsg(); s.makeCall();
		 * s.saveContact(); System.out.println("Androidphone class methods");
		 * s.takeVideo(); System.out.println("Smartphone class methods");
		 * s.connectWhatsApp();
		 */

	}

}
