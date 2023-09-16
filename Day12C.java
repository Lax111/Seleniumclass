package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12C {

	public static void main(String[] args) {
		
		//JS PROMPT OK:
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text = driver.switchTo().alert().getText();
		if(text.equals("I am a JS prompt")) {
		System.out.println("Test case pass");
		
		}
		else {
			System.out.println("Test case fail");
			
		}
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You entered: text")) {
			System.out.println("Test case 1 pass");
		}
		else {
			System.out.println("Test case 1 pass");
		}
		
		//JS PROMPT CANCEL:
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text1 = driver.switchTo().alert().getText();
		if(text1.equals("I am a JS prompt")) {
		System.out.println("Test case pass");
		
		}
		else {
			System.out.println("Test case fail");
			
		}
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().dismiss();
		if(ele.getText().equals("You entered: null")) {
			System.out.println("Test case 2 pass");
		}
		else {
			System.out.println("Test case 2 pass");
		}
		
		
		
	}

}
