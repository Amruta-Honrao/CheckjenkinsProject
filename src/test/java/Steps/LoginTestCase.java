package Steps;
import org.testng.Assert;

import PageObjects.BrowserFact;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;




public class LoginTestCase {
	
	LoginPage lp = new LoginPage(BrowserFact.getdr());
	
	@Given("I m on login page")
		public void i_m_on_login_page() throws InterruptedException {
	
		System.out.println("I am on login page"); 
		Thread.sleep(3000);
		Assert.assertTrue(lp.dologin());
		
			  
	}

}
