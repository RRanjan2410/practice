package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String expectedUrl="https://www.selenium.dev/";
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("url is sucessfully navigating and pass");
		}
		else
		{
			System.out.println("url is not sucessfully navigating and fail");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
