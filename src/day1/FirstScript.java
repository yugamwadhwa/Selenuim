package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yugamwadhwa/Desktop/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
