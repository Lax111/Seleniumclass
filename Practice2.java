package selenoumtutorial1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url="http://www.webdriveruniversity.com/";
		driver.get(url);
		//win 1 -> win2 -> select something test-> Win 1 return
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow + "\tParent");
		driver.findElement(By.cssSelector("#contact-us")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			if(! window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
System.out.println(driver.getCurrentUrl());
driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rabindra");
driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Amatya");
driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("rabindra@gamil.com");
driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello , how are you doing?");
driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();


driver.switchTo().window(parentWindow);
System.out.println(driver.getCurrentUrl());

	}

}
