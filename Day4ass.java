package selenoumtutorial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4ass {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://www.saucedemo.com/");
		
		 // Test Case 1 (Valid login)
        performLogin(driver, "standard_user", "secret_sauce");
        boolean TC1 = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).isDisplayed();
        if (TC1) {
            System.out.println("Test Case 1 passed.");
        } else {
            System.out.println("Test Case 1 failed.");
        }
        
        

        // Test Case 2
        driver.get("https://www.saucedemo.com/");
        performLogin(driver, "locked_out_user", "secret_sauce");
        boolean TC2 = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed();
        if (TC2) {
            System.out.println("Test Case 2 passed.");
        } else {
            System.out.println("Test Case 2 failed.");
        }

        // Test Case 3
        driver.get("https://www.saucedemo.com/");
        performLogin(driver, "problem_user", "secret_sauce");
        boolean TC3 = driver.findElement(By.cssSelector("#item_0_img_link > img")).isDisplayed();
        if (TC3) {
            System.out.println("Test Case 3 passed.");
        } else {
            System.out.println("Test Case 3 failed.");
        }

        // Test Case 4
        driver.get("https://www.saucedemo.com/");
        performLogin(driver, "performance_glitch_user", "secret_sauce");

        // it is used to wait before finding element to validate.
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       

        int displayedImageCount = numOfImg(driver);

        if (displayedImageCount > 0) {
            System.out.println("Number of displayed images: " + displayedImageCount);
            System.out.println("Test Case 4 passed.");
        } else {
            System.out.println("No images displayed or Test Case 4 failed.");
        }

        
    }

    public static void performLogin(ChromeDriver driver, String username, String password) {
        WebElement userNameField = driver.findElement(By.cssSelector("#user-name"));
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));

        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public static int numOfImg(ChromeDriver driver) {
        int i = 0;
        // counting images
        for (WebElement image : driver.findElements(By.cssSelector(".inventory_item_price"))) {
            if (image.isDisplayed()) {
                i++;
            }
        }
        return i;
    }
}
	


