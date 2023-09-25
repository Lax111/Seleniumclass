package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice123 {

	public static void main(String[] args) {
		//Arrange
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//Action
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		//Assertion
		String Title = "Swag Labs";
	String	expectedurl = "inventory";
WebElement head=driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
boolean c = head.isDisplayed();
System.out.println(c);

String act = driver.getTitle();
if(act.contains(Title)) {
	System.out.println("Title is pass");
}
else 
{
	System.out.println("Title is fail");
}

String str = driver.getCurrentUrl();
if(str.contains(expectedurl)) {
	System.out.println("pass");
}else
{
	System.out.println("Fail");
}
	
if(head.isDisplayed()) {
	System.out.println("Test pass");
}
else {
	System.out.println("Fail");
}
WebElement log = driver.findElement(By.cssSelector(".app_logo"));
if(log.isDisplayed()) {
	System.out.println("Log test case pass");
}
else
{
	System.out.println("Logo test case fail");
}
String Expected ="Sauce Labs Backpack";
List <WebElement> item = driver.findElements(By.cssSelector(".inventory_item_name"));
boolean productFound = false;
for(int i = 0; i < item.size(); i++) {
	//System.out.println(item.get(i).getText());
	if(item.get(i).getText().equals(Expected)) {
		System.out.println("test case for item is pass");
		productFound = true;
		break;
	}
	
	
}
if(productFound) {
	System.out.println("Product aviable and test case pass");
}
else {
	System.out.println("Product is not found, test case is fail");
}

driver.close();
	}

}
