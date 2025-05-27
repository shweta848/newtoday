package Base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public WebDriver openchromebrowser() {
		
		
  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver_win32(2)\\chromedriver.exe");

		//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\impnew\\chromedriver_win32(2)\\chromedriver_win32.Zip\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
		return driver;

		
	}
	
	public WebDriver openfirebrowser() {
		
		
		
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver_win32(2)\\chromedriver.exe");

		
					WebDriver driver=new FirefoxDriver();
				
	}

}
