package selenoumtutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new 	ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.get("https://www.amazon.com/");
	
	
	
	}

}
