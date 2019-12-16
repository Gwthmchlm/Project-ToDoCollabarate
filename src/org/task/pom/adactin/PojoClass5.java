package org.task.pom.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass5 extends BaseClass{
	public PojoClass5() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "order_no")
	private WebElement id;
	
	@FindBy (id = "search_hotel")
	private WebElement search;

	public WebElement getId() {
		return id;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}
