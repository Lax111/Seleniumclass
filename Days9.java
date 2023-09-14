package selenoumtutorial1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.get("https://www.saucedemo.com");
		//driver.get("https://www.macys.com/shop/shoes?id=13247&cm_sp=us_hdr-_-shoes-_-13247_shoes");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
	
		driver.findElement(By.cssSelector("#item_3_title_link > div")).click();
		 String title1 = driver.getTitle();
		System.out.println(title1);
			
			
	}		
}
