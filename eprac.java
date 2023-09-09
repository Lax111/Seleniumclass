package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class eprac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("lax");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		
		
		
		
		
	}

}
