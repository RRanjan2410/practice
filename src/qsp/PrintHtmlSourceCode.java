package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class PrintHtmlSourceCode {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String htmlCode=driver.getPageSource();
		System.out.println(htmlCode);
		driver.close();
		
		
		
	}	
	}
