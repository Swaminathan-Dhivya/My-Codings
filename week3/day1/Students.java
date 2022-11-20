package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID: "+id+" Name: "+name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Email: "+email+" Phonenumber: "+phonenumber);
	}

	public static void main(String[] args) {
		Students S=new Students();
		S.getStudentInfo(3498);
		S.getStudentInfo(3498,"Rekha");
		S.getStudentInfo("dd@testebiz.com",9837826789l);
	}

}
