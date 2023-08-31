package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.ModalPage;

public class ModalTest extends BaseClass {

    WebDriver driver;
    HomePage Hpage;
    ModalPage Mpage;
    
   
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
    public void modaltest() throws InterruptedException {
	
	Mpage = Hpage.clickmodalPage();
	
	if(Mpage.verifyHeading()) {
	    
	    Mpage.clickbutton();
	    Thread.sleep(1000);
	    if(Mpage.verifymodaltitle()) {
		
	    Mpage.handleModelAlert();
	    
	    }
	}
    }
    
}
