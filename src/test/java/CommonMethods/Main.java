package CommonMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class Main {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		System.out.println("Site Opened");

	}

}
