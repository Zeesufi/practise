package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotuserid_password {
	@FindBy(xpath="//label[@for='radio-30']")private WebElement radio1;
	@FindBy(xpath="//label[@for='radio-31']")private WebElement radio2;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement Pan;
	@FindBy(xpath="//label[@for='radio-35']")private WebElement radio3;
	@FindBy(xpath="//label[@for='radio-36']")private WebElement radio4;
	@FindBy(xpath="//input[@placeholder='Mobile number (as on account)']")private WebElement mob;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	
	public Forgotuserid_password(WebElement driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickRadoi1() {
		radio1.click();
	}
	public void ClickRadio2() {
		radio2.click();
	}
	public void EnterUserId(String a) {
		userid.sendKeys(a);
	}
	public void EnterPan(String b) {
		Pan.sendKeys(b);
	}
	public void ClickRadio3() {
		radio3.click();
	}
	public void ClickRadio4() {
		radio4.click();
	}
	public void Entermob(String c) {
		mob.sendKeys(c);
	}
	public void ClickonSubmit() {
		submit.click();
	}
}
