package Utility;
import pojo.BRowser;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebElement driver;
	public void photo() throws IOException {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\code save\\KiteZerodha\\src\\main\\resources\\Screenshot");
    FileHandler.copy(source, destination);
}
}
