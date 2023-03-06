package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserExceptParent {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String pWh = driver.getWindowHandle();
		String pTitle = driver.getTitle();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh) {
			driver.switchTo().window(wh);
			String eTilte = driver.getTitle();
			if(pTitle.equals(eTilte))
			{
			}
			else
			{
				driver.close();
			}
		
		}
	}
}

