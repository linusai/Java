package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW17MarLocElementChbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Driver object created
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		driver.switchTo().frame("iframeResult");
		WebElement Radiobutton = driver.findElement(By.id("male"));
		if (Radiobutton.isDisplayed()) {
			if(Radiobutton.isEnabled()) {
			if(!Radiobutton.isSelected()) { // This statement is a not null if we use ! mark False condition
				Radiobutton.click();
			}
			}
		}
		WebElement Checkbox1 = driver.findElement(By.id("age2"));
		Checkbox1.click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
	}
	

}
