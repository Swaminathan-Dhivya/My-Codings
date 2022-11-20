package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To open the browser
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //To maximize the browser window
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DD");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample");
		 Thread.sleep(2000);
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		 WebElement dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd=new Select(dropdown);
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.name("submitButton")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("cleared the description");
		 driver.findElement(By.className("smallSubmit")).click();
		 String Addtnotes=driver.findElement(By.id("viewLead_importantNote_sp")).getText();
		 System.out.println("Entered Additional notes: "+Addtnotes);
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("Logout")).click();
		 Thread.sleep(2000);
		 driver.close();

	}

}
