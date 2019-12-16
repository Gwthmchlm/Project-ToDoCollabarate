package org.task.pom.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass4 extends BaseClass {
public PojoClass4() {
	PageFactory.initElements(driver, this);
}

@FindBy (id = "first_name")
private WebElement name;

@FindBy (id = "last_name")
private WebElement last;

@FindBy (id = "address")
private WebElement address;

@FindBy (id = "cc_num")
private WebElement cc;

@FindBy (id = "cc_type")
private WebElement cctype;

@FindBy (id = "cc_exp_month")
private WebElement month;

@FindBy (id = "cc_exp_year")
private WebElement year;

@FindBy (id = "cc_cvv")
private WebElement cvv;

@FindBy (id = "book_now")
private WebElement book;

public WebElement getName() {
	return name;
}

public WebElement getLast() {
	return last;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCc() {
	return cc;
}

public WebElement getCctype() {
	return cctype;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBook() {
	return book;
}



}
