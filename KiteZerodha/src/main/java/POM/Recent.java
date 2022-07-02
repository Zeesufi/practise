package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recent {
	
	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")private WebElement recentsearchbox;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buy ;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement>element ;
	
	public Recent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickonrecentSearchbox() {
		recentsearchbox.click();
	}
	public void searchelement(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));	
	wait.until(ExpectedConditions.visibilityOfAllElements(element));
	
	int num=element.size();
	System.out.println(num);
for(int i=0;i<=num-1;i++) {
		WebElement search=element.get(i);
		System.out.println(search.getText());
		if(search.getText().equalsIgnoreCase("TATAINVEST")) {
			Actions act =new Actions(driver);
			act.moveToElement(search);
			act.perform();
			//Thread.sleep(2000);

			    buy.click();
			}
			else {
				System.out.println("not found");
			}
		}
	}
	
	
}

