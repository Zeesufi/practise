package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
@FindBy(xpath="//input[@type='text']")private WebElement Searchbox;
@FindBy(xpath="//span[text()='TATAINVEST']")private WebElement Tata;
@FindBy(xpath="//button[@data-balloon='Buy']")private WebElement buy;
	
	
	
public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void clickonsearchbox(String name) {
	Searchbox.click();
	Searchbox.sendKeys(name);
}
public void movetoelement(WebDriver driver) {
	Actions act = new Actions(driver);
	act.moveToElement(Tata);
	act.perform();
}
public void clickonbuy() {
	buy.click();
}
}
