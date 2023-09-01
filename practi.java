package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practi {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// driver.get:

		// driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		// driver.getTitle:

		String title = driver.getTitle();

		System.out.println("page title is:" + title);

		if (title.equals("amazon")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");

			// driver.getCurrentUrl:

			String url = driver.getCurrentUrl();
			System.out.println(url);

			// driver.getPageSource:

			String pagesource = driver.getPageSource();
			System.out.println(pagesource);
			
			
			//driver.findElement:
//			
//			WebElement username = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//			username.sendKeys("lax");

			//driver.findElements:
			
			List<WebElement> links = driver.findElements(By.tagName("h2"));
			for (WebElement link : links) {
			    System.out.println(link.getText());
			
			// driver.close:
//			driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//					driver.close();
////					
					
					// driver.quite:
//					driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//							driver.quit();
//							
		}

	}

}}
