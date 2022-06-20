package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourth {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yugamwadhwa/Desktop/chromedriver");
//System.setProperty("webdriver.edge.EdgeDriver", "MicrosoftWebDriver.exe");
//EdgeDriver driver=new EdgeDriver();
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
driver.manage().window().maximize();
//driver.findElement(By.linkText("Images")).click();
driver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi']")).click();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
	}

}
