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
		 
		
		//driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1)"))
		

		WebElement RBopt1=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		WebElement RBopt2=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		WebElement RBopt4=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
		WebElement RBopt3=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		RBopt1.click();
		RBopt2.click();
		RBopt4.click();
			
		//Assertion
		boolean RB1 = RBopt1.isSelected();
		boolean RB2 = RBopt2.isSelected();
		boolean RB3 = RBopt3.isSelected();
		boolean RB4 = RBopt4.isSelected();
		
		System.out.println(RB1);
		System.out.println(RB2);
		System.out.println(RB3);
		System.out.println(RB4);
		
		
		
		
		
		
		
		
		
		  }}

