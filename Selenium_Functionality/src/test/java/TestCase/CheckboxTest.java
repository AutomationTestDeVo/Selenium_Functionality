package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Element.ElementUtils;
import Pages.CheckBoxPages;
import Pages.HomePage;

public class CheckboxTest extends BaseClass {

    WebDriver driver;
    ElementUtils element;
    HomePage Hpage;
    CheckBoxPages CBpage;
    
    @BeforeMethod
    public void setup() {
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
    }
    
    @AfterMethod
    public void teardown() {
	driver.quit();
    }
    
    @Test
    public void Checkbox() {
	
	CBpage = Hpage.clickCheckBox();
	if(CBpage.verifyCheckbox()) {
	    
	    CBpage.clickAllcheckbox();
	}
    }
}
