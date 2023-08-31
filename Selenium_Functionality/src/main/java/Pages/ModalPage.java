package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;


public class ModalPage {

    public WebDriver driver;
    ElementUtils element;
    
    public ModalPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
    }
    
    @FindBy(xpath="//nav[@class='navbar navbar-expand-lg bg-light']/following-sibling :: h1")
    private WebElement modalheading;
    
    @FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),\"Open modal\")]")
    private WebElement modalbutton;
    
    @FindBy(xpath="//div[@class='modal-header']/h5")
    private WebElement modalTitle;
    
    @FindBy(xpath="//div[@class='modal-footer']/button[1]")
    private WebElement closebutton;
    
    public boolean verifyHeading() {
	
	String actualmsg = element.getTextFromElement(modalheading, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaymsg = actualmsg.contains("Modal");
	return displaymsg;
    }
    
    public void clickbutton() {
	
	element.clickOnElement(modalbutton, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    public boolean verifymodaltitle() {
	
	String actualmsg = element.getTextFromElement(modalTitle, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaymsg = actualmsg.contains("Modal title");
	return displaymsg;
    }
    public void handleModelAlert() {
	
	element.clickOnElement(closebutton, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    
}
