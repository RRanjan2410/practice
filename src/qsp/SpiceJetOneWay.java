package qsp;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetOneWay {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='From']/../div[2]/input")).sendKeys("DEL");
		WebElement to = driver.findElement(By.xpath("//div[.='To']/../div[2]/input"));
      to.sendKeys("PAT");
      driver.findElement(By.xpath("//div[.='PAT']/child::div[@class='css-76zvg2 r-1xedbs3 r-ubezar']")).click();
      
     // Date date=new Date();
     // System.out.println(date);
      //String[] d=date.toString().split(" ");
      //String day=d[0];
      //String cdate=d[2];
      //String month=d[1];
      //String year=d[5];
      
     // String traveldate=day+" "+cdate+" "+month+" "+year;
     driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/descendant::div[text()='22']")).click();
//	driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta' and .='Search Flight']")).click();
	//driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
	// for round trip
	
    //driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/descendant::div[text()='22']")).click();
driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();
	}
	

}
