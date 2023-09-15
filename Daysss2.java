package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daysss2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
driver.get(" http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
		// first_name.sendKeys("satya");
		
		// click()
		
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
		// fn: #contact_form > input:nth-child(1); ln: #contact_form > input:nth-child(2);
		//email: #contact_form > input:nth-child(3); comments:#contact_form > textarea;
		// reset: #form_buttons > input:nth-child(1)
		
		WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		first_name.sendKeys("lax");
		last_name.sendKeys("chapagain");
		email_address.sendKeys("chapagainlaxmi108@gmail.com");
	message.sendKeys("i am learning js");
	reset_button.click();
		
		
		// clear()
		
		
		//WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
		first_name.sendKeys("lax");
		first_name.clear();
		
		// text(); #contact_me > div > div:nth-child(1) > div > h2
		
		 WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		 String text = heading.getText();
		 System.out.println(text);
		
		
		// program 2; current url: http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// is_displayed()
		
		// q1-----> true  #main-header > h1
		
		WebElement header = driver.findElement(By.cssSelector("h1"));
		boolean q1 = header.isDisplayed();
		System.out.println(q1);
		
		// is_enabled() ;#radio-buttons-selected-disabled (all ids)
		//id --lettuce:#radio-buttons-selected-disabled; cabbage: #radio-buttons-selected-disabled; pumpkin:#radio-buttons-selected-disabled
		// q2-----> true
		// #radio-buttons-selected-disabled // #radio-buttons-selected-disabled > input[type=radio]:nth-child(1)
		//#radio-buttons-selected-disabled
		WebElement enabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled"));
		boolean q2 = enabled_radioB.isEnabled();
		System.out.println(q2);
		
		// q3-----> false ;cabbage: #radio-buttons-selected-disabled > input[type=radio]:nth-child(3) 
		
WebElement disabled_radioB=driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		boolean q3 = disabled_radioB.isEnabled();
		System.out.println(q3);
		
		
		// is_selected()  #radio-buttons-selected-disabled > input[type=radio]:nth-child(5)
		// pumpkin: #radio-buttons-selected-disabled > input[type=radio]:nth-child(5)
		
		// q4 -----> true
		
WebElement isSelected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean q4 = isSelected_radioB.isEnabled();
		System.out.println((q4));
		
		
		

	}


	}


