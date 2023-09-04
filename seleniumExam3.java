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
		  List<WebElement> check= driver.findElements(By.xpath("//input[@type='checkbox']")); 
		  System.out.println("total :" + check.size()); 
		  for(int b =0; b < check.size(); b++) 
		  { 
		   System.out.println("Check boxes :"+check.get(b).getAttribute("value")); 
		  }
		
		
		
		  //#radio-buttons
		
		
	}

}
