package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class PageScrollPage {

    
    WebDriver driver;
    ElementUtils element;
    
    public PageScrollPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
    }
    
    @FindBy(xpath="//div[@class='container']/nav/following-sibling :: h1")
    private WebElement headingText;
    
    @FindBy(xpath="//input[@id='name']")
    private WebElement fullname;
    
    @FindBy(xpath="//input[@id='date']")
    private WebElement date;
    
    
    public boolean verifyheading() {
	
	String actualmsg = element.getTextFromElement(headingText, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaymsg = actualmsg.contains("Large page content");
	return displaymsg;
    }
    
    public void entername(String name) {
	element.jsScrollTillElement(fullname, element.EXPLICIT_WAIT_BASIC_TIME);
//	element.jsScrollToLast();
	element.typeTextIntoElement(fullname, name, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    public void enterdate(String enterdate) {
	element.jsScrollTillElement(date, element.EXPLICIT_WAIT_BASIC_TIME);
	element.typeTextIntoElement(date, enterdate, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    
}
