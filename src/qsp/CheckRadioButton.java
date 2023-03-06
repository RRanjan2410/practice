package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioButton {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		int x1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
		int x2 = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
		int x3 = driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
		if(x1==x2 && x2==x3 && x3==x1)
		{
			System.out.println("alinged");
		}
		else
		{
			System.out.println("not alinged");
		}
		

	}

}
