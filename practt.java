package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practt {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();


		String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
	    driver.get(url);
	    
//		//Test Case 1 Validate title of Page
	    
//	    String ExceptedTitle = "WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
//	    String ActualTitle = driver.getTitle();
//	    if(ExceptedTitle.equals(ActualTitle)) {
//	      System.out.println("Test case 1 passed");
//	    }
//	    else
//	    {
//	      System.out.println("Test case  1 failed");
//	    }
	    
	    
	    
	  
	    driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//	     List <WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	        System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
//	             
//	        for(WebElement cb:AllCheckBoxes)
//	        {
//	            cb.click();
//	    
//	    
	        
	   driver.manage().window().maximize();
	   WebElement ddown = driver.findElement(By.className("dropdown-menu-lists"));
	   Select select = new Select(ddown);
	    
	     select.selectByValue("java"); 
	     
	     select.selectByIndex(2);
	    
	     select.selectByVisibleText("Python");
	    System.out.println("hello");
	}

}
