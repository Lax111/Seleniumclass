package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		driver.manage().window().maximize();
		
//		WebElement ele1 = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(ele1);
			
		//switch to iframe by index
		
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
		System.out.println(ele2.isDisplayed());
		
		
		//switching back to main content
		driver.switchTo().defaultContent();
		
		//find element in main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		
		//validating the title of main content
		
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case pass");
		}
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
