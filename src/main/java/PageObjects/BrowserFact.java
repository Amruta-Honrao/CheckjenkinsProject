
  package PageObjects;
  
   
  import org.openqa.selenium.WebDriver;
  import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.firefox.FirefoxDriver;
  
  import io.github.bonigarcia.wdm.WebDriverManager; import lombok.Synchronized;
  
  public class BrowserFact{
	  
	public static ThreadLocal<WebDriver> TL = new ThreadLocal<>();
	private static WebDriver drive = null;
	
	public static WebDriver init(String Browser)
	{
		if(drive==null)
		{
			if(Browser.equalsIgnoreCase("Chrome"))
			{
				System.out.println("Browser is Chrome!");
				WebDriverManager.chromedriver().setup();
				TL.set(new ChromeDriver());
			}
			if(Browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				TL.set(new FirefoxDriver());
			
			}
			drive =getdr();
		}
		return drive;
	}
	  
	  public static  WebDriver getdr() {
		  drive= TL.get();		  
		return drive;
		  
	  }
  
	  public void teardown() {
		  TL.remove();
		  
	  }
	  
  
  }
   
  
  
 