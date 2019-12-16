package org.task.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass5 extends BaseClass {
	public PojoClass5() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "order_no")
	private WebElement idNum;

	public WebElement getIdNum() {
		return idNum;
	}
	
	
}
