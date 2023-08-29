package Base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;


import Utils.Utilities;

public class BaseClass {


    public WebDriver driver;
    public Properties prop;

    public BaseClass() {

	prop = new Properties();
	File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigFile\\Configuration.properties");

	try {
	    FileInputStream fis = new FileInputStream(propFile);
	    prop.load(fis);
	}
	catch(Throwable e) {
	    e.printStackTrace();
	}
    }

    public WebDriver initializeBrowser(String browser) {

	if(browser.equalsIgnoreCase("chrome")) {
	    driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
	    driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")){
	    driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("safari")) {
	    driver = new SafariDriver();
	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_WAIT_TIME));
	driver.get(prop.getProperty("URL"));

	return driver;
    }

}
