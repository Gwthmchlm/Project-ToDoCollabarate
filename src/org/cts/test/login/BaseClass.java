package org.cts.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.seleniumhq.jetty9.server.Authentication.User;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse workspace\\SeleniumFirst\\driver\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	ChromeOptions o = c.addArguments("--disable-notifications");
	driver = new ChromeDriver(o);
}
public static void url(String url) {
	driver.get(url);
}
public static void title() {
	driver.getTitle();
}
public static void cUrl() {
	driver.getCurrentUrl();
}
public static void User(WebElement e, String id ) {
	e.sendKeys(id);
}
public static void clk(WebElement e)  {
	
	e.click();
}
public static void sBV(WebElement e, String text) {
	Select s = new Select(e);
	s.selectByVisibleText(text);

}
	
}

