package selenoumtutorial1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gjhghg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Lunching the URL:
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Maximize the window:
		driver.manage().window().maximize();

		// Searching the dropdown elements by locating its id:
		Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));

		// Printing the choice of the dropdown /Get list of web elements
		List<WebElement> lists = select.getOptions();

		// for each Loop through the choice and printing all the dropdown list
		System.out.println("choice of dropdown");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		for (WebElement choice : lists)
			System.out.println(choice.getText());

		//selecting single sellection dropdpwn 
		
		// selectByIndex:
		WebElement ddown = driver.findElement(By.id("dropdowm-menu-1"));
		Select ddown1 = new Select(ddown);
		ddown1.selectByIndex(3); //sql
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		// selectByVisibleText:
		ddown1.selectByVisibleText("Python"); //python
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		// selectByValue:
		ddown1.selectByValue("java"); //Java
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}}
		// Selecting the option -- selectByIndex:
		// Test case 1:
//		select.selectByIndex(3);
//		System.out.println("Select the option by index 3");
//
//		WebElement index = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(4)"));
//		boolean a = index.isSelected();
//		if (a) {
//			System.out.println("Index is selecting");
//		} else {
//			System.out.println("Index is not selecting");
//
//		
//		
//		
//		
//		
//		
//		
//		
//		//selecting single sellection dropdpwn 
//		
//				// selectByIndex:
//				WebElement ddown = driver.findElement(By.id("dropdowm-menu-1"));
//				Select ddown1 = new Select(ddown);
//				ddown1.selectByIndex(3); //sql
//				Thread.sleep(2000);
//
//				// selectByVisibleText:
//				ddown1.selectByVisibleText("Python"); //python
//				Thread.sleep(2000);
//
//				// selectByValue:
//				ddown1.selectByValue("java"); //Java
//				Thread.sleep(2000);
//
//	}
//
//}
