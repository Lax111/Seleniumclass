package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignment5 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
//			    //WebDriver is an interface provided by Selenium WebDriver.
				    //Interface is a collection of abstract methods(methods without implementation)
				    //WebDriver interface acts as a contract that each browser specific driver implements.
				    
				    // providing location
				    String url = "http://www.webdriveruniversity.com/Popup-Alerts/index.html";
				    driver.get(url);
				    //Maximize the window
				    driver.manage().window().maximize();
				    //find the locator
				    driver.findElement(By.cssSelector("#button4")).click();
				    //get alert message
				    String s1= driver.switchTo().alert().getText();
				    // test case
				    if(s1.equals("Press a button!")) {
				      System.out.println("Test case pass 0");
				    }
				    else
				    {
				      System.out.println("Test case fail 0");
				    }
//				    dr.switchTo().alert().accept();
//				    String s2=  dr.findElement(By.cssSelector("#confirm-alert-text")).getText();
//				    if(s2.equals("You pressed OK!")) {
//				      System.out.println("Test case Pass");
//				    }
//				    else {
//				      System.out.println("Test case fail");
//				    }
				    // i want canceled 
				    driver.switchTo().alert().dismiss();;
				    String s2=  driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
				    if(s2.equals("You pressed Cancel!")) {
				      System.out.println("Test case Pass");
				    }
				    else {
				      System.out.println("Test case fail");
				    }
				  }

				

				
		
		
		
		
		
	}


