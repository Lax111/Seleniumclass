package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		 
		//Test case 1:
		
		
		
		//<h2 name="contactme" id = "three" class ="section_header">CONTACT US</h2>;
		
		//xpath , CSS selector
		
		//tagName
		WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String q1 = headTwo.getText();
		System.out.println(q1);
		//CONTACT US
		
		//class
		
		WebElement headTwob= driver.findElement(By.cssSelector(".section_header"));
		String q2 = headTwo.getText();
		System.out.println(q2);
		//CONTACT US
		
		//id
		
		//<form action = "contact_us.php" method = "post" id = "contact_form">
		
		WebElement headTwoc = driver.findElement(By.cssSelector("#contact_form"));
		boolean pre = headTwoc.isDisplayed();
		System.out.println(pre);
		
		//true
		
		//anyAttribute
		//tagName[attribute= "value"]
		
		//Test 3
		driver.findElement(By.cssSelector("h2[name = \"contactme\"]"));
		String q3 = headTwo.getText();
		System.out.println(q3);
		
		if(q3.equals("CONTACT US")) {
			System.out.println("Testcase 1 pass");
		}
			else {
				System.out.println("Testcase Fail");
			}
		
		//CONTACT US
		
		//Testcase2 (happy path)
		
		//Arrange
		
		
		//Action
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("lax");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		
		//Assertion
		
		boolean q4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
		
		if(q4){
			System.out.println("Testcase 2 pass");
		}
		
		else {
			System.out.println("Testcase 2 fail");
		}
		
		//Test case 3 (in-correct email address)
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("lax");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("lax@.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("learning selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		boolean q5 = driver.findElement(By.cssSelector("body")).isDisplayed();
		
		if(q5) {
			System.out.println("Testcase 3 pass");
		}
		else {
			System.out.println("Testcase 3 fail");
		}
		
		//Testcase 4#contact_form > input:nth-child(1)
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("laxmic");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("seleniums");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
		
		String q6 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
		System.out.println(q6);
		
		if(q6.isEmpty()) {
			System.out.println("Testcase 4 pass");
			
		}
		else {
			System.out.println("Testcase 4 fail");
		}
		
		
		
		
		
		
		
		
		
	}		

}


