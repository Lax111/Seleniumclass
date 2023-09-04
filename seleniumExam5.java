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
		
		driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String a = headTwo.getText();
		System.out.println(a);
		
		
boolean a1 = driver.findElement(By.cssSelector("h2")).isDisplayed();
		
		if(a1){
			System.out.println("Testcase  pass");
		}
		
		else {
			System.out.println("Testcase  fail");
		
		
		
		}
	}

}
