package org.task1.base.pom;

public class Main extends Base {
	
public static void main(String[] args) {
	luanchBrowser();
	url("https://www.adactin.com/HotelApp/");
	title();
	currentUrl();
	Pojo1 p1 = new Pojo1();
	clk(p1.getNewuser());
	fill(p1.getUser(), "GowthamKalyana");
	fill(p1.getPass(), "Gowtham1194");
	fill(p1.getConfirm(), "Gowtham1194");
	fill(p1.getName(), "Gowtham");
	fill(p1.getEmail(), "gowthamengineer2015@gmail.com");
	clk(p1.getLogin());
	clk(p1.getSubmit());
	
}
}
