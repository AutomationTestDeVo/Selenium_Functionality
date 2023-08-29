package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class AutoCompletePage {


    public WebDriver driver;
    public ElementUtils element;

    public AutoCompletePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
    }

    @FindBy(xpath="//div[@class='container']/nav/following-sibling :: h1")
    private WebElement headingText;

    @FindBy(xpath="//input[@id='autocomplete']")
    private WebElement Address;

    @FindBy(xpath="//input[@id='street_number']")
    private WebElement Street_Address;

    @FindBy(xpath="//input[@id='route']")
    private WebElement Street_Address_2;

    @FindBy(xpath="//input[@id='locality']")
    private WebElement City;

    @FindBy(xpath="//input[@id='administrative_area_level_1']")
    private WebElement State;

    @FindBy(xpath="//input[@id='postal_code']")
    private WebElement Zip_Code;

    @FindBy(xpath="//input[@id='country']")
    private WebElement Country;


    //Action 
    public boolean getTheHeading() {

	String actualMsg = element.getTextFromElement(headingText, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displayStatus = actualMsg.equalsIgnoreCase("Autocomplete");
	return displayStatus;
    }

    public void enterAddress(String address) {
	element.typeTextIntoElement(Address, address, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterStreetAdd(String Street) {
	element.typeTextIntoElement(Street_Address, Street, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterStreetAdd2(String Street) {
	element.typeTextIntoElement(Street_Address_2, Street, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterCity(String city) {
	element.typeTextIntoElement(City, city, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterState(String state) {
	element.typeTextIntoElement(State, state, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterZipCode(String zip) {
	element.typeTextIntoElement(Zip_Code, zip, element.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterCountry(String country) {
	element.typeTextIntoElement(Country, country, element.EXPLICIT_WAIT_BASIC_TIME);
    }
}
