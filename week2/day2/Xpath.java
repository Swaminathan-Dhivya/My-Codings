package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To open the browser
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //To maximize the browser window
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("xpath");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fname");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lname");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		 //Advanced xpath:child to parent
			 //driver.findElement(By.xpath("(//a[@class='linktext']/parent::div)[2]"));
			 
					 
	}

}
