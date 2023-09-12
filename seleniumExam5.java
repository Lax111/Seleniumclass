package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExam5 {

	public static void main(String[] args) {
		//EXAM 5:
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//
//			WebElement heading=driver.findElement(By.cssSelector("#main-header > h1"));	
//			String headingTxt=heading.getText();
//	          System.out.println(headingTxt);

		}
	}
		
	


