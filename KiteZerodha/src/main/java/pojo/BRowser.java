package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BRowser {
	public static WebDriver OpenBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		return driver;
	
		}
	public static WebDriver OpenBrowser1(){
		System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://kite.zerodha.com/dashboard");
		//return driver;
		return driver1;
	}

}
