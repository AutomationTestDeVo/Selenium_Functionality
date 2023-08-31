package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Element.ElementUtils;
import Pages.HomePage;
import Pages.datePickerPage;


public class DatePickerTest extends BaseClass {

    WebDriver driver;
    ElementUtils element;
    HomePage Hpage;
    datePickerPage DPpage;
    
    @BeforeMethod
    public void setup() {
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
    }
    

    @AfterMethod
    public void teardown(){
	driver.quit();
    }
    
    @Test
    public void datepicking() {
	
	DPpage = Hpage.clickdatepicker();
	if(DPpage.verifydatepick()) {
	    
	}
    }
}
