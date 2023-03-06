package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingDoubleClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement re = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(re).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement readS = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(readS).perform();
		String text1 = driver.getTitle();
		String text2 = "hackerearth-case-study";
		if(text1.equals(text2))
		{
			System.out.println("hacker page is displayed");
		}
		else
		{
			System.out.println("hacker page is not displayed");
		}
driver.quit();
	}

}
