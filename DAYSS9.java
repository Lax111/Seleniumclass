package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DAYSS9 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 
		 driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 driver.manage().window().maximize();
		

		 
		 WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		 WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		 WebElement checkbox3 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		 WebElement checkbox4 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
		
		 checkbox1.click();
		 checkbox2.click();
		 checkbox3.click();
		 checkbox4.click();
		 
		 
		 
		 
		//selecting single selection dropdown 
			
			// selectByIndex:
			WebElement checkbox1 = driver.findElement(By.id("dropdowm-menu-1"));
			Selectcheckbox = new Select(checkbox1);
			ddown1.selectByIndex(3); //sql
			Thread.sleep(2000);

			// selectByVisibleText:
			ddown1.selectByVisibleText("Python"); //python
			Thread.sleep(2000);

			// selectByValue:
			ddown1.selectByValue("java"); //Java
			Thread.sleep(2000);

		 
		//WebElement isSelected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled >input[type=radio]:nth-child(5)"));
			//boolean g5 = isSelected_radioB.isSelected();
		//System.out.println(g5);

		 
		 #checkboxes > label:nth-child(5) > input[type=checkbox]
		 
		 
		 
//		 boolean RB1 = RBopt1.isSelected();
//			boolean RB2 = RBopt2.isSelected();
//			boolean RB3 = RBopt3.isSelected();
//			boolean RB4 = RBopt4.isSelected();
//			
//			System.out.println(RB1);
//			System.out.println(RB2);
//			System.out.println(RB3);
//			System.out.println(RB4);
//			
//			
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
