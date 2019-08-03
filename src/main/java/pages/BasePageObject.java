package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePageObject {

	protected WebDriver driver;
	
	public BasePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void click(By element) {
		driver.findElement(element).click();
	}
	
	protected void fillText(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	protected void selectOption(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	protected void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.dismiss();
	}
	
}
