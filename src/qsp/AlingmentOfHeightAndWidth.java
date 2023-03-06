package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlingmentOfHeightAndWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
WebElement emailTbx = driver.findElement(By.id("username"));
WebElement passwordTbx = driver.findElement(By.name("pwd"));
int h1=emailTbx.getSize().getHeight();
int w1=passwordTbx.getSize().getWidth();
int h2=emailTbx.getSize().getHeight();
int w2=passwordTbx.getSize().getWidth();
if(h1==h2 && w1==w2)
{
	System.out.println("height and width of usename and password text field is same ");
}
else
{
	System.out.println("height and width of usename and password text field is not same");
}
	}

}
