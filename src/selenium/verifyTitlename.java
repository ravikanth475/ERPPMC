package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class verifyTitlename {

	public static void main(String[] args) {
		String expectedresult="flipkart";
	System.setProperty("webdriver.edge.driver", "C:\\Users\\edgedriver_win64\\edgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://www.flipkart.com");
	String actualtitle=driver.getCurrentUrl();
	System.out.println(actualtitle);
	
	boolean status =actualtitle.contains(expectedresult);
	if(status)
	 {
		System.out.println("same");
	}
		else
			System.out.println("fail");
	//System.out.println(status);
	

	}

}
