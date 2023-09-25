package selenoumtutorial1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/");
driver.findElement(By.cssSelector("#contact-us")).click();
String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		Set<String> windows = driver.getWindowHandles();
		System.out.println();
		
		Iterator<String> s = windows.iterator();
		String parentWindowA = s.next();
		
		
	}

}
