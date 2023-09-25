package selenoumtutorial1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practsss123 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/"); 
		 driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:windows) {
			System.out.println(window);
			
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				
				break;
			}
		}
			System.out.println(driver.getCurrentUrl());
			
			WebElement firstname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
			WebElement lastname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
			WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
			WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
			WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
			
			firstname.sendKeys("Lax");
			lastname.sendKeys("Chapagain");
			email.sendKeys("chapagainlaxmi108@gmail.com");
			message.sendKeys("this is window handle");
			submit_button.click();
			
			driver.switchTo().window(parentwindow);
			System.out.println(driver.getCurrentUrl());
			
			
			
			
		}
		
	}


