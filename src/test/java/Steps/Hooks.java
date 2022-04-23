package Steps;

import org.openqa.selenium.WebDriver;

import PageObjects.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	//private BrowserFactory  obj;
	private WebDriver driver;
	
	BrowserFactory obj = new BrowserFactory ();
	@Before
	
	public void launchbrowser()
	{

	driver = obj.init("Chrome");
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	System.out.println("Thread ID is  "+Thread.currentThread().getId());
	System.out.println(obj.TL.get());
		
	}
	
	@After
		public void remove() {
		//obj.teardown();
		obj.TL.remove();
		System.out.println("Thread ID is  "+Thread.currentThread().getId());
		System.out.println(obj.TL.get());
	}
	
	

}
