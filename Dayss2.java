package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayss2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		
		WebElement username = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement password =driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email =driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message =driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_button =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		
		username.sendKeys("lax");
		password.sendKeys("chapagain");
		email.sendKeys("chapagailax108@gmail.com");
		message.sendKeys("selenium class");
		reset_button.click();
		
		//clear:
		
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
		first_name.sendKeys("lax");
		first_name.clear();
		
		//text:
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String text = heading.getText();
		System.out.println(text);
		
		//Program 2:
		
		//isDisplayed a--true
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement header = driver.findElement(By.cssSelector("#main-header > h1"));
		boolean a = header.isDisplayed();
		System.out.println(a);
		
		//is_enabled:
		
		WebElement enabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean b = enabled_radioB.isEnabled();
		System.out.println(b);
		
		
		//is_disabled:
		
		WebElement disabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		
		boolean c = disabled_radioB.isEnabled();
		System.out.println(c);
		
		//is_selected
		WebElement isSelected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		
		boolean d = isSelected_radioB.isSelected();
		System.out.println(d);
		
		
		
		
		
		
		
	}

}
