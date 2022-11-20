package week3.day2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.amazon.in");
		 driver.manage().window().maximize();

		 WebElement keyword=driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		 keyword.sendKeys("Phones");
		 keyword.sendKeys(Keys.ENTER);
		 List<Integer> mprice =new ArrayList<Integer>();
		 List<WebElement> allprice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 for (WebElement eachPrice:allprice) {
			 System.out.println(eachPrice.getText());
			 String text=eachPrice.getText().replace(",","").replace("","");
			 int Price=Integer.parseInt(text);
			 Price.add(mprice);		
		}
		 Collections.sort(mprice);
		 System.out.println(mprice.get(0));
	}

}
