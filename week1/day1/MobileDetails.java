package week1.day1;

public class MobileDetails {
	String mobileBrandName="Redmi";
	char mobileLogo='A';
	short noOfMobilePiece=1;
	int modelNumber=34536;
	long mobileImeiNumber=23452643646L;
	float mobilePrice=15000;
	boolean isDamaged=false;
	public static void main(String[] args) {
		
		MobileDetails md=new MobileDetails();
		System.out.println("MobileBrandName:"+md.mobileBrandName);
		System.out.println("Mobile Logo :"+md.mobileLogo);
		System.out.println("Mobile count:"+md.noOfMobilePiece);
		System.out.println("Model number:"+md.modelNumber);
		System.out.println("MobileEMEINumber:"+md.mobileImeiNumber);
		System.out.println("MobilePrice:"+md.mobilePrice);
		System.out.println("Is Mobile Damaged?:"+md.isDamaged);
	}

}
