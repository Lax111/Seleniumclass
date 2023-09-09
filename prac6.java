package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name"));
		driver.findElement(By.name("password"));
		driver.findElement(By.className("submit-button"));
		
		// <input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
		
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector(".submit-button"));
		driver.findElement(By.cssSelector("#login-button"));
		
		
		driver.findElement(By.cssSelector("input[data-test=\"login-button\"]"));
		driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]"));	
		driver.findElement(By.tagName("form"));
		
		//tagName[@attrbute="value"]
		//ex://*[@id="password"]
		
		driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		
		//driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		//driver.findElement(By.xpath("//input[@name=\"user-name\"]"));
		driver.findElement(By.xpath("//input[@id=\"password\"]"));
		System.out.println("hello");
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password =driver.findElement(By.cssSelector("#password"));
		WebElement login =driver.findElement(By.cssSelector("#login-button"));
		
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		driver.findElement(By.linkText("Sauce Labs Backpack"));
		driver.findElement(By.partialLinkText("Sauce"));
		System.out.println("hi");
		
		
		
		
	}

}
