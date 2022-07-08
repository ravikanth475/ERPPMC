package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
       By jquery_Examples_locator=By.xpath("//h2[text()='Examples']");
       WebElement jquery_Examples_Element=driver.findElement(jquery_Examples_locator);
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true)",jquery_Examples_Element);
        driver.switchTo().frame(0);
        By jquery_frames_locator=By.xpath("//p[text()='Drag me to my target']");
       WebElement jquery_frames_Element=driver.findElement(jquery_frames_locator);
       By jquery_frames1_locator=By.xpath("//p[text()='Drop here']");
      WebElement jquery_frames1_Element=driver.findElement(jquery_frames1_locator);
      Actions action=new Actions(driver);
      action.dragAndDrop(jquery_frames_Element, jquery_frames1_Element).build().perform();
   
	}

}
