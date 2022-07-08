import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    WebDriver driver=new ChromeDriver();
  driver.get("http://www.amazon.in");
  By amazon_dropdown_locator=By.cssSelector("select#searchDropdownBox");
 WebElement amazon_dropdown_Element=driver.findElement(amazon_dropdown_locator);
 amazon_dropdown_Element.click();
 Select select =new Select(amazon_dropdown_Element);
 select.selectByIndex(6);
 select.selectByValue("search-alias=amazon-pharmacy");
 select.selectByVisibleText("Amazon Pharmacy");
 List <WebElement> alloptions=select.getOptions();
 for(WebElement  opt :alloptions) {
	 String data=opt.getText() ;
	 System.out.println(data);
 
	 if(data.equals("Books")) {
		 System.out.println(data);
	 }
 
	}

}
}