package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.ButtonsPage;
import Pages.HomePage;

public class ButtonsTest extends BaseClass {

    public ButtonsTest() {
	super();
    }
    
    HomePage Hpage;
    ButtonsPage Bpage;
    
    @AfterMethod
    public void tearDown() {
	driver.quit();
    }
    
    @BeforeMethod
    public void setup() {
	
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
    }
    
    @Test
    public void Buttons() {
	
	Bpage = Hpage.clickButtons();
	Bpage.clickPrimaryKey();
	Bpage.clickDangerkey();
	Bpage.selectThedropdown("Dropdown link 1");
    }
    
    
}
