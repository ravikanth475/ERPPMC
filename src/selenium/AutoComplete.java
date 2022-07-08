package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://www.amazon.in");
   By amazon_searchbox_loactor=By.id("twotabsearchtextbox");
	  WebElement amazon_searchbox_Element=driver.findElement(amazon_searchbox_loactor);
	  amazon_searchbox_Element.sendKeys("moblies");
	  for( int i=1;i<=3;i++)
	  {
		  amazon_searchbox_Element.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(3000);
	  }
	  amazon_searchbox_Element.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	}

}
