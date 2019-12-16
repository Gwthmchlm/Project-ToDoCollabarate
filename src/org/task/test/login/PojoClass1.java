package org.task.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {
public PojoClass1() {
	PageFactory.initElements(driver, this);
}
@FindBy (id="username")
private WebElement user;

@FindBy (id="password")
private WebElement password;

@FindBy (id = "login")
private WebElement login;

public WebElement getUser() {
	return user;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}


}
