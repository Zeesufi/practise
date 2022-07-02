package Test1loginpage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Buy;
import POM.Dashboard;
import POM.Recent;
import POM.ZerodhaPinPage;
import POM.Zerodhaloginpage;
import Utility.parametrization;
import pojo.BRowser;

public class loginpagetest {
	WebDriver driver;
	//WebDriver driver1;
	@BeforeTest
	public void brow() {
		driver=BRowser.OpenBrowser();
		//driver1=BRowser.OpenBrowser1();
	}
	
	
	@Test()
	public void test1() throws IOException, InterruptedException {
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		String b=parametrization.values("a",0,1);
		zerodhaloginpage.EnterUserId(b);
		String c =parametrization.values("a",1,1);
		zerodhaloginpage.Enterpass(c);
		zerodhaloginpage.ClickonLogin();
		ZerodhaPinPage zerodhapinpage= new ZerodhaPinPage(driver);
	   String d = parametrization.values("b",0,1);
	    System.out.println(d);
		//Thread.sleep(2000);
		zerodhapinpage.Enterpin(d, driver);
		zerodhapinpage.ClickonCOntinue();
		//Thread.sleep(2000);
	//	Dashboard dashboard= new Dashboard(driver);
	//	dashboard.clickonsearchbox("tata");
	//	dashboard.movetoelement(driver);
	//	dashboard.clickonbuy();
		
		
	}
	@Test(dependsOnMethods= {"test1"},enabled=false)
      public void test2() throws InterruptedException{
		Dashboard dashboard= new Dashboard(driver);
		dashboard.clickonsearchbox("tata");
		dashboard.movetoelement(driver);
		dashboard.clickonbuy();
		//Thread.sleep(2000);
		
		
	}
	@Test(dependsOnMethods= {"test2"},enabled=false)
	public void test3() {
		Buy buy = new Buy(driver);
		buy.ClickonRegular();
		buy.ClickonMarket();
		buy.ClickonQty("5");
		buy.Clickonbuy();
	}
	@Test(dependsOnMethods= {"test1"})
	public void test4()  {
		Recent recent = new Recent(driver);
		recent.searchelement(driver);
		
	}
@Test
public void asserttest() {
	Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
	zerodhaloginpage.ClickonLogin();
	String text=zerodhaloginpage.getErrorText(driver);
	String expectedtext="=User ID should be minimum 6 character";
	Assert.assertEquals(text,expectedtext);
	
}
@Test
public void test5() {
	System.out.println("i have tried it");
}
	//khan has tried a lot for maven project
}
	


