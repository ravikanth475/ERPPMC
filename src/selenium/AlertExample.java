package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/tulasi/Downloads/alerts.html");
		WebElement submit=driver.findElement(By.xpath("/html/body/form/center/input"));
		submit.click();
        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        
	}

}
