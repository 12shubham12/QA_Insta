package qa_paytm.testcases;


import org.testng.annotations.Test;
import qa_paytm.base.TestBase;
import qa_paytm.pages.HomePage;
import qa_paytm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	public LoginPage loginPage;
	public HomePage homePage;
	
	public LoginPageTest(){
		super();
		loginPage = new LoginPage();
	}

		@Test
		public void loginTest(){
			homePage = loginPage.login(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		}
}
