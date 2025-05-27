package meesho;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Browser;
import auto.kurti;
import auto.login;

public class normaltest extends Browser{
	
	WebDriver driver;
	login L;
	kurti f;
	
	
	@BeforeTest
     public void openbrowser(String browsername) {{
		
		
		if(browsername.equals("Firefox")) {
			
			driver=openfirebrowser();
		}
		driver.get("https://www.meesho.com/");
		
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.manage().window().maximize();
			
	}}
		@BeforeClass
		public void objectcreate(){
		 L=new login(driver);
	     f=new kurti(driver);
		
		}
		@BeforeMethod 
		public void l() {
			L.Search();
			L.onKurti();
		}
		@Test
		public void To_verify_search() {
			
			f.womenbutton();
		}
		
		@AfterMethod
		
	public void aftermethod() {
						
	}
		
		@AfterClass
		
		public void afterclass() {
			
			L=null;
			f=null;
			
		}
	
	

}
