package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rishi/Desktop/selenuium/hotel.html");
		WebElement cpListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(cpListbox);
		List<WebElement> allSOption = s.getOptions();
		int count=allSOption.size();
		for (int i=0;i<count;i++) {
			String text = allSOption.get(i).getText();
			hs.add(text);
		}
		for (String text:hs)
		{
			System.out.println(text);
		}
		driver.close();
	}
}
