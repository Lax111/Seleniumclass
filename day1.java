package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new 	ChromeDriver();
	//driver.get("https://www.google.com/");
	//driver.get("https://www.amazon.com/");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	
//	WebElement username = driver.findElement(By.name("username"));
//	WebElement password = driver.findElement(By.name("password"));
//	
//	username.sendKeys("Admin");
//	 password.sendKeys("admin123");
//	 
	
//	String title=driver.switchTo().window(a).getTitle();
//	System.out.println(title);

	
	
	
	}

}


