package selenoumtutorial1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pracA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		  //Launching URL
		        String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
		        driver.get(url);

		         //Maximizing window
		         driver.manage().window().maximize();

		         //Selecting the dropdown element by locating its id
		         Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		         //Printing the choice of the dropdown /Get list of web elements
		         List<WebElement> ls = select.getOptions();

		         //for each Looping through the choice and printing dropdown 
		         System.out.println("The dropdown choices are:");
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		         for(WebElement choice: ls)
		             System.out.println(choice.getText());
		         
		          //Using selectByIndex for test case       
		         select.selectByIndex(3);     
		         WebElement sbIndex = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(4)"));
		         boolean sb= sbIndex.isSelected();
		         if(sb)
		         {
		        	 System.out.println("\nSelect by index case is passed.\n");
		         }
		         else
		         {
		        	 System.out.println("Select by index case is Failed");
		         }
		         
		         //Selecting  -- selectByVisibleText
		         System.out.println("Test case selectByVisibleText");
		         select.selectByVisibleText("JAVA");         
		         WebElement sr = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(1)"));
		         boolean e= sr.isSelected();
		         if(e) {
				 System.out.println("selectByVisibleText Test case is passed");
		         }
		         else 
		         {
				 System.out.println("selectByVisibleText Test case is failed");
		         }                 
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		         driver.quit();
			}

		}



