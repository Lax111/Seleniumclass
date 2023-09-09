package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		//SELENIUM LOCATOR
		
		//iD:
		/*WebElement username1 = driver.findElement(By.id("user-name"));
			username1.sendKeys("standard_user");
		
		//name:
			WebElement username2 = driver.findElement(By.name("user-name"));
			username2.sendKeys("standard_user");
			
		//cssSelector:
			WebElement username3 = driver.findElement(By.cssSelector("#user-name"));
			username3.sendKeys("standard_user");
			
		
		//className:
			WebElement username4 = driver.findElement(By.className("input_error"));
			username4.sendKeys("standard_user");
			
			
		WebElement password4 = driver.findElement(By.className("input_error"));
		password4.sendKeys("secret_sauce");
		*/
	
		
		//tagName:
		driver.findElements(By.tagName("input")).get(1).sendKeys("secret_sauce");
		
		
		//linkText:
		
		driver.findElements(By.linkText("Sauce Labs Bike Light"));
		
		//partiallinkText:
		driver.findElements(By.linkText("Sauce"));
		
		//xpath:
		
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")); 
		driver.findElement(By.xpath("//input[@name=\"password\"]"));
		System.out.println("hi");
		
		
		
		
		
		
		
	
//			
//			
			
			
			
	}		
		
	}


