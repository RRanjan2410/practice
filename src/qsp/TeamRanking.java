package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamRanking {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> team = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		List<WebElement> score = driver.findElements(By.xpath("//tbody/tr/td[4]"));
		for (int i = 0; i <team.size(); i++) {
			String name = team.get(i).getText();
			String points = score.get(i).getText();
			System.out.println(name+"--------->"+points);
			
		}
}
	}
