package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExam1 {

	public static void main(String[] args) {
		//Test 1:

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		String expectedTitle="WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
//		String titleOfPage = driver.getTitle();
//		
//		if(expectedTitle.equals(titleOfPage)) {
//		System.out.println("Test case passed.");
//		}
		
		}
	
	
		
		}
		
		
	

	
