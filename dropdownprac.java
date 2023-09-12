package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownprac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		    String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
		    driver.get(url);
		    //Test Case 1 Validate title of Page
		    
		    String ExceptedTitle = "WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		    String ActualTitle = driver.getTitle();
		    if(ExceptedTitle.equals(ActualTitle)) {
		      System.out.println("Test case 1 passed");
		    }
		    else
		    {
		      System.out.println("Test case  1 failed");
		    }
		    
		    //Test Case 2 select all the check boxes and asset whether it is checked
		    driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		     List <WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		        System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
		             
		        for(WebElement cb:AllCheckBoxes)
		        {
		            cb.click();
		        }
		        System.out.println("All check boxes have been checked");
		     
		     System.out.println("total :" + AllCheckBoxes .size());
		     for(int i =0; i < AllCheckBoxes .size(); i++)
		     {
		       System.out.println("Check boxes :"+AllCheckBoxes .get(i).getAttribute("value"));
		     }
		     WebElement isSelected = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		     boolean e= isSelected.isSelected();
		     if(e) {
		       System.out.println("Test case 2 is passed");
		     }
		     else 
		     {
		       System.out.println("Test case 2 is failed");
		     }
		    
		     
		     // Test Case 3 Select orange a radio button and asset whether it is checked
		     
		     driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		     
		      List<WebElement> linkes = driver.findElements(By.xpath("//input[@type='radio']"));
		      System.out.println("Total :"+ linkes.size());
		     for(int j = 0; j <linkes.size(); j++) 
		     {
		       System.out.println("Radio Button: "+ linkes.get(j).getAttribute("value"));
		     }
		       
		   WebElement orange = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		         
		        orange.click();
		       boolean x = orange.isSelected();
		       if(x) 
		       {
		         System.out.println("Test case 3 is passed.");
		       }
		       else
		       {
		         System.out.println("Test case 3 is failed.");
		       }
		      
		       // Test case 4 From first Drop down select python and assert
		       
		       String expected = "Python";
		       driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		       Select Py = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1 ")));
		       Py.selectByVisibleText("Python");
		      
		        String Actual = driver.getTitle();
		        if(ExceptedTitle.equals(ActualTitle)) {
		          System.out.println("Test case 4 passed");
		        }
		        else
		        {
		          System.out.println("Test case 4 failed");
		        }
		       
		       //Test case 5 Validate the heading of the page
		       WebElement head = driver.findElement(By.cssSelector("h1"));
		       String headtx = head.getText();
		       System.out.println(headtx);
		        boolean a= head.isDisplayed();
		        if(a) {
		          System.out.println("Test case 5 is passed and validate");
		          System.out.println(a);
		        }
		        else 
		        {
		          System.out.println("Test case 5 is failed");
		        }

	}

}
