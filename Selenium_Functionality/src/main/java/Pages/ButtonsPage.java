package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Element.ElementUtils;

public class ButtonsPage {

    WebDriver driver;
    public ElementUtils element;
    
    public ButtonsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	element = new ElementUtils(driver);
	
    }
    
    @FindBy(xpath="//button[@class='btn btn-lg btn-primary']")
    private WebElement primary;
    
    @FindBy(xpath="//button[@class='btn btn-lg btn-danger']")
    private WebElement danger;
    
    @FindBy(xpath="//button[@id='btnGroupDrop1']")
    private WebElement buttonfordropdown;
    
    
    
    public void clickPrimaryKey() {
	element.mouseHoverAndClick(primary, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    public void clickDangerkey() {
	element.clickOnElement(danger, element.EXPLICIT_WAIT_BASIC_TIME);
    }
    
    public void selectThedropdown(String option) {
	
	element.clickOnElement(buttonfordropdown, element.EXPLICIT_WAIT_BASIC_TIME);
	
	List<WebElement> optionlist = driver.findElements(By.xpath("//div[@class='dropdown-menu show']"));
	for(WebElement ele:optionlist) {
	    
	    String req = ele.getText();
	    if(req.contains(option)) {
		ele.click();
		break;
	    }
	}
    }
    
    
}
