package org.task.pom.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {
public PojoClass1() {
	PageFactory.initElements(driver, this);
}

@FindBy (id = "username")
private WebElement user;

@FindBy (id = "password")
private WebElement pass;

@FindBy (id = "login")
private WebElement login;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLogin() {
	return login;
}



}
