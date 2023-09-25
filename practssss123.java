package selenoumtutorial1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practssss123 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/"); 
		 driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		driver.findElement(By.id("to-do-list")).click();
		driver.findElement(By.id("page-object-model")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		// WebDriver | Page Object Model
		
		Iterator<String> s = windows.iterator();
		
		while(s.hasNext()){
			String windowId = s.next();
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("")) {
				System.out.println(driver.getTitle());
				System.out.println("test case pass");
				break;
			}
			
			
		}
		
	}

}
