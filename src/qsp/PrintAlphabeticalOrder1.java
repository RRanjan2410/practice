package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticalOrder1 {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Rishi/Desktop/selenuium/hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> allOption = s.getOptions();
	for (int i=0;i<allOption.size();i++) {
		String text = allOption.get(i).getText();
		al.add(text);
	}
	Collections.sort(al);
	for (int i=0;i<al.size();i++)
	{
		String option = al.get(i);
		System.out.println(option);
	}
	driver.close();
}
}
