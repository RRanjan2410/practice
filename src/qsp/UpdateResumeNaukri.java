package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateResumeNaukri {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rishiranjan24@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("ranjan2410");
		driver.findElement(By.xpath("(//button)[1]")).submit();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(4000);
		File f=new File("./data/rishiresume.docx");
		String abPath = f.getAbsolutePath();
		driver.findElement(By.xpath("(//input[@class='fileUpload waves-effect waves-light btn-large'])[1]")).sendKeys(abPath);
		driver.close();
	}
}
