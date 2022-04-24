
package PageObjects; import org.openqa.selenium.WebDriver; import
org.openqa.selenium.chrome.ChromeDriver; import
org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; import lombok.Synchronized;

public class BrowserFactory {

	public static WebDriver BFDriver = null; public static ThreadLocal<WebDriver>
	TL = null;


	public static WebDriver init(String Browser) {

		//TL = new ThreadLocal<WebDriver>();

		if(BFDriver == null) {

		} if(Browser =="Chrome") 
		{ System.out.println("Browser is Chrome!");
		WebDriverManager.chromedriver().setup(); TL.set(new ChromeDriver()); } else
			if(Browser =="FireFox") { WebDriverManager.firefoxdriver().setup();
			System.out.println("Browser is FireFox!"); TL.set(new FirefoxDriver()); }

		WebDriver Driver =getDr(); 
		return Driver;

	}


	public static synchronized WebDriver getDr () 
	{ BFDriver = TL.get(); 
	return
			BFDriver;

	}

	public void teardown() { BFDriver.quit(); TL.remove(); } }
