package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	public static WebDriver getChromeDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
}
