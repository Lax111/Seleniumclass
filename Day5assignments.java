package selenoumtutorial1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5assignments {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		
		
		 driver.get("https://www.google.com");

	        // Use JavaScript to open a new tab with Bing
	        ((JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com', '_blank');");

	        // Switch focus to the new tab
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }

	        // Close the current tab (Bing)
	        //driver.quit();
	        driver.close();

		
	}

}
