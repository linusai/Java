package SeleniumProgram;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CW12MarSeleniumDriver {

       public static void main(String[] args) {

              // TODO Auto-generated method stub

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

            WebDriver driver = new ChromeDriver(); //Driver object created
            String baseUrl = "http://www.google.com";
      		driver.get("https://mail.yahoo.com"); // it will wait for the entire content to get loaded 
      		driver.navigate().to("https://www.outlook.com");//navigate to will be open the secondary content
      		driver.navigate().back();
      		driver.navigate().forward();
      		driver.navigate().refresh();
            driver.manage().window().maximize();
    		driver.manage().deleteAllCookies();
    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		driver.get(baseUrl);
    		
    		driver.close(); // to close the application / instance which is opened by selenium . This command will close the current instance
    		driver.quit(); // to close the all the application instance which is opened by selenium 
    		

       }

}



