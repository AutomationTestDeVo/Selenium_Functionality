package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Base.BaseClass;
import Pages.AutoCompletePage;
import Pages.HomePage;

public class AutoCompleteTest extends BaseClass  {

    public AutoCompleteTest() {
	super();
    }
    
    WebDriver driver;
    HomePage Hpage;
    AutoCompletePage ACpage;
    Faker faker;
    
    
    @AfterMethod
    public void tearDown() {
	driver.quit();
    }
    
    @BeforeMethod
    public void setUp() {
	
	driver = initializeBrowser(prop.getProperty("browser"));
	Hpage = new HomePage(driver);
	faker = new Faker();
    }
    
    @Test
    public void Autocomplete() {
	ACpage = Hpage.clickAutoComplete();
	
	if(ACpage.getTheHeading()) {
	    ACpage.enterAddress(faker.address().fullAddress());
	    ACpage.enterStreetAdd(faker.address().secondaryAddress());
	    ACpage.enterStreetAdd2(faker.country().capital());
	    ACpage.enterCity(faker.address().city());
	    ACpage.enterState(faker.address().state());
	    ACpage.enterZipCode(faker.address().zipCode());
	    ACpage.enterCountry(faker.country().name());
	}
    }
}
