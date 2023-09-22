package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignments {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		//MODEL POPUP CLICK ME!
		driver.findElement(By.cssSelector("#button2 > p")).click();
		Thread.sleep(2000);
		
		String str2 = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).getText();
		if(str2.equals("It’s that Easy!! Well I think it is.....")) {
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
		
	}

}
