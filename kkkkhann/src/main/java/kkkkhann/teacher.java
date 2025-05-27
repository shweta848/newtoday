package kkkkhann;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class teacher {
	
	@FindBy(css="._xy39ea8") private WebElement teachertab;
	
	@FindBy(css="[placeholder=\"Email (yourteacher@example.com)\"]") private WebElement Teacher;

	public teacher(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Teachertab() {
		teachertab.click();
	}
	public void teachermail() {
		Teacher.sendKeys("shhjkjdh");
	}

}
