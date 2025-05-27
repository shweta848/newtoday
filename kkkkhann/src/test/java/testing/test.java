package testing;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kkkkhann.code;
import kkkkhann.login;
import kkkkhann.logout;
import kkkkhann.teacher;




public class test {
WebDriver driver;
	
	teacher teachers;
	code Code;
	login Login;
	logout Logout;
	@BeforeClass
	public void beforeclass() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.khanacademy.org/");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void beforemethod() {
		Login=new login(driver);
		Login.Loginlink();
		Login.username();
		Login.password();
		Login.loginbutton();
	}
	
	@Test
	public void To_verify_the_teachertab() {
		teachers =new teacher(driver);
		teachers.Teachertab();
		teachers.teachermail();
	//	String url = driver.getCurrentUrl();
	//	System.out.println(url);
		
	//	if(url.equals("https://www.khanacademy.org/")) {
		//	System.out.println("test is pass");
	//	}
	//	else {
	//		System.out.println("test is fail");
		    Code=new code(driver);
			Code.Codeclick();
			Code.entercode();
			Code.Back();
		}
		
	
	@AfterMethod
	public void AFtermethod() {
		Logout =new logout(driver);
		
		Logout.profilelink();
		Logout.logoutclick();
	}
	@AfterClass
	public void afterclass() {
		//driver.close();
	}
	
	
	
}


