package org.task.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass3 extends BaseClass {
	public PojoClass3() {
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy (id = "radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy (id = "continue")
	private WebElement conti;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getConti() {
		return conti;
	}
	
	
	
}
