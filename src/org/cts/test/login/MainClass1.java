package org.cts.test.login;

public class MainClass1 extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	url("https://www.facebook.com/");
	title();
	LoginPojoClass l = new LoginPojoClass();
	User(l.getUser(), "9715465054");
	User(l.getPass(), "MyvizhiGowtham");
	clk(l.getLogin());
}
}
