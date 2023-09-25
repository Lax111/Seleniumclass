package selenoumtutorial1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practsss {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/"); 
		 driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow );
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> s = windows.iterator();
		String parentwindowA = s.next();
		System.out.println(parentwindowA);
		String childwindow = s.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		
		WebElement ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		if(ele.isDisplayed()) {
			System.out.println("Test case pass");
		}
		
		if(driver.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("Test Case Pass tytle");
		}
		
		driver.switchTo().window(parentwindow);
		driver.getCurrentUrl();
		
		
		
		
		
		
		

	}

}
