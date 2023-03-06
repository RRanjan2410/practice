package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteStaticWebPage {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Rishi/Desktop/selenuium/Demo.html");
driver.findElement(By.xpath("//input[@value='A'][1]")).sendKeys(Keys.CONTROL+"ac");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='B'][1]")).sendKeys(Keys.CONTROL+"av");
	}

}
