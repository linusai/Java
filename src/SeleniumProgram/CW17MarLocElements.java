package SeleniumProgram;
// Check box key properties are isDisplayed() / isEnabled /isSelected
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW17MarLocElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Driver object created
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.switchTo().frame("iframeResult"); // This syntax will help to find the frame where the attributes are there. Inspect and search for iFrame attribute and then take the ID
		WebElement Checkbox = driver.findElement(By.id("vehicle1"));
		//Checkbox.click();
		if (Checkbox.isDisplayed()) {
			if(Checkbox.isEnabled()) {
			if(!Checkbox.isSelected()) {
				Checkbox.click();
			}
			}
		}
		WebElement Checkbox1 = driver.findElement(By.id("vehicle2"));
		Checkbox1.click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
	}
	

}
