package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/tulasi/Downloads/multiplebox1.html");
    By multipleframes_loactor=By.xpath("//select[id='tools']");
   WebElement multipleframes_Element=driver.findElement(multipleframes_loactor);
   
  /* Select select =new Select(multipleframes_Element);
	List<WebElement> allOptions=select.getOptions();
	System.out.println("All Options");
	for (WebElement opt : allOptions) {
		System.out.println(opt.getText());
	}
	
	for (WebElement opt : allOptions) {
		
		String data=opt.getText();
		if(data.equals("Selenium RC") || data.equals("SElenium Grid")  )
			select.selectByVisibleText(data);
	}
	}*/

}}
