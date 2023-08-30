package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		//reset
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("lax");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax108@gmail.com");
			driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello selenium.");
				driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
				
				boolean q6 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText().isEmpty();
				System.out.println(q6);
				if(q6) {
					System.out.println("Test case passed");
					
				}
				else {
					System.out.println("Test case failed.");
			
		
	}

}}
