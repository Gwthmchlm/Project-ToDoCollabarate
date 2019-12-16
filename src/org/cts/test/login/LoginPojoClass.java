package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends BaseClass {
	
public LoginPojoClass() {
	PageFactory.initElements(driver, this);
}
@FindBy (id = "email")  // driver.findelement(by.id(" "));
private WebElement user; // webElement user;

@FindBy (id = "pass")
private WebElement pass;

@FindBy (id = "loginbutton")
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
