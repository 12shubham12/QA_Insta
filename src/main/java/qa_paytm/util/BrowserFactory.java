package qa_paytm.util;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public WebDriver driver;
	public Properties prop;
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL){
		
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		else{
			System.out.println("We do not support this browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}

}
