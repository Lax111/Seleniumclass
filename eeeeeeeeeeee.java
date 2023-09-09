package selenoumtutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class eeeeeeeeeeee {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	
       driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
       driver.manage().window().maximize();
       
       
       
       String currentTitle = driver.getTitle();
       
       String expectedTitle = "Expected Page Title";

       if (currentTitle.equals(expectedTitle)) {
    	    System.out.println("Test case pass");
    	} else {
    	    System.out.println("Test case fail");
    	}
       
	}

}
