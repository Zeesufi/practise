package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZerodhaPinPage {
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@href='/forgot']")private WebElement forgot;
	
	 public ZerodhaPinPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	 public void Enterpin(String p,WebDriver driver){
		 FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		 wait.withTimeout(Duration.ofMillis(5000));
		 wait.pollingEvery(Duration.ofMillis(500));
		 wait.ignoring(Exception.class);
		 wait.until(ExpectedConditions.visibilityOf(pin));
		 pin.sendKeys(p);
	 }
	 public void ClickonCOntinue() {
		 login.click();
	 }
	 public void ClickForgot() {
		 forgot.click();
	 }
	 
}
