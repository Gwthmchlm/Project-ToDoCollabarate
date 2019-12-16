package org.task.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
public static void launchBowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse workspace\\SeleniumFirst\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
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

public static void fill(WebElement e, String text) {
	e.sendKeys(text);
}

public static void clk(WebElement e) {
	e.click();
}

public static void dropDown(WebElement e, String text) {
	Select s = new Select(e);
	s.selectByVisibleText(text);
}

public static void value(WebElement e) {
	String idNumber = e.getAttribute("value");
	System.out.println(idNumber);

}

}
