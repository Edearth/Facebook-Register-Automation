import data.MockUpTestReader;
import data.RegistrationGender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import data.RegisterData;
import pages.MainPage;
import tests.BaseTest;

public class RegisterTest extends BaseTest {

	private RegisterData data;

	@Before
	public void setup() {
		 data = MockUpTestReader.getRegisterData();
	}

	@Test
	public void registerFemaleTest() {
		MainPage mainPage = new MainPage(driver);
		mainPage.loadPage();
		
		mainPage.enterFirstName(data.getName());
		mainPage.enterLastName(data.getLastname());
		
		mainPage.enterMailOrPhone(data.getPhoneNumber());
		
		mainPage.enterPassword(data.getPassword());
		
		mainPage.enterBirthDate(data.getBirthDay(),
				data.getBirthMonth(), data.getBirthYear());
		
		if(data.getGender() == RegistrationGender.MALE) {
			mainPage.selectMaleGender();
		} else if (data.getGender() == RegistrationGender.FEMALE) {
			mainPage.selectFemaleGender();
		} else {
			mainPage.selectPersonalizedGender();
			mainPage.selectPersonalizedGenderPronoun("2");
			mainPage.enterPersonalizedGenderText("xe");
		}
		
		mainPage.clickContinueButton();

	}
	
}
