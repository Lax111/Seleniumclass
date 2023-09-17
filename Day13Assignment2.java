package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		WebElement ele = driver.findElement(By.id("result"));
		driver.findElement(By.cssSelector("#button4 > p")).click();
		Thread.sleep(2000);	
		
		String text1 = driver.switchTo().alert().getText();
		if(text1.equals("Press a button!")) {
		System.out.println("Test case pass");
		
		else {
			System.out.println("Test case pass");
			
		}
		driver.switchTo().alert().accept();
		System.out.println(ele.getText());
		if(ele.getText().equals("You clicked: Ok")) {
		
		System.out.println("Test case for element text pass");
		
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		if(text2.equals("I am a JS Confirm")) {
		System.out.println("Test case for text pass");
		
		}
		
		driver.switchTo().alert().dismiss();
		System.out.println(ele.getText());
		if(ele.getText().equals("You clicked: Cancel")) {
		
		System.out.println("Test case for element text pass");
		
		
		else {
			System.out.println("Test case pass");
		
		
		}}
	}

	}
