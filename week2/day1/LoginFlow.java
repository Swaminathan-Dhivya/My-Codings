package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFlow {

	public static void main(String[] args) {
		//will check whether the driver is installed
		//or else it will download the driver
		WebDriverManager.chromedriver().setup();
		
		//If we download it manually we have to set the path. Either the above one shud be given or the below one.
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To open the browser
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //To maximize the browser window
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXX");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		 WebElement dropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dd=new Select(dropdown);
		 //dd.selectByIndex(1);
		 //dd.selectByVisibleText("Conference");
		 //We can select the option from the dropdown using the above code also
		 dd.selectByValue("LEAD_CONFERENCE");
		 driver.findElement(By.name("submitButton")).click();
		 String text=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 if(text.equals("Fname")) {
			 System.out.println("First name is correct");
		 }
		 else {
			 System.out.println("First name is correct");
		 }
		 		 
		 driver.close();

	}

}
