package qa_paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa_paytm.base.TestBase;

public class LoginPage extends TestBase{

/*------------------------------below constructor will initialize the webelements-----------------------*/
	public LoginPage(){
		
		PageFactory.initElements(driver,this);
	}

/*----------------------------------Element Locators (Object Repository)--------------------------------*/
	@FindBy(id="email") WebElement uName;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;

	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pw){
		uName.sendKeys(un);
		pwd.sendKeys(pw);
		submit.click();
		return new HomePage();
	}

}
