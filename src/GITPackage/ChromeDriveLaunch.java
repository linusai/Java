package GITPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriveLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

          WebDriver driver = new ChromeDriver();
          String baseUrl = "https://artoftesting.com/samplesiteforselenium";
          Actions action = new Actions(driver);
          WebElement btn = driver.findElement(By.id("idOfButton"));
          action.moveToElement(btn).perform();
          Thread.sleep(3000);
          driver.quit();
  		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get(baseUrl);
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com");

	}

}