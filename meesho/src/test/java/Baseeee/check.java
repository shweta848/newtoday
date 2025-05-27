package Baseeee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check {
	
	public static void main(String[]args) {
	//	System.setProperty("webdriver.chrome.driver", " ")
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver_Win32(2)\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	
//	 System.out.println(driver.getTitle());
	}

}
