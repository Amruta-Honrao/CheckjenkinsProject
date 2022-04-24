package Steps;

import java.net.Socket;
import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import PageObjects.BrowserFact;
import PageObjects.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	

	private WebDriver driver;
	
	BrowserFact obj = new BrowserFact ();
	@Before	
	public void launchbrowser()
	{

	driver = obj.init("Chrome");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	System.out.println("Thread ID is  "+Thread.currentThread().getId());
	System.out.println(driver);
	}
	
	@After()
		public void remove() throws InterruptedException {
		//System.out.println(driver);
		System.out.println("Closing the driver" + driver);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(9000));
		Thread.sleep(8000);
		driver.close();
		System.out.println(BrowserFact.TL.get());
		obj.TL.remove();
		//obj.teardown();
		
		System.out.println(BrowserFact.TL.get());
	// driver.close();
		//obj.TL.remove();
		//System.out.println("Thread ID is  "+Thread.currentThread().getId());
		
		
	}
	
	

}
