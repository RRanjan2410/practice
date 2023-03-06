package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInFlipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.flipkart.com/");
		//enter the iphone in search text field
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		//count all autosuggestion
		int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			String text = allLinks.get(i).getText();
			//print all the autosuggest text
			System.out.println(text);
		}
		//get the last suggestion
		allLinks.get(count-1).click();
	}
}
