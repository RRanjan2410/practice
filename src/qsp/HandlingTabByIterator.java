package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabByIterator {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWh = driver.getWindowHandles();
		Iterator<String> itr = allWh.iterator();
		String cWh = itr.next();
		String pWh = itr.next();
		Thread.sleep(2000);
		driver.switchTo().window(cWh);
		driver.close();
		driver.switchTo().window(pWh);
		driver.close();
		
		}
}
