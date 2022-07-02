package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buy {
	@FindBy(xpath="//label[@for='radio-169']")private WebElement Regular;
	@FindBy(xpath="//label[@for='radio-208']")private WebElement Longterm;
	@FindBy(xpath="//label[@for='radio-166']")private WebElement Market;
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement Qty;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement Price;
	@FindBy(xpath="(//input[@type='number'])[3]")private WebElement Triggerprice;
	@FindBy(xpath="//button[@type='submit']")private WebElement Buy1;
	@FindBy(xpath="//label[@for='radio-182']")private WebElement Limit;
	@FindBy(xpath="//label[@for='radio-184']")private WebElement StopLoss;
	@FindBy(xpath="//label[@for='radio-185']")private WebElement StopLoss_Market;
	
	
	
	public Buy(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
public void ClickonRegular() {
	Regular.click();
}
public void ClickonMarket() {
	Market.click();
}
	public void ClickonQty(String num) {
		Qty.click();
		Qty.clear();
		Qty.sendKeys(num);
	}
	public void Clickonbuy() {
		Buy1.click();
	}
	
	
}
