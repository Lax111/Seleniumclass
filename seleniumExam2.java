package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		  List<WebElement> linkes = driver.findElements(By.xpath("//input[@type='radio']"));
		  
		  System.out.println("Total :"+ linkes.size()); 
		  for(int x = 0; x <linkes.size(); x++) { 
		   System.out.println("Radio Button: "+ linkes.get(x).getAttribute("value")); 
		
		
		  }}
}
