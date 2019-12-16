package org.task.pom.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends BaseClass {
public PojoClass2() {
	PageFactory.initElements(driver, this);
}

@FindBy (id = "location")
private WebElement location;

@FindBy (id = "hotels")
private WebElement hotels;

@FindBy (id = "room_type")
private WebElement room_type;

@FindBy (id = "room_nos")
private WebElement room_nos;

@FindBy(id = "adult_room")
private WebElement adult;

@FindBy(id = "child_room")
private WebElement child_room;

@FindBy(id = "Submit")
private WebElement Submit;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getAdult() {
	return adult;
}

public WebElement getChild_room() {
	return child_room;
}

public WebElement getSubmit() {
	return Submit;
}



}
