package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOption {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		String option = sc.next();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rishi/Desktop/selenuium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOption = s.getOptions();
		int counter=0;
		for (int i = 0; i<allOption.size(); i++) {
			String text = allOption.get(i).getText();
			if(text.equals(option)) {
				counter++;
			}
			}
			if(counter==0)
			{
				System.out.println(option+ "is not present");
			}
			else if(counter==1)
			{
				System.out.println(option+ "is present with duplicates");
			}
			else if(counter>1)
			{
				System.out.println(option+ "is present with duplicates");
			}
			driver.close();
		}
	}

