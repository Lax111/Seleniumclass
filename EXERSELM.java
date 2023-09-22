package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXERSELM {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("http://www.webdriveruniversity.com/");
		
		//driver.getTitle()
		
		String title = driver.getTitle();
		if(title .equals("WebDriverUniversity.com")) {
			System.out.println("Test case pass");
			
	//}
	
		//driver.getCurrentUrl()
		
	driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("inventory")) {
		System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		
		//findElement()
		
		//WebElement ele = driver.findElement(By.id("class=\"login_logo\""));
		WebElement ele = driver.findElement(By.id("class=\"login_logo\""));
	if(ele.isDisplayed()){
		System.out.println("Test case pass");
	}
	else {
		System.out.println("Test case fail");
		*/
	//}
		
	//findElements()
	
		driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	List<WebElement> ele = driver.findElements(By.className("inventory_item_name"));
		if(ele.size()==6) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}
		
	}


