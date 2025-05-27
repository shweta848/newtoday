package meesho;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import auto.kurti;
import auto.login;

public class test {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver-win64\\chromedriver.exe");
		      WebDriver driver=new FirefoxDriver();
			driver.get("https://www.meesho.com/");
			
			
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			 driver.manage().window().maximize();
	
	    	login L=new login(driver);
	    	L.Search();
			L.onKurti();
			
		    kurti f=new kurti(driver);
		
				
				f.womenbutton();
			
	}

}
