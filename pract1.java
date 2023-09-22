package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract1 {

	public static void main(String[] args) {
		
		//Header

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//
//		// is displayed method
//		WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
//		boolean B1 = heading.isDisplayed();
//		System.out.println(B1);

		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//using methods of web element
		
//		//getText Method
//		WebElement el= driver.findElement(By.cssSelector(".section_header"));
////		String S1 = el.getText();
////		System.out.println(S1);
//		
//		//getTagName method
//		String S2 = el.getTagName();
//		System.out.println(S2);
//		
		
		
driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//getPageSource() method
		//it is used to obtain the code of the page source.
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}	
		
		
		
		
		
	}


