package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehour {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);
By flipkart_cross_locator=By.xpath("//button[text()='✕']");
WebElement flipkart_cross_element=driver.findElement(flipkart_cross_locator);
flipkart_cross_element.click();
By flipkart_fashion_locator=By.xpath("//div[text()='Fashion']");
WebElement flipkart_fashion_element=driver.findElement(flipkart_fashion_locator);
 Actions action =new Actions(driver);
	action.moveToElement(flipkart_fashion_element).build().perform();
	Thread.sleep(3000);

	By flipkart_womenEthnic_locator=By.xpath("//a[text()='Women Ethnic']");
	WebElement flipkart_womenEthnic_element=driver.findElement(flipkart_womenEthnic_locator);
	flipkart_womenEthnic_element.click();
	//driver.close();	
	}

}
