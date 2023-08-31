package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class DropdownPage {

    WebDriver driver;
    ElementUtils element;
    
    public DropdownPage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
	
    }
    
    
    @FindBy(xpath="//div[@class='container']/nav//following-sibling :: h1")
    private WebElement dropdownheading;
    
    @FindBy(xpath="//div[@class='dropdown']/button")
    private WebElement dropdownButton;
    
    
    public boolean verifyheading() {
	
	String actualMsg =  element.getTextFromElement(dropdownheading, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaytext = actualMsg.contains("Dropdown");
	return displaytext;
    }
    
    public void clickdropdownButton() {
	
	element.clickOnElement(dropdownButton, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    public void selectThetopicToPick(String TopicToClick) {
	
	WebElement pageNav = driver.findElement(By.xpath("//div[@class='dropdown show']//div/a[contains(text(),'"+TopicToClick+"')]"));
	element.clickOnElement(pageNav, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    
    
}
