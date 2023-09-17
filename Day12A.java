package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12A {

	public static void main(String[] args) {
		
		//JS ALERT OK:
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.id(""));
		
		//finding the element and clicking on it
		/*driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		//switching to alert and getText
		
		String alertString = driver.switchTo().alert().getText();
		if(alertString.equals("I am a JS Alert")) {
			System.out.println("Test case pass");
		}
		driver.switchTo().alert().accept();
		WebElement ele = driver.findElement(By.id("result"));
		if(ele.getText().equals("You successfully clicked an alert"));
		System.out.println("Test case 1 pass");
		*/
	}

}
