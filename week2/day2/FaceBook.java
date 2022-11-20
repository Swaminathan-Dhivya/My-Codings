package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\viknesh.k\\Downloads\\ChromeSetup.exe");
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To open the browser
		 driver.get("https://en-gb.facebook.com/");
		 
		 //To maximize the browser window
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FirstTest");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_email__']")).sendKeys("Test@gmail.com");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_email_confirmation__']")).sendKeys("Test@gmail.com");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@type='password']")).sendKeys("Sample@123");
		 //Dropdown
		 WebElement daydropdown=driver.findElement(By.xpath("//select[@title='Day']"));
		 Select dy=new Select(daydropdown);
		 dy.selectByValue("12");
		 
		 WebElement monthdropdown=driver.findElement(By.xpath("//select[@id='month']"));
		 Select m=new Select(monthdropdown);
		 m.selectByValue("12");
		 
		 WebElement yeardropdown=driver.findElement(By.xpath("//select[@id='year']"));
		 Select y=new Select(yeardropdown);
		 y.selectByValue("1994");
		 
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 System.out.println("Create account form filled successfully");
		 
	}

}
