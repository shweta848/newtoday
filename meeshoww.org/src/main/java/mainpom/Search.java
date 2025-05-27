package mainpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
@FindBy(xpath="//input[@placeholder=\"Try Saree, Kurti or Search by Product Code\"]") private WebElement SEARC;
@FindBy(xpath="//div[@class=\"sc-gScZFl femXzk\"]") private WebElement SEARCbu;

public Search(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void SEARCH1() {
	SEARC.sendKeys("ladies dresses");
	
}

public void SEARCHBUTTON1() {
	SEARCbu.click();
	
}

public void SEARCH2(WebDriver driver) {
	driver.navigate().refresh();
	SEARC.sendKeys("boys dresses");
	
}

public void SEARCHBUTTON2() {
	SEARCbu.click();
	
}



}
