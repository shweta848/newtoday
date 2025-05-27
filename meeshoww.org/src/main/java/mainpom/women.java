package mainpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class women {
	
	@FindBy(xpath="class=\"sc-eDvSVe gUjMRV\"")private WebElement Women;
	

public women(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void WOMEN() {
	
	Women.click();
}
}
