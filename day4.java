package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
		
		
		//getText()	
		
		WebElement e1 = driver.findElement(By.cssSelector(".section_header"));
		String q1 = e1.getText();
		System.out.println(q1);
		
		//getTagName()
		
		String txt = e1.getTagName();
		System.out.println(txt);
		
		//get Attribute
		
		String txt1 = e1.getAttribute("class");
		System.out.println(txt1);
		
		//getSize
		
		Dimension b = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).getSize();
		System.out.println(b);
		
		String txt2 = e1.getCssValue("font -size");
		System.out.println(txt2);
		String txt3 = e1.getCssValue("font-family");
		System.out.println(txt3);
		String txt4 = e1.getCssValue("color");
		System.out.println(txt4);
		
		Point q = e1.getLocation();
		System.out.println(q);
		
		
		driver.close();
		
		
		 
	}

}
