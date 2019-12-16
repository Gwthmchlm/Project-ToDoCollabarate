package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	url("https://www.facebook.com/");
	title();
	cUrl();
//	WebElement username = driver.findElement(By.id("email"));
//	User(username, "9715465054");
//	WebElement password = driver.findElement(By.id("pass"));
//	User(password, "MyvizhiGowtham");
//	WebElement login = driver.findElement(By.id("loginbutton"));
//	clk(login);
//	WebElement out = driver.findElement(By.id("userNavigationLabel"));
//	clk(out);
//	WebElement log = driver.findElement(By.className("_54ni navSubmenu _6398 _64kz __MenuItem"));
//	clk(log);
	
	// DropDown 
	WebElement date = driver.findElement(By.id("day"));
	sBV(date, "23");
	
	
}
}
