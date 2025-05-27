package kkkkhann;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	@FindBy(css="span[class='_wozql4 _13hnk7qk']") private WebElement profileclick;
	
	@FindBy(xpath="//span[text()='Log out']") private WebElement Logout;

	public logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void profilelink() {
		profileclick.click();
	}
	public void logoutclick() {
		Logout.click();
	}

}
