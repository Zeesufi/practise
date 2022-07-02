package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Zerodhaloginpage {
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@href='/forgot']")private WebElement forgot;
	@FindBy(xpath="(//span[@class='su-message'])[1]")private WebElement usererror;
	
	
	public Zerodhaloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void EnterUserId(String id) {
		userid.sendKeys(id);
	}
	public void Enterpass(String password) {
		pass.sendKeys(password);
	}
	public void ClickonLogin() {
		login.click();
		
	}
	public void ClickonForgot() {
		forgot.click();
	}
	public String getErrorText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
	    wait.until(ExpectedConditions.visibilityOf(usererror));
		String err=usererror.getText();
		return err;
	}
}
