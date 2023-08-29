package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class CheckBoxPages {

    WebDriver driver;
    ElementUtils element;
    
    public CheckBoxPages(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
    }
    
    @FindBy(xpath="//nav[@class='navbar navbar-expand-lg bg-light']/following-sibling::h1")
    private WebElement checkboxinfo;
    
    
    
    public boolean verifyCheckbox() {
	String actualmsg = element.getTextFromElement(checkboxinfo, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaymsg = actualmsg.contains("Checkboxes");
	return displaymsg;
    }
    
    public void clickAllcheckbox() {
	
	List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'checkbox')]"));
	
	for(WebElement ele : check) {
	    element.clickOnElement(ele, element.EXPLICIT_WAIT_BASIC_TIME);
	}
    }
    
    
}
