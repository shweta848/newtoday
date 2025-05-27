package kkkkhann;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
//	change name
	// step 1 to declare the data members global variables
			@FindBy(css="#login-or-signup")private WebElement loginlink;
		    
			@FindBy(css="#uid-login-form-0-wb-id-identifier-field") private WebElement sername; //give username
			
			@FindBy(css="#uid-labeled-text-field-1-wb-id-field") private WebElement password;
			
			@FindBy(css="._1gfg6utt") private WebElement loginbutton;
			
			// step 2 initialization of variable or DM
		
			public login(WebDriver driver) {
				PageFactory.initElements(driver, this); // constructor

			}
			//step 3 create method
			public void Loginlink() {
				loginlink.click();// encapsulation
			}
			 public void username() {
				 sername.sendKeys("Abhinavvelocity");
			 }
			public void password() {
				password.sendKeys("Abhi@1804+werty");
			}
			public void loginbutton() {
				loginbutton.click();
			}

}
