package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		//SELENIUM LOCATOR:
		
		
		//ID:
		
/*	driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
	    WebElement login = driver.findElement(By.id("login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	
		//NAME:
		  
		driver.get("https://www.saucedemo.com/");
		
		   WebElement username = driver.findElement(By.name("user-name"));
			WebElement password = driver.findElement(By.name("password"));
			WebElement login = driver.findElement(By.name("login-button"));
			
			
			username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			login.click();	
				
  
		//cssSelector:
		
		driver.get("https://www.saucedemo.com/");
		
     WebElement username = driver.findElement(By.cssSelector("#user-name"));
	WebElement password = driver.findElement(By.cssSelector("#password"));
	WebElement login = driver.findElement(By.cssSelector("#login-button"));
	
	username.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
    login.click();
    
 
      //xpath:
		
		driver.get("https://www.saucedemo.com/");
 
        WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement password = driver.findElement(By.xpath(" //*[@id=\"password\"]"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	    login.click();
	  
		//CLASS
		
		driver.get("https://www.saucedemo.com/");
		
		//WebElement username = driver.findElement(By.className("input_error form_input"));
		WebElement password = driver.findElement(By.className("input_error form_input"));
	    WebElement login = driver.findElement(By.className("submit-button btn_action"));

		//username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		  */
		
	

			
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
