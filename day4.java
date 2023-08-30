package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		
		// Find username, password fields, and login button
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        
        // Enter invalid username and valid password
        
        usernameField.sendKeys("locked_out_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        
        // Check for error message
        WebElement errorMessage = driver.findElement(By.cssSelector("[data-test='error']"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Test Passed - Error message displayed Epic sadface: Sorry, this user has been locked out.");
        } else {
            System.out.println("Test Failed - Error message not displayed");
        }
        	
		
		
		
		
		
		
		
		
		

	}

}
