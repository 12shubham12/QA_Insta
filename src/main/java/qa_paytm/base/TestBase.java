package qa_paytm.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import qa_paytm.util.BrowserFactory;
import qa_paytm.util.ConfigDataProvider;
import qa_paytm.util.ExcelDataProvider;

public class TestBase {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider cdp;

/*---------------------------Initializing excel and config -------------------------------------*/
	@BeforeSuite
	public void setUpSuit(){	
		excel = new ExcelDataProvider();
		cdp = new ConfigDataProvider();
	}

/*------------------------------Initializing driver -------------------------------------------*/
	@BeforeClass
	public void setup(){
		driver = BrowserFactory.startApplication(driver, cdp.getBrowser(), cdp.getQAURL());
	}
	
	
	
/*------------------------------Quitting the browser---------------------------------------------*/
	
	@AfterClass
	public void tearDown(){
	//	BrowserFactory.quitBrowser(driver);
	}
}
