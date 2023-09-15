package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		
		// <h2 name="contactme" class ="section_header">CONTACT US</h2>;
        // xpath , CSS selector

		// tagName #contact_me > div > div:nth-child(1) > div > h2
		// finging element with tagName to find the "CONTACT US" element
		// {in DOM command f and type *tagName that is highlighted*}ex:{h2}

		// tagName:

		WebElement headonea = driver.findElement(By.cssSelector("h2"));
		String a = headonea.getText();
		System.out.println(a);

		// class:

		// finding element with class to find the "CONTACT US" text element
		// {in DOM command f and type .*Valueofthatattribute*}ex:class
		// =."section_header"

		WebElement headoneb = driver.findElement(By.cssSelector(".section_header"));
		String b = headoneb.getText();
		System.out.println(b);

		// id:
		
          //finding element with id to validate that "CONTACT US" is displayed
		  //{in DOM command f and type *[id]*}

		
		// <form action="contact_us.php" method="post" id="contact_form">

		WebElement headonec = driver.findElement(By.cssSelector("#contact_form"));
		//String h = headTwoc.getText();
		 //System.out.println(h);
		
		
		boolean c = headonec.isDisplayed();
		System.out.println(c);

		// anyAttribute

		// tagName[attribute= "value"]

		//finding element by any attribute
	    //tagName[attribute= "value"]
		
		
		//Test case 1:
		WebElement headoned = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
	//  WebElement headThreed = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		 // boolean q8 =headThreed.isDisplayed();
		  //  System.out.println(q8);
		
		String d = headoned.getText();
		System.out.println(d);

		if (d.equals("CONTACT US")) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}

		// CONTACT US

		// Testcase2: (happy path)

		// Arrange
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("laxmi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax108@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("selenium class");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();

		boolean e = driver.findElement(By.cssSelector("h1")).isDisplayed();
		if (e) {
			System.out.println("test case 2 pass");
		} else {
			System.out.println("test case 2 fail");
		}
		// Testcase3:

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("lacmi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax108gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("selenium class");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();

		boolean f = driver.findElement(By.cssSelector("body")).isDisplayed();
		if (f) {
			System.out.println("test case 3 pass");
		} else {
			System.out.println("test case 3 fail");
		}

		// Testcase4:  reset: #form_buttons > input:nth-child(1)

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("laxmi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("chapagain");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chapagailax108@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("selenium class");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();

		//reset first name
		
		String g = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
		System.out.println(g);

		if (g.isEmpty()) {
			System.out.println("test case 4 pass");
		} else {
			System.out.println("test case 4 fail");
		}

	}

}
