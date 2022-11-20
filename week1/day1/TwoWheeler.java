package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=2342L;
	boolean isPunctured=false;
	String bikeName="RoyalEnfield";
	double runningKM=500d;
	public static void main(String[] args) {
		TwoWheeler tw=new TwoWheeler();
		
		System.out.println("BikeName:"+tw.bikeName);
		System.out.println("No of wheels:"+tw.noOfWheels);
		System.out.println("NoofMirrors:"+tw.noOfMirrors);
		System.out.println("chassisNumber:"+tw.chassisNumber);
		System.out.println("Is Punctured?:"+tw.isPunctured);
		System.out.println("RunningKilometer:"+tw.runningKM);
	}

}

