package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		String excepted="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		//System.out.println(driver.getCurrentUrl());
		if(excepted.equals(actualTitle)) {
			System.out.println("testcase pass");
		}
		else
			System.out.println("testcase fail");
	}

}
