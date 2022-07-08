package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobiles {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/search-jobs");
	driver.manage().window().maximize();
	Thread.sleep(3000);
//WebElement js=driver.findElement(By.xpath("//div[text()='Jobs']"));
//js.click();
	//WebElement pq=driver.findElement(By.xpath(""));
	//pq.click();

	
	By jobs_locator=By.xpath("//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/a/div");
	WebElement jobs_element=driver.findElement(jobs_locator);
	jobs_element.click();

}
}
