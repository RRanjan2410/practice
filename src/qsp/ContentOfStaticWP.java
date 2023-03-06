package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentOfStaticWP {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Rishi/Desktop/selenuium/table.html");
List<WebElement> allContent = driver.findElements(By.xpath("//div"));
int count=allContent.size();
for (WebElement i: allContent) {
	System.out.println(i.getText());
	
}
	}

}
