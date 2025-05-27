package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	
	
	@FindBy (xpath="//input[@class=\"sc-dkrFOg kAJwOV sc-jmfXTE dlKLXL search-input-elm sc-jmfXTE dlKLXL search-input-elm\"]")private WebElement search;
	
	
	@FindBy (xpath="//span[@label=\"kurti\"]") private WebElement kurtion;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Search() {
		search.sendKeys("kurti");
	}
	public void onKurti() {
		kurtion.click();
	}

}
