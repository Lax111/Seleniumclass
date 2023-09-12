package selenoumtutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		 
		 

	}

}
