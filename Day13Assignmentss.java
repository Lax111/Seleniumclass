package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignmentss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.cssSelector("#button4 > p")).click();
		Thread.sleep(2000);	


		String text1 = driver.switchTo().alert().getText();
		if(text1.equals("Press a button!")) {
		System.out.println("Test case 1 pass");
		}
		else {
			System.out.println("Test case 1 fail");
			
		}
		//ok button
//		driver.switchTo().alert().accept();
//		String ele1 = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		
//		if(ele1.equals("You pressed OK!")) {
//	}
//			else {
//			
//				System.out.println("Test case fail");
//			}
//		
		//Cancle button
		driver.switchTo().alert().dismiss();
		String ele2 = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
		
		if(ele2.equals("You pressed Cancel!")) {
		
		System.out.println("Test case 2 pass");
		}
		
		else {
			System.out.println("Test case 2 fail");
		
		}
		}}
	
