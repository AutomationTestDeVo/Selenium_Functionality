package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;


public class HomePage{

    WebDriver driver;
    ElementUtils element;
    
    public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
	
    }
    
    @FindBy(linkText="Autocomplete")
    private WebElement autocomplete;
    
    @FindBy(linkText="Buttons")
    private WebElement buttons;
    
    @FindBy(linkText="Checkbox")
    private WebElement checkbox;
    
    @FindBy(linkText="Datepicker")
    private WebElement datepicket;
    
    
    public AutoCompletePage clickAutoComplete() {
	element.clickOnElement(autocomplete, element.EXPLICIT_WAIT_BASIC_TIME);
	return new AutoCompletePage(driver);
    }
    
    public ButtonsPage clickButtons() {
	element.clickOnElement(buttons, element.EXPLICIT_WAIT_BASIC_TIME);
	return new ButtonsPage(driver);
    }
    
    public CheckBoxPages clickCheckBox() {
	element.clickOnElement(checkbox, element.EXPLICIT_WAIT_BASIC_TIME);
	return new CheckBoxPages(driver);
    }
    
}
