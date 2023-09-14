package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxoptions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		

		
		List<WebElement> cheboxs =driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		
     for (WebElement chebox : cheboxs) {
    	 if(!chebox.isSelected()) {
    		 chebox.click();
	    System.out.println(chebox.isSelected());
    	 }}								

        
     for (WebElement chebox : cheboxs) {
    	 if(chebox.isSelected()) {
    		 chebox.click();
    	
    		 String checkboxText = chebox.getAttribute("value");
    		 System.out.println(checkboxText);
    		 
    		
    		 
    		 
    		 
    		 
    		 
    	 
	    
	    

    	 }} 

	}

}
