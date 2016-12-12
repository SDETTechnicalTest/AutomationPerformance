package utility;

import static org.junit.Assert.fail;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.BaseClass;

public class Utils extends BaseClass {
	
	//public static WebDriver driver = null;
    public Utils(WebDriver driver){
    	super(driver);
}    
	public static WebDriver OpenBrowser(String sBrowserName) throws Exception{
	
		try{
			
		if(sBrowserName.equals("Mozilla")){
			driver = new FirefoxDriver();
			Log.info("New driver instantiated");
		
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Log.info("Implicit wait applied on the driver for 10 seconds");
		    driver.get(Constant.URL);
		    
		    Point targetPosition = new Point(0, 0);
		    driver.manage().window().setPosition(targetPosition);

		    Dimension targetSize = new Dimension(1400, 1000); //your screen resolution here
		    driver.manage().window().setSize(targetSize);
		    
		    Log.info("Web application launched successfully");
			}
		else 
			if (sBrowserName.equals("Chrome")){
				
				System.setProperty("webdriver.chrome.driver", "/Users/mbhathal/Downloads/chromedriver");
				driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("http://sports.williamhill.com/betting/en-gb");	
		        
			    Point targetPosition = new Point(0, 0);
			    driver.manage().window().setPosition(targetPosition);

			    Dimension targetSize = new Dimension(1400, 1000); //your screen resolution here 2560-by-1600
			    driver.manage().window().setSize(targetSize);
				Thread.sleep(4000);
	
		    Log.info("Web application launched successfully");
		    System.out.println("OpenBrowser Successfull");
			}
		
		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
		 	  
	public static WebDriver closeDownBrowser() throws Exception{
	
	    driver.quit();
		return driver;
	}
	
}
