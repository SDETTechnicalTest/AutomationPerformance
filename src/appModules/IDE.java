package appModules;

import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.BaseClass;

import org.openqa.selenium.chrome.ChromeDriver;



public class IDE  extends BaseClass{
    public IDE(WebDriver driver){
    	super(driver);
}    
	
//  public static WebDriver driver = null;
//	private WebDriver driver = null;
	private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public static WebDriver setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/mbhathal/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sports.williamhill.com/betting/en-gb");	
      
	    Point targetPosition = new Point(0, 0);
	    driver.manage().window().setPosition(targetPosition);

	    Dimension targetSize = new Dimension(1400, 1000); //your screen resolution here 2560-by-1600
	    driver.manage().window().setSize(targetSize);
		Thread.sleep(4000);
		return driver;
  }

  @Test

  public static WebDriver testWHIDERCJAVAJUNIT() throws Exception {
	  System.out.println("1");
    driver.get("http://sports.williamhill.com/betting/en-gb");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Home".equals(driver.findElement(By.cssSelector("a.c-list__item.c-list__item--active")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Search".equals(driver.findElement(By.cssSelector("#nav-Search > a.c-list__item")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("2");
    driver.findElement(By.cssSelector("#nav-Search > a.c-list__item")).click();
    
    driver.findElement(By.id("search-input")).sendKeys("English Premier League");
  
    for (int second = 0;; second++) {
    
    	if (second >= 60) fail("timeout");
    	try { if ("QUICK LINKS (2)".equals(driver.findElement(By.xpath("//*[@id='search-overlay']/div/div[2]/div[1]/span")).getText())) break; } catch (Exception e) {}
    	       
    	Thread.sleep(1000);
    }
    
    System.out.println("3");
    driver.findElement(By.cssSelector("i.search-quick-links__icon.contextual-nav__link-img")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("90 Minutes".equals(driver.findElement(By.cssSelector("p.group-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("4");
    driver.findElement(By.cssSelector("div.btmarket__link-name > span")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("90 Minutes".equals(driver.findElement(By.cssSelector("h2.fl")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("5");
    driver.findElement(By.xpath("//div/div/div/div/button")).click();
    
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("(1 Selection)".equals(driver.findElement(By.id("betslip-title-selection")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("6");
    driver.findElement(By.xpath("//div[2]/span/input")).click();

    System.out.println("6a");
    driver.findElement(By.xpath("//div[2]/span/input")).clear();

    System.out.println("6b");
    
   //CharSequence iBet = "1.00";
   DecimalFormat dec = new DecimalFormat("#.00");
   Double rBet = ((Math.random() * 900) + 100) / 100.0;
   Double iBet = Double.valueOf(dec.format(rBet));
   String sBet = String.valueOf(iBet);

   
	// driver.findElement(By.xpath("//div[2]/span/input")).sendKeys("0.05");
    driver.findElement(By.xpath("//div[2]/span/input")).sendKeys(sBet);
    System.out.println(sBet);
    String fff = driver.findElement(By.xpath("//div[8]/div/div[2]/span[2]")).getText();
    System.out.println(fff);
    System.out.println("6c");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (sBet.equals(driver.findElement(By.xpath("//div[8]/div/div[2]/span[2]")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    String returns = driver.findElement(By.xpath("//span[3]/span")).getText();
    System.out.println(returns);
    String odds = driver.findElement(By.xpath("//div/div[2]/div/div/div/div/span[2]")).getText();
    System.out.println(odds);
   
    
    System.out.println("7");
    driver.findElement(By.id("clear-slip-link")).click();
    System.out.println("8");
    driver.findElement(By.cssSelector("img.header__logo")).click();
	return driver;

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
