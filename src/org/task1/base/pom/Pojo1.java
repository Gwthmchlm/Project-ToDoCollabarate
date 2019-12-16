package org.task1.base.pom;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends Base {
	public Pojo1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "login_register")
	private WebElement newuser;

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy (id = "re_password")
	private WebElement confirm;
	
	@FindBy (id = "full_name")
	private WebElement name;
	
	@FindBy (id = "email_add")
	private WebElement email;
	
	@FindBy (id = "tnc_box")
	private WebElement login;
	
	@FindBy (id = "Submit")
	private WebElement submit; 
	
	public WebElement getNewuser() {
		return newuser;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	

	

}
