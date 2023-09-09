package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Days4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		//getText:
		
		WebElement e1 = driver.findElement(By.cssSelector(".section_header"));
		String txt = e1.getText();
		System.out.println(txt);
		
		//getTagName:
		
		String txe2 = e1.getTagName();
		System.out.println(txe2);
		
		//get Attribute:
		
		String txe3 = e1.getAttribute("class");
		System.out.println(txe3);
		
		//getSize:
		
		driver.manage().window().maximize();
		
		Dimension a = e1.getSize();
		System.out.println(a);
		
		
		Dimension b = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).getSize();
		System.out.println(b);
		
		String txt4 = e1.getCssValue("font-size");
		System.out.println(txt4);
	    String txe5 = e1.getCssValue("font-family");
		System.out.println(txe5);
	    String txt6 = e1.getCssValue("color");
		System.out.println(txt6);
		
		
		
	}

}
