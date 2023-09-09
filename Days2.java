package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days2 {

	public static void main(String[] args) {
		
		//WebElement methods
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		//sendkeys();
		//program 1:
		
		
	
       driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
       driver.manage().window().maximize();
       
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
	    WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		 
		first_name.sendKeys("lax");
		last_name.sendKeys("chapagain");
		email_address.sendKeys("chapagainlaxmi108@gmail.com");
		message.sendKeys("I am learning selenium");
		reset_button.click();
		
		//clear()
				
	WebElement first_name1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
	
     first_name1.sendKeys("lax");
		first_name1.clear();
	
		//text()
		
		
		
//		<h2 name ="contactme" class = "section_header">CONTACT US</h2>
//		
//		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//		String text = heading.getText();
//		System.out.println(text);
//		
		
		
		//program 2
		
		//driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		//is_displayed();
		//g2 --- true
		
	WebElement header = driver.findElement(By.cssSelector("h1"));
      boolean g2 = header.isDisplayed();
     System.out.println(g2);
//		
//		//is_enabled()
//		//g3 --- true
//		
//	WebElement inabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled >input[type=radio]:nth-child(1)"));
//	boolean g3 = inabled_radioB.isEnabled();
//		System.out.println(g3);
//		
		//is_disabled()
		//Q4 --false
		
		//WebElement disabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled >input[type=radio]:nth-child(3)"));
	    //boolean g4 = disabled_radioB.isEnabled();
	    //System.out.println(g4);
	
		
	//is_selected()
	//Q5 --false
	
	//WebElement isSelected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled >input[type=radio]:nth-child(5)"));
		//boolean g5 = isSelected_radioB.isSelected();
	//System.out.println(g5);
	
	
}}
