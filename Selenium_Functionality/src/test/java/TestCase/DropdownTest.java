package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.CheckBoxPages;
import Pages.DropdownPage;
import Pages.HomePage;

public class DropdownTest extends BaseClass {

    
    public DropdownTest() {
	super();
    }
    
    WebDriver driver;
    HomePage Hpage;
    DropdownPage DDpage;
    CheckBoxPages CBpage;
    
    @BeforeMethod
    public void setup() {
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
	CBpage = new CheckBoxPages(driver);
    }
    
    @AfterMethod
    public void teardown() {
	driver.quit();
    }
    
    @Test
    public void testdropDown() throws InterruptedException {
	
	DDpage = Hpage.clickdropdown();
	
	if(DDpage.verifyheading()) {
	    DDpage.clickdropdownButton();
	    Thread.sleep(1000);
	    DDpage.selectThetopicToPick("Checkbox");
	    if(CBpage.verifyCheckbox()) {
		System.out.println("Yes Successfully executed");
	    }else {
		System.out.println("test failed");
	    }
	}
    }
}
