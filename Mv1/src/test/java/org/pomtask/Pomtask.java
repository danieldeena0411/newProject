package org.pomtask;




import org.openqa.selenium.By;
import org.pojo.classes.LoginPOJO;
import org.smes.Base;

public class Pomtask extends Base {
	
	public static void main(String[] args) {
		 
		browserLaunch();
		maxWindow();
		urlLaunch("http://adactinhotelapp.com/");
		
		LoginPOJO l = new LoginPOJO();
		passTxt("danieldeena",l.getLid() );
		passTxt("Deena0411", l.getPwd());
		click(l.getLgn());
		
		click(l.getLoc());
		
		
		
		dropDownSelectByVisible(driver.findElement(By.name("location")), "Sydney");
		
		
		
		click(l.getHot());
		
		dropDownSelectByVisible(driver.findElement(By.name("hotels")), "Hotel Sunshine");
		
		click(l.getRoom());
		dropDownSelectByVisible(driver.findElement(By.name("room_type")),"Deluxe");
		
		click(l.getRnos());
		dropDownSelectByVisible(driver.findElement(By.name("room_nos")), "2 - Two");
		
		click(l.getDtpk());
		passTxt("19/07/2022", l.getDtpk());
		
		click(l.getDtpko());
		passTxt("21/07/2022", l.getDtpko());
		
		click(l.getAdtr());
		dropDownSelectByVisible(driver.findElement(By.name("adult_room")), "2 - Two");
		
		click(l.getCdrm());
		dropDownSelectByVisible(driver.findElement(By.name("child_room")),"2 - Two");
		
		click(l.getFinish());
		
		click(l.getRdb());
		
		click(l.getCntne());
		
		click(l.getFn());
		passTxt("Michael", l.getFn());
		
		click(l.getLn());
		passTxt("Clarke", l.getLn());
		
		click(l.getAdd());
		passTxt("No:10,"
				+ " Warne Street,"
				+ "Melbourne"
				+ ",Australia" , l.getAdd());
		
		click(l.getCcn());
		passNum("1547854258742565", l.getCcn());
		
		click(l.getCct());
		dropDownSelectByVisible(driver.findElement(By.name("cc_type")), "Other");
		
		click(l.getCcm());
		dropDownSelectByVisible(driver.findElement(By.name("cc_exp_month")), "September");
		
		click(l.getCcy());
		dropDownSelectByVisible(driver.findElement(By.name("cc_exp_year")), "2022");
		
		click(l.getCvv());
		passTxt("876", l.getCvv());
		
		click(l.getbNow());
		

		
		
	
	}	
	

}

	