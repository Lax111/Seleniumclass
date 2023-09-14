package selenoumtutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		List<WebElement> radiobuttons = driver.findElements(By.cssSelector(" input[name='color']"));

		for (WebElement radiobutton : radiobuttons) {
			radiobutton.click();

			boolean isSelectedopt = radiobutton.isSelected();
			System.out.println(isSelectedopt);
		}

	}

}
