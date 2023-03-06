package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rishi/Desktop/selenuium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOption = s.getOptions();
		int count=allOption.size();
		for (int i=0;i<count;i++) {
			String text = allOption.get(i).getText();
			hs.add(text);
		}
		for (String text:hs)
		{
			System.out.println(text);
		}
		driver.close();
	}

}
