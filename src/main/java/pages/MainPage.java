package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePageObject {

	private String pageURL = "http://www.facebook.com";
	private By firstNameField = By.name("firstname");
	private By lastNameField = By.name("lastname");
	private By mailField = By.name("reg_email__");
	private By passwordField = By.name("reg_passwd__");
	private By birthDateDaySelector = By.id("day");
	private By birthDateMonthSelector = By.id("month");
	private By birthDateYearSelector = By.id("year");
	private By genderWomanRadiobox = By.xpath("//input[@name='sex' and @value='1']");
	private By genderManRadiobox = By.xpath("//input[@name='sex' and @value='2']");
	private By genderPersonalizedRadiobox = By.xpath("//input[@name='sex' and @value='-1']");
	private By personalizedGenderPronounSelect = By.name("preferred_pronoun");
	private By personalizedGenderField = By.name("custom_gender");
	private By continueButton = By.name("websubmit");
	
	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void loadPage() {
		driver.get(pageURL);
	}
	
	public void enterFirstName(String name) {
		fillText(firstNameField, name);
	}
	
	public void enterLastName(String lastname) {
		fillText(lastNameField, lastname);
	}
	
	public void enterMailOrPhone(String mail) {
		fillText(mailField, mail);
	}
	
	public void enterPassword(String password) {
		fillText(passwordField, password);
	}
	
	public void enterBirthDate(int day, String month, int year) {
		selectOption(birthDateDaySelector, Integer.toString(day));
		selectOption(birthDateMonthSelector, month);
		selectOption(birthDateYearSelector, Integer.toString(year));
	}
	
	public void selectFemaleGender() {
		click(genderWomanRadiobox);
	}
	
	public void selectMaleGender() {
		click(genderManRadiobox);
	}

	public void selectPersonalizedGender() {
		click(genderPersonalizedRadiobox);
	}

	public void selectPersonalizedGenderPronoun(String pronounOption) {
		selectOption(personalizedGenderPronounSelect, pronounOption);
	}

	public void enterPersonalizedGenderText(String gender) {
		fillText(personalizedGenderField, gender);
	}

	public void clickContinueButton() {
		click(continueButton);
	}
}
