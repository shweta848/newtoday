package mainpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ethic {
	
	@FindBy(xpath="//span[text()=\"Women Ethnic\"]")private WebElement women;
	
	
	public ethic(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Ewomen() {
		women.click();
	}
}
