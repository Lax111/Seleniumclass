package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracLMS {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		driver.get("http://qalms.zorbasofted.com/Dashboards/Analytics");
		driver.manage().window().maximize();
		
		
//		WebElement email    = driver.findElement(By.cssSelector("#email")).sendKeys("admin@argon.com");
//		WebElement password = driver.findElement(By.cssSelector("#Input_Password")).sendKeys("Qoz58132");
//		WebElement signin   = driver.findElement(By.cssSelector("#account > div:nth-child(4) > button")).click();
		
		
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		WebElement password = driver.findElement(By.cssSelector("#Input_Password"));
		WebElement signin = driver.findElement(By.cssSelector("#account > div:nth-child(4) > button"));
		 
		
		email.sendKeys("admin@argon.com");
		 password.sendKeys("Qoz58132");
		 signin.click();
		 
		
	
		
		
	}

}
