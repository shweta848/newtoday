package mainpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beauty {
	@FindBy(xpath="//span[text()=\"Beauty & Health\"]")private WebElement health;
	

	public Beauty(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Beautyhealth() {
		health.click();
	}
}
