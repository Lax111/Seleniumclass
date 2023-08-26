package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleprac1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		driver.get("https://opensource-demo.orangehrmlive.com/");

		
		WebElement username = driver.findElement(By.name("txtusername"));
		WebElement password = driver.findElement(By.name("txtpassword"));
		//WebElement login = driver.findElement(By.t("#submit"));
		
		username.sendKeys("Admin");
		username.sendKeys("admin123");
		//login.click();
	}

}






//WebElement username = driver.findElement(By.cssSelector("#user-name"));
//WebElement password = driver.findElement(By.cssSelector("#password"));
//WebElement login = driver.findElement(By.cssSelector("#login-button"));
// 
////Dash board element
// 
// username.sendKeys("standard_user");
// password.sendKeys("secret_sauce");
// login.click();