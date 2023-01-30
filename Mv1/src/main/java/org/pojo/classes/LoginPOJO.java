package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.smes.Base;

public class LoginPOJO extends Base{
	
	// 1. Non parametrized  Constructor

	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	
	}
	
	//2. Private WebElements
	@CacheLookup
	@FindBy(id="email")
	private WebElement emailTxt;
	
	@CacheLookup
	@FindBy(name="pass")
	private WebElement passwordTxt;
	
	@CacheLookup
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	@FindBy(id="username")
	private WebElement lid;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement lgn;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id ="hotels")
	private WebElement hot;
	
	@FindBy(id ="room_type")
	private WebElement room;
	
	@FindBy(id = "room_nos")
	private WebElement rnos;
	
	@FindBy(id ="datepick_in")
	private WebElement dtpk;
	
	@FindBy(id="datepick_out")
	private WebElement dtpko;
	
	@FindBy(id="adult_room")
	private WebElement adtr;
	
	@FindBy(id="child_room")
	private WebElement cdrm;
	
	@FindBy(id="Submit")
	private WebElement finish;
	
	@FindBy(id="radiobutton_0")
	private WebElement rdb;

	@FindBy(id ="continue")
	private WebElement cntne;
	
	@FindBy(id ="first_name")
	private WebElement fn;
	
	@FindBy(id ="last_name")
	private WebElement ln;
	
	@FindBy(id ="address")
	private WebElement add;
	
	@FindBy(id ="cc_num")
	private WebElement ccn;
	
	@FindBy(id ="cc_type")
	private WebElement cct;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccm;
	
	@FindBy(id ="cc_exp_year")
	private WebElement ccy;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id ="book_now")
	private WebElement bNow;
	
	@FindBy(id="")
	private WebElement ono;
	@CacheLookup
	@FindBys ({
		
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@id='u_0_5_IF']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']"),
	
		
	})
	

	
	
	private WebElement loginFindBys;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@id='u_0_5_IF']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']")
		
	})
	
	private WebElement loginFindAll;


// 3. Getters to access those private WebElemens outside the class

public WebElement getEmailTxt() {
	return emailTxt;
}

public void setEmailTxt(WebElement emailTxt) {
	this.emailTxt = emailTxt;
}

public void setPasswordTxt(WebElement passwordTxt) {
	this.passwordTxt = passwordTxt;
}

public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

public WebElement getPasswordTxt() {
	return passwordTxt;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

public WebElement getLoginFindBys() {
	return loginFindBys;
}

public void setLoginFindBys(WebElement loginFindBys) {
	this.loginFindBys = loginFindBys;
}

public WebElement getLoginFindAll() {
	return loginFindAll;
}

public void setLoginFindAll(WebElement loginFindAll) {
	this.loginFindAll = loginFindAll;

	
}

public WebElement getLid() {
	return lid;
}

public void setLid(WebElement lid) {
	this.lid = lid;
}

public WebElement getPwd() {
	return pwd;
}

public void setPwd(WebElement pwd) {
	this.pwd = pwd;
}

public WebElement getLgn() {
	return lgn;
}

public void setLgn(WebElement lgn) {
	this.lgn = lgn;
}

public WebElement getLoc() {
	return loc;
}

public void setLoc(WebElement loc) {
	this.loc = loc;
}

public WebElement getHot() {
	return hot;
}

public void setHot(WebElement hot) {
	this.hot = hot;
}

public WebElement getRoom() {
	return room;
}

public void setRoom(WebElement room) {
	this.room = room;
}

public WebElement getRnos() {
	return rnos;
}

public void setRnos(WebElement rnos) {
	this.rnos = rnos;
}

public WebElement getDtpk() {
	return dtpk;
}

public void setDtpk(WebElement dtpk) {
	this.dtpk = dtpk;
}

public WebElement getDtpko() {
	return dtpko;
}

public void setDtpko(WebElement dtpko) {
	this.dtpko = dtpko;
}

public WebElement getAdtr() {
	return adtr;
}

public void setAdtr(WebElement adtr) {
	this.adtr = adtr;
}

public WebElement getCdrm() {
	return cdrm;
}

public void setCdrm(WebElement cdrm) {
	this.cdrm = cdrm;
}

public WebElement getFinish() {
	return finish;
}

public void setFinish(WebElement finish) {
	this.finish = finish;
}

public WebElement getRdb() {
	return rdb;
}

public void setRdb(WebElement rdb) {
	this.rdb = rdb;
}

public WebElement getCntne() {
	return cntne;
}

public void setCntne(WebElement cntne) {
	this.cntne = cntne;
}

public WebElement getFn() {
	return fn;
}

public void setFn(WebElement fn) {
	this.fn = fn;
}

public WebElement getLn() {
	return ln;
}

public void setLn(WebElement ln) {
	this.ln = ln;
}

public WebElement getAdd() {
	return add;
}

public void setAdd(WebElement add) {
	this.add = add;
}

public WebElement getCcn() {
	return ccn;
}

public void setCcn(WebElement ccn) {
	this.ccn = ccn;
}

public WebElement getCct() {
	return cct;
}

public void setCct(WebElement cct) {
	this.cct = cct;
}

public WebElement getCcm() {
	return ccm;
}

public void setCcm(WebElement ccm) {
	this.ccm = ccm;
}

public WebElement getCcy() {
	return ccy;
}

public void setCcy(WebElement ccy) {
	this.ccy = ccy;
}

public WebElement getCvv() {
	return cvv;
}

public void setCvv(WebElement cvv) {
	this.cvv = cvv;
}

public WebElement getbNow() {
	return bNow;
}

public void setbNow(WebElement bNow) {
	this.bNow = bNow;
}

public WebElement getOno() {
	return ono;
}

public void setOno(WebElement ono) {
	this.ono = ono;
}






}

