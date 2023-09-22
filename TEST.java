package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TEST {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		driver.get("https://jqueryui.com/tooltip/");
//
//		driver.switchTo().frame(0);
//
//		WebElement agebox=driver.findElement(By.id("age"));
//
//		String tooltiptext=agebox.getAttribute("title");
//
//		System.out.println(tooltiptext);
//
//		if(tooltiptext.equals("We ask for your age only for statistical purposes."))
//
//		{
//
//		System.out.println("Tooltip test passed");
//
//
//		}
//
//		else
//		{
//		System.out.println("Tooltip test failed");

//		driver.manage().window().maximize();
//
//		driver.get("https://jqueryui.com/slider/");
//		driver.switchTo().frame(0);
//
//		WebElement slider = driver.findElement(By.cssSelector("#slider > span"));
//		
//		Thread.sleep(3000);
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
//	
		//Launching sample website
		 //driver.get("https://artoftesting.com/sampleSiteForSelenium");
		// driver.manage().window().maximize();
		 
		 //Get list of web-elements with tagName  - a
		 //List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 //Traversing through the list and printing its text along with link address
//		 for(WebElement link:allLinks){
//		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		 }
		 
		 //Commenting driver.quit() for user to easily verify the links
		 //driver.quit();
		 
//		 List<WebElement> allLinks = driver.findElement(By.cssSelector("#hmenu-content > ul"));
//		 
//		 for(WebElement link:allLinks){
////			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//
//		List<WebElement> allLinks =  driver.findElement(By.cssSelector("h2"));
////		String a = headonea.getText();
////		System.out.println(a);
////		 
//		for(WebElement link:allLinks){
//			 System.out.println(link.getText() + " - " + link.getAttribute("href")); 
//		 
		 
		 
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		 driver.manage().window().maximize();
		 
		 //Get list of web-elements with tagName  - a
//		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		 
//		 //Traversing through the list and printing its text along with link address
//		 for(WebElement link:allLinks){
//		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		 }
//		 
//		 //Commenting driver.quit() for user to easily verify the links
//		 //driver.quit();
//		 } 
//		 
		}	 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	
	
	
	

}
