package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe" );
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.ebay.com");
	
    String mainwindow=driver.getWindowHandle();
     System.out.println(mainwindow);
     By ebay_savedlink_locator=By.xpath("//a[@href='https://www.ebay.com/feed']");
     WebElement ebay_savedlink_element=driver.findElement(ebay_savedlink_locator);
     Actions action=new Actions(driver);
     action.contextClick(ebay_savedlink_element).build().perform();
     
     Robot robo=new Robot();
     robo.keyPress(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_ENTER);
     Set<String> allWindowsId=driver.getWindowHandles();
     System.out.println( allWindowsId);
     for(String win :allWindowsId) {
    	 if(!win.equals(mainwindow)) {
    		 driver.switchTo().window(win);
    		 driver.close();
    	 }
    	 driver.switchTo().window(mainwindow); 
    		Thread.sleep(3000); 
    		driver.close();
     }
    		driver.quit();
    	 }
     }



