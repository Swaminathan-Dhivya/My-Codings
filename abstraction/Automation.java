package abstraction;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		
		Automation a=new Automation();
		a.java();
		a.Selenium();
		a.python();
		a.ruby();
		
	}

	public void java() {
		System.out.println("Language interface");
		
	}

	public void Selenium() {
		System.out.println("Testtool interface");
		
	}
	public void ruby() {
		System.out.println("Ruby");
	}

}
