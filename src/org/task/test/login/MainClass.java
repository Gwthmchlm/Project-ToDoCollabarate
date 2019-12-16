package org.task.test.login;

public class MainClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBowser();
	url("http://adactin.com/HotelApp/");
	cUrl();
	title();
	// 1st pojo class
	PojoClass1 p = new PojoClass1();
	fill(p.getUser(), "GOWTHAMK");
	fill(p.getPassword(), "S1BO4I");
	clk(p.getLogin());
	
	// 2nd POJO class
	PojoClass2 p1 = new PojoClass2();
	dropDown(p1.getLocation(), "New York");
	dropDown(p1.getHotels(), "Hotel Hervey");
	dropDown(p1.getRoomTypes(), "Deluxe");
	dropDown(p1.getRooms(), "3 - Three");
	dropDown(p1.getAdults(), "2 - Two");
	dropDown(p1.getChilds(), "1 - One");
	clk(p1.getSubmit());
	
	// 3rd POJO class
	PojoClass3 p2 = new PojoClass3();
	clk(p2.getRadiobtn());
	clk(p2.getConti());
	
	// 4th POJO Class
	PojoClass4 p3 = new PojoClass4();
	fill(p3.getFirstname(), "GOWTHAM");
	fill(p3.getLastname(), "K");
	fill(p3.getAddress(), "230 B1 KOMARAPALAYAM 638183");
	fill(p3.getCc(), "1245000045789632" );
	dropDown(p3.getCardtype(), "VISA");
	dropDown(p3.getExpmon(), "February");
	dropDown(p3.getExpyr(), "2022");
	fill(p3.getCvv(), "019");
	clk(p3.getBook());
	Thread.sleep(10000);
	// 5th POJO CLASS
	PojoClass5 p4 = new PojoClass5();
	value(p4.getIdNum());
	
	
	
}
}
