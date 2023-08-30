package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		
		//Arange
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		 //Action
		 //Selecting the element
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 
		 
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		 
		//Dash board element
		 
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 login.click();
		 
		 
		 //Assertion
		 
		//WebElement heading = driver.findElement(By.cssSelector("#header_container> div.header_secondary_container> span"));
		//#header_container > div.header_secondary_container > span
		//WebElement heading = driver.findElement(By.cssSelector("#item_0_title_link > div.header_secondary_container>span"));
		//WebElement heading = driver.findElement(By.cssSelector("#item_4_title_link > div"));
		//WebElement heading = driver.findElement(By.cssSelector("#item_3_title_link > div"));
		
		WebElement heading = driver.findElement(By.cssSelector("#item_5_title_link > div"));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		 
		
	
		 
	}

}
