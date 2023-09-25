package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practss123 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.id("result"));
		
		// for js alert click ok
		//TEST CASE 1:
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		// switching to alert and get text
		String alert = driver.switchTo().alert().getText();
		if(alert.equals("I am a JS Alert")) {
		System.out.println("Test case pass");
	}
	driver.switchTo().alert().accept();
	if(ele.getText().equals("You successfully clicked an alert")) {
	System.out.println("Test case 1 pass");
	
	
	//TEST CASE 2 a:
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
	
	String text = driver.switchTo().alert().getText();
	if(text.equals("I am a JS Confirm")) {
	System.out.println("Test case 2 ok pass");
	
	}
	
	driver.switchTo().alert().accept();
	if(ele.getText().equals("You clicked: Ok")) {
		System.out.println("Test case 2 ok pass");
	
	
		//TEST CASE 2 b:
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		
String text1 = driver.switchTo().alert().getText();
	if(text1.equals("I am a JS Confirm")) {
		System.out.println("Test case 2 cancel pass");
	}
	driver.switchTo().alert().dismiss();
	if(ele.getText().equals("You clicked: Cancel")) {
		System.out.println("Test case 2 cancel pass");
	}
	
	//TEST CASE 3 a:
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
	
	String text2 = driver.switchTo().alert().getText();
	if(text2.equals("I am a JS prompt")) {
		System.out.println("Test case 3 pass");
	}
	else {
		System.out.println("Test case 3A fail");
	}
	driver.switchTo().alert().sendKeys("text3");
	driver.switchTo().alert().accept();
	if(ele.getText().equals("You entered: text3")) {
		System.out.println("Test case 3a pass");
	}
	else {
		System.out.println("Test case 3A fail");
	}
	
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
	String text3 = driver.switchTo().alert().getText();
	if(text3.equals("I am a JS prompt")) {
		System.out.println("Test case 3a pass");
	}
	else {
		System.out.println("Test case 3a fail");
	}
	driver.switchTo().alert().sendKeys("text3");
	driver.switchTo().alert().dismiss();
	if(ele.getText().equals("You entered: null")) {
	System.out.println("TEST CASE PASS");
	}
	else {
		System.out.println("TEST CASE PASS");
	}
	}
	
	}}}
	
	

	
