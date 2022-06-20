package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","/Users/yugamwadhwa/Desktop/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	}
}
