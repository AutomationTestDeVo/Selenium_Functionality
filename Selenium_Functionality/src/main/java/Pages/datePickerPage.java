package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class datePickerPage {
    
    WebDriver driver;
    ElementUtils element;
    
    public datePickerPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
    }
    
    @FindBy(xpath="//nav[@class='navbar navbar-expand-lg bg-light']/following-sibling::h1")
    private WebElement datepickinfo;
  
    @FindBy(xpath="//input[@id='datepicker']")
    private WebElement datepicker;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[2]/th[3]")
    private WebElement previousKey;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]")
    private WebElement Nextkey;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")
    private WebElement monthYr;
    
    
    /*
     * 
     * //td[contains(text(),'23')] 
     * xpath for date.
     */
    
    
    public boolean verifydatepick() {
	
	String actualmsg = element.getTextFromElement(datepickinfo, element.EXPLICIT_WAIT_BASIC_TIME);
	boolean displaymsg = actualmsg.contains("Datepicker");
	return displaymsg;
    }
    
    public void selectSpecificdate() {
	
	element.clickOnElement(datepicker, element.EXPLICIT_WAIT_BASIC_TIME);
	
	while(true) {
	    
	    
	}
	
    }

}
