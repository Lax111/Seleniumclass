package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
	
	//driver.get("https://community.microfocus.com/adtd/uft/f/sws-fun_test_sf/5583/http-newtours-demoaut-com-is-this-site-offline");
	driver.get("http://qalms.zorbasofted.com/Dashboards/Analytics");
	//driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	
    WebElement email = driver.findElement(By.cssSelector("#email"));
	WebElement password = driver.findElement(By.cssSelector("#Input_Password"));
	WebElement signin = driver.findElement(By.cssSelector("#account > div:nth-child(4) > button"));
//	
	password.sendKeys("Secret1+");
	email.sendKeys("admin@argon.com");
	signin.click();
	}}
//System.out.println("page title is:" + title);
//
//	if(title.equals("Google")) {
//	System.out.println("correct title");
//	}
//	else {
//		System.out.println("incorrect title");
//
//	}
//	}
//}
//
