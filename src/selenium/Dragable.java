package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragable {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jquery.com");
	driver.manage().window().maximize();
	By jqueryJSFoundation_locator=By.xpath("//a[@href='https://js.foundation/']");
	WebElement jqueryJSFoundation_Element=driver.findElement(jqueryJSFoundation_locator);
	jqueryJSFoundation_Element.click();
	}
}
