package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6seleniumlocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		// Locators??
		// <h2 id = "one" class = "three" name = "name">Hello</h2>

// h2 - tag name; id- attribute; "one"- value;

// ID locator
// use the "id" attribute of html element to locate it
		// ID:
		/*
		 * WebElement ele = driver.findElement(By.id("user-name"));
		 * 
		 * ele.sendKeys("standard_user");
		 * 
		 * //Name: driver.get("https://www.saucedemo.com/");
		 * 
		 * //name locator of html element to select the element WebElement ele1 =
		 * driver.findElement(By.name("user-name")); ele1.sendKeys("standard_user");
		 * 
		 * 
		 * //className locator -- class locator of html element to select the element
		 * 
		 * WebElement ele2 = driver.findElement(By.className("input_error"));
		 * ele2.sendKeys("standard_user");
		 */

		List<WebElement> elelist = driver.findElements(By.className("input_error"));
		elelist.get(1).sendKeys("secret_sauce");

		// tagName:

		/*
		 * WebElement ele4 = driver.findElement(By.tagName("input"));
		 * ele4.sendKeys("standard_user");
		 * 
		 */
		// tagName:

		// CssSelector Locator

		// .className = swaglabs
		// #idValue = username
		// tagName = username, password, loginbutton ---form(tagname)
		// tagName[attribute = "value"]
		// <input class="input_error form_input" placeholder="Username" type="text"
		// data-test="username" id="user-name" name="user-name" autocorrect="off"
		// autocapitalize="none" value="" fdprocessedid="swqhlf">

//			driver.findElement(By.cssSelector(".login_logo"));
//			driver.findElement(By.cssSelector("#user-name"));
//			driver.findElement(By.cssSelector("form"));
//			driver.findElement(By.cssSelector("input[placeholder='Username']"));

		// Xpath
		// --- //tagName[@attriute = 'value']

		// LinkText

		// PartialLinkText

	}

}
