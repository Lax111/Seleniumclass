package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxopt {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButto ns/index.html");
		

		
		List<WebElement> checkboxes =driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Total no of check:"+ checkboxes.size());
		
	for(int i=0; i <checkboxes.size();i++ ) {
			checkboxes.get(i).click();
	}
//		
//		for(WebElement chbox:checkboxes) {
//			chbox.click();
//		}
		
		
	}}


