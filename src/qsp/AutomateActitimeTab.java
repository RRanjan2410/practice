package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitimeTab {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
		Set<String> wh = driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for (String hp : wh) {
			driver.switchTo().window(hp);
		}
		List<WebElement> printH = driver.findElements(By.xpath("//h2"));
		for (WebElement printAll : printH) {
			System.out.println(printAll.getText());	
		}
		driver.quit();
	}

}
