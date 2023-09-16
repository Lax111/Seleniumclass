package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12B {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//JS CONFORM OK:
		//WebElement ele = driver.findElement(By.id("result"));
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text1 = driver.switchTo().alert().getText();
		if(text1.equals("I am a JS Confirm")) {
		System.out.println("Test case for text pass");
		
	}

		driver.switchTo().alert().accept();
		System.out.println(ele.getText());
		if(ele.getText().equals("You clicked: Ok")) {
		//WebElement ele = driver.findElement(By.id("result"));
		System.out.println("Test case for element text pass");
		
		}
		//JS CONFORM CANCEL:
		
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		if(text2.equals("I am a JS Confirm")) {
		System.out.println("Test case for text pass");
		
		}
		
		driver.switchTo().alert().dismiss();
		System.out.println(ele.getText());
		if(ele.getText().equals("You clicked: Cancel")) {
		//WebElement ele = driver.findElement(By.id("result"));
		System.out.println("Test case for element text pass");
		
		
		
		
		
		
		
	}}	
	}	

