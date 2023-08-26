package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleprac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		driver.get("https://www.saucedemo.com");
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		

		
		
		WebElement heading = driver.findElement(By.cssSelector("#header_container> div.header_secondary_container> span"));
		
		
		
	}
}