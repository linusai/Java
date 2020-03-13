package SeleniumProgram;
//xpath will search for the value if the postion is not found then the xpath will fail / Relative XPATH can be customized //tagname[@attribute="Value"]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW13MarSeleniumLocators {

	public static void main(String[] args) throws Exception {
		String email="u.linusai@gmail.com";
		String password ="Ul$061506";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Driver object created
		driver.get("http://freecrm.co.in/");
		// below are the abosulte xpath 
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(email); //this syntax is used to call the variable and pass it to the username field 
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(password);
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Ul$061506");
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		//Realtive XPATH or Custom XPATH
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);
		driver.close();
		//driver.findElements(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]"))
		
		
		
		//driver.findElement(By.name("email")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys("password");
		
		//driver.findElement(By.xpath("//input[@type='text' and @name='email']")).click();
		
	///driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		//*[@id="ui"]/div/div/form/div/div[3]
		
		
	}

}
