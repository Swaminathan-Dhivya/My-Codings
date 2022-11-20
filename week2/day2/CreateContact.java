package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
		 driver.findElement(By.xpath("//ul[@class='sectionTabBar']//li[3]//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//div[@id='left-content-column']//a[text()='Create Contact']")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Fname");
		 driver.findElement(By.id("lastNameField")).sendKeys("Lname");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("FL");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LL");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Sample");
		 
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
		 WebElement dropdown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select dd=new Select(dropdown);
		 dd.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[1]")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_description")).sendKeys("cleared and updated");
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes");
		 driver.findElement(By.xpath("//td[@colspan='4']/input[1]")).click();
		 System.out.println(driver.getTitle());
	}

}
