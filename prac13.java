package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		
		
		//getting total no of rows
		
		List<WebElement> ele = driver.findElements(By.xpath("//*[table]"));
		
		System.out.println();
	
		//getting total no of columns
		
		//driver.findElement(By.xpath("//*[@id=\"thumbnail-1\"]"))
		//*[@id="t01"]/tbody/tr[1]
	
	}

}
//*[@id=\"t01\"]/tbody/tr