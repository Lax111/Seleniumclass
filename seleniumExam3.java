package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		  driver.navigate().to("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		  WebElement orange =driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
//		  
//			orange.click();
//			boolean RB1 = orange.isSelected();
//			if(RB1==true) {
//				System.out.println("Orange radio button is selected.");
//		
//		
		
				
	}

	}
