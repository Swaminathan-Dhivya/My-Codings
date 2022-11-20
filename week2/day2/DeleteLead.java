package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To open the browser
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //To maximize the browser window
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]/a[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//a[@class='x-tab-right']//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		 driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9940419644");
		 //String Mobile=driver.findElement(By.xpath("//input[@name='phoneNumber']")).getAttribute("value");
		 //System.out.println("Entered phone number:"+Mobile);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='x-panel-btns-ct']//button[text()='Find Leads']")).click();
		 System.out.println("Find leads button is clicked");
		 String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		 System.out.println("Selected LeadID: "+leadId);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[@class='linktext']")).click();
		 
		 System.out.println("Title:"+driver.getTitle());
		 
		 driver.close();
	}

}
