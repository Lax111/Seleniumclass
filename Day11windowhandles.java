package selenoumtutorial1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11windowhandles {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 	
		driver.get("http://www.webdriveruniversity.com/"); 
		
		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow );
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> s = windows.iterator();
		String parentWindowA = s.next();
		System.out.println(parentWindowA );
		String childWindow = s.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		
		
//		driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//	if(ele.isDisplayed()) {
//			System.out.println("Test case pass");
//		}
		
		if(driver.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("Test case pass");
		}
		
		driver.switchTo().window(parentWindow);
		
		driver.getCurrentUrl();
		driver.quit();
	}

}
