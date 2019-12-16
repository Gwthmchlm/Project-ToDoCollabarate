package org.task.pom.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass3 extends BaseClass {
	public PojoClass3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy (id = "continue")
	private WebElement continuee;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuee() {
		return continuee;
	}
	
	
	
}
