package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kurti {

	
	@FindBy (xpath="//span[@label=\"Women\"]")  private WebElement female;
	
	//@FindBy(xpath=" ") private webelement 
	
	public kurti(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	public void womenbutton() {
		female.click();
	}
	
}




//span[text()="Hello, Manisha"]

//span[text()="Sign Out"]

//span[text()="Your Orders"]