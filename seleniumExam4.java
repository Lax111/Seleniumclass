package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		Select pyt = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		pyt.selectByVisibleText("Python");
		
		

		
		String selectedOption = pyt.getFirstSelectedOption().getText();
        if (selectedOption.equals("Python")) {
            System.out.println("Python is selected");
        } else {
            System.out.println("Python is not selected");
        }
		
		
		
	}

}
