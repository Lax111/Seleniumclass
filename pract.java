package selenoumtutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		String arr[][]= { 
				{"standard_user","locked_out_user","problem_user","performance_glitch_user"} ,
				{"secret_sauce","secret_sauce","secret_sauce","secret_sauce"} 
		};
		   

		for(int i=0; i<arr.length-1 ; i++){

		for(int j=0;j<arr.length;j++) { 

		   
			driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys(arr[i][j]);

		driver.findElement(By.cssSelector("#password")).sendKeys(arr[i+1][j]);
		driver.findElement(By.cssSelector("#login-button")).click();
	         
		
		}}}}
		
		
		
		
		
		
		

		

