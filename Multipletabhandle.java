package selenoumtutorial1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabhandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/inventory.html");
		 driver.manage().window().maximize();
		
		 String parent = driver.getWindowHandle();
		 System.out.println("Parent window id is"+parent);
		 
		driver.findElement(By.cssSelector("#item_4_title_link > div")).click();
		//driver.findElement(By.cssSelector("//div[@id=\"item_4_title_link\"]/div")).click();

		 Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		System.out.println("Total window"+count);
		
//		for(String child:allWindows) {
//		
//			if(!parent.equalsIgnoreCase(child)) {
//				driver.switchTo().window(child);
//				
//				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
//				
//				Thread.sleep(3000);
//				driver.close();
//			}}
//			
//			driver.switchTo().window(parent);
//			System.out.println("Parent window title is"+driver.getTitle());
//			
			
			
			
			
			
		
}}
