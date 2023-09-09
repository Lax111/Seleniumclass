package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6B {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	login.click();
	
	
	//driver.get("https://www.saucedemo.com/");
	
	
	
	
	
	
	
	//driver.findElement(By.cssSelector("form"));
	//driver.findElement(By.xpath("//input[@type=\"password\"]"));
	
	
	//driver.findElement(By.xpath("//input[@id =\"user-name\"]"));
	//driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	
	driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	
	driver.findElement(By.linkText("Sauce Labs Backpack"));
	
	driver.findElement(By.partialLinkText("Sauce"));
	System.out.println("hello");
	driver.close();
	}

}
