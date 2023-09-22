package selenoumtutorial1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/index.html");
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
		if(!window.equals(parentWindow)) {
			driver.switchTo().window(window);
			break;
		}
		}
		System.out.println(driver.getCurrentUrl());
		
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
	    WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		 //click:
		first_name.sendKeys("lax");
		last_name.sendKeys("chapagain");
		email_address.sendKeys("chapagainlaxmi108@gmail.com");
		message.sendKeys("I am learning selenium");
		submit_button.click();
		
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
		}	
		
		
	}



	


