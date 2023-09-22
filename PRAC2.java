package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRAC2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement last_name =driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email =driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message =driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		first_name.sendKeys("Laxmi");
		last_name.sendKeys("chapagain");
		email.sendKeys("chapagainlax108@gmail.com");
		message.sendKeys("I am learning selenium");
		reset.click();
		
		//text
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String text = heading.getText();
		System.out.println("text");
		
//is_diaplayed()
		
		
		
		
		
		
		
		
		
	}

}
