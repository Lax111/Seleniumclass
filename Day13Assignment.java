package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		//JAVA SCRIPT ALERT CLICK ME!
		driver.findElement(By.cssSelector("#button1 > p")).click();
		String str = driver.switchTo().alert().getText();
		if(str.equals("I am an alert box!")) {
		
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
	
		driver.close();
		
		
		
		
		
		
		
}
}