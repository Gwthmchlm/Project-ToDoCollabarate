package org.task.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass4 extends BaseClass {
	public PojoClass4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "first_name")
	private WebElement firstname;
	
	@FindBy (id = "last_name")
	private WebElement lastname;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement cc;
	
	@FindBy (id = "cc_type")
	private WebElement cardtype;
	
	@FindBy (id = "cc_exp_month")
	private WebElement expmon;
	
	@FindBy (id = "cc_exp_year")
	private WebElement expyr;
	
	@FindBy (id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy (id = "book_now")
	private WebElement book;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
}
