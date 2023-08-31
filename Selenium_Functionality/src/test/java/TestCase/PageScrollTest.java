package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.PageScrollPage;

public class PageScrollTest extends BaseClass {

    
    WebDriver driver;
    HomePage Hpage;
    PageScrollPage PCpage;
    
    @BeforeMethod
    public void setup()
    {
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
    }
    
    @AfterMethod
    public void teardown() {
	driver.quit();
    }
    
    @Test
    public void scrolltest() {
	PCpage = Hpage.clickpagescroll();
	if(PCpage.verifyheading()) {
	    PCpage.entername("Apple");
	    PCpage.enterdate("02/12/2023");
	}
    }
}
