package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac123 {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		
		//iframe
		
		//WebElement ele = driver.findElement(By.cssSelector("#frame"));
		//driver.switchTo().frame(ele);

		// Switch to iframe by index
	driver.switchTo().frame(0);
	WebElement ele1 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active> a"));
		System.out.println(ele1.isDisplayed());
		
		// Switching back to main content
		
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		// validaing the title of main content
		
if(driver.getTitle().equals("WebDriver | IFrame")) {
	System.out.println("test case pass");
}
else {
	System.out.println("test case pass");
}
	}

}
