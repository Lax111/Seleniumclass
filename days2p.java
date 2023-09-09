package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class days2p {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		
	driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		/*WebElement contactE =	driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		// isDisplayed()
		boolean a = contactE.isDisplayed();
		if(a) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
//		}
		
		// getText()
//		if(contactE.getText().equals("CONTACT US")) {
//			System.out.println("Testcase pass 2");
//		}
//		else {
//			System.out.println("Testcase Fail 2");
//		}
		*/
			WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		    WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
			WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
			WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
			WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
			
			 //click:
			first_name.sendKeys("lax");
			last_name.sendKeys("chapagain");
			email_address.sendKeys("chapagainlaxmi108@gmail.com");
			message.sendKeys("I am learning selenium");
			submit_button.click();
			
			
			
			//submit:
//			first_name.sendKeys("laxmi");
//			last_name.sendKeys("chapagain");
//			email_address.sendKeys("chapagainlaxmi108@gmail.com");
//			message.sendKeys("Learning selenium");
//			submit_button.submit();
//			
			
			
			
			
			
			
		
		
		// click() , sendKeys() , clear() , submit() , isDisplayed() , getText();
	
	}	
		
//		
//		// Action 
//		WebElement ele =driver.findElement(By.cssSelector("#user-name"));
//		ele.sendKeys("standard_user");
//		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
//		ele2.sendKeys("secret_sauce");
//		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
//		ele3.click();
//			
//		// Assertion
//		WebElement ele4 = driver.findElement(By.cssSelector(".app_logo"));
//		boolean flag =ele4.isDisplayed();
//		if(flag) {
//			System.out.println("Testcase1 pass");
//		}
//		else {
//			System.out.println("Testcase1  fail");
//		}
//		driver.close();
//		
		// Test case 2

//		// Action 
//
//		WebElement ele = driver.findElement(By.cssSelector("#user-name"));
//		ele.sendKeys("standard_user");
//		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
//		ele2.sendKeys("set_sauce");
//		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
//		ele3.click();
//		WebElement ele4 = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
//		String expectedText = ele4.getText();
//		System.out.println(expectedText);
//		
//		if(expectedText.contains("Epic sadface: Username and password do not match any user in this service")) {
//			System.out.println("Test case 2 pass");
//		}
//		else {
//			System.out.println("Test case 2 Fail");
//		}
//		
//		driver.close();

	}
	

	


