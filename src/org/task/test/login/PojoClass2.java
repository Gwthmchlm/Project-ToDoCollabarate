package org.task.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends BaseClass {
public PojoClass2() {
	PageFactory.initElements(driver, this);
}
@FindBy (id="location")
private WebElement location;

@FindBy (id="hotels")
private WebElement hotels;

@FindBy (id = "room_type")
private WebElement roomTypes;

@FindBy (id="room_nos")
private WebElement rooms;

@FindBy (id = "adult_room")
private WebElement adults;

@FindBy (id="child_room")
private WebElement childs;

@FindBy (id= "Submit")
private WebElement submit;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomTypes() {
	return roomTypes;
}

public WebElement getRooms() {
	return rooms;
}

public WebElement getAdults() {
	return adults;
}

public WebElement getChilds() {
	return childs;
}

public WebElement getSubmit() {
	return submit;
} 


}
