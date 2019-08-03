package tests;

import driver.WebDriverFactory;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected WebDriver driver = WebDriverFactory.getChromeDriver();

    @After
    public void teardown() {
        driver.close();
    }
}
