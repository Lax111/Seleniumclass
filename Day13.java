package selenoumtutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day13 {

	public static void main(String[] args) {
	
		// Tables 
			// Get the total number of tables 
				// Get the total number of rows 
				// Get the total number of columns
				// Iterate rows and columns and print text of element 
				// Convert it into integer and add
				
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		
		
		
		

	}

}
