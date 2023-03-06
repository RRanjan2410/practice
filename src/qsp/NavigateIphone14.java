package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateIphone14 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allProd = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		int count1=allProd.size();
		System.out.println(count1);
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count2=allPrice.size();
		System.out.println(count2);
		for (int i = 0; i <count2; i++) {
			String pd = allProd.get(i).getText();
			String pr = allPrice.get(i).getText();
			System.out.println(pd +"----------->"+pr);
		
			}
		}
	}

