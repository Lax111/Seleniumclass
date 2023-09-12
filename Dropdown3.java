package selenoumtutorial1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		//Lunching the URL:
		  String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
		driver.get(url);
		
		  //Maximize the window:
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //Searching the dropdown elements by locator its id:
		  Select select = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		  
		 //Printing the choice of the dropdown /Get list of web elements
		  List<WebElement> lists = select.getOptions();
		  //List<WebElement> a = select.getOptions();
		  
		  
		//for each Loop through the choice and printing all the dropdown  list
		  System.out.println("choice of dropdown");
		  
		  for(WebElement choice: lists)
	       System.out.println(choice.getText());
		  
		  
		//selecting single method selection dropdown 
			
			// selectByIndex:
			WebElement ddown = driver.findElement(By.id("dropdowm-menu-3"));
			Select ddown1 = new Select(ddown);
			ddown1.selectByIndex(3); //jquery
			Thread.sleep(2000);

			// selectByVisibleText:
			ddown1.selectByVisibleText("JavaScript"); //Javascript
			Thread.sleep(2000);

			// selectByValue:
			ddown1.selectByValue("html"); //HTML
			Thread.sleep(2000);

		 //Test case 1:
		     //Selecting the option -- selectByIndex:
		     select.selectByIndex(3);
		     System.out.println("Select the option by index 3");
		     
		     WebElement index =  driver.findElement(By.cssSelector("#dropdowm-menu-3 > option:nth-child(4)"));
		     boolean a = index.isSelected();
		     if(a) {
		    	 System.out.println("Test case  1 pass");
		     }
		     else {
		    	 System.out.println("Test case  1 fail");
		     }
		   //Test case 2:
		     
		   //Selecting the option -- selectByVisibleText:
		     select.selectByVisibleText("JavaScript");
		     System.out.println("Select the option by text javaScript");
		     
		     //Assertion:
		     WebElement string2 = driver.findElement(By.cssSelector("#dropdowm-menu-3 > option:nth-child(3)"));
		     boolean b = string2.isSelected();
		     
		     if(a) {
		    	 System.out.println("Test case 2 is pass");
		     }
		     else {
		    	 System.out.println("Test case 2 is fail");
		     }
		     
		   //Test case 3:
		   //Selecting the option -- selectByValue:
		     select.selectByValue("html"); 
		     System.out.println("Select the option by value");
		    
		     WebElement value = driver.findElement(By.cssSelector("#dropdowm-menu-3 > option:nth-child(1)"));
		     boolean c = value.isSelected();
		     
		     if(a) {
		    	 System.out.println("Test case 3 is pass");
		     }
		     else {
		    	 System.out.println("Test case 3 is fail");
		     }
		     
		    driver.close();
		}

	}


