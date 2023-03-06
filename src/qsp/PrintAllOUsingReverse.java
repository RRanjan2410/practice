package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOUsingReverse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rishi/Desktop/selenuium/hotel.html");
		WebElement cpListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(cpListbox);
		List<WebElement> allSOption = s.getAllSelectedOptions();
		int count=allSOption.size();
		System.out.println(count);
		for(int i=count-1;i>=0;i--){
			String text = allSOption.get(i).getText();
			System.out.println(text);
	}
		//driver.close();
	}

}
