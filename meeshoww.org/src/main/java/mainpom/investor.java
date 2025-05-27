package mainpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class investor {
	
	@FindBy(xpath="//span[text()=\"Investor Relations\"]")private WebElement INVE;
	
	public investor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Investor() {
		INVE.click();
	}
	
	

}
