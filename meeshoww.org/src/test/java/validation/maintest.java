package validation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import mainpom.Beauty;
import mainpom.Search;
import mainpom.ethic;
import mainpom.investor;
import mainpom.women;


public class maintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void Mainbrowser() {
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\IMPL\\chrome-win32\\chrome.exe");

	     //   driver=new ChromeDriver();
			 driver=new FirefoxDriver();
	    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			driver.get("https://www.meesho.com");	
			}

//	@Test 
//	public void testt() {
//		Search s= new Search(driver);
//		s.SEARCH1();
//	    s.SEARCHBUTTON1();//unstable build we didnt get any search button on meesho
//		s.SEARCH2(driver);
//		s.SEARCHBUTTON2();
//		
//	}
	
	@Test(priority=1)
	
	public void test2() {
		women w= new women(driver);
		w.WOMEN();
			}
	
	@Test(priority=2)
	
	public void test3() {
		ethic e=new ethic(driver);
		e.Ewomen();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	
	public void test4() {
		investor I=new investor(driver);
		I.Investor();
		driver.navigate().back();
		
	}
	@Test(priority=4)
	public void Health() {
		Beauty b=new Beauty(driver);
		b.Beautyhealth();
		
	}
	
	
	
	@AfterTest
	public void closebrowser() {
		
	}
}
