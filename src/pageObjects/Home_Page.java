package pageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

    

public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_Search() throws Exception{
            try{ 
            	
                System.out.println("click search link");
              
                element = driver.findElement(By.cssSelector("#nav-Search > a.c-list__item"));
                
                           
	             Log.info("Search Box is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search Box link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
 
        public static WebElement Search_Page_Verification () throws Exception{
       
        	System.out.println("verifcation start");
             
        for (int second = 0;; second++) {
           	if (second >= 60) fail("timeout");
           	try { if ("".equals(driver.findElement(By.id("search-input")).getText())) break; } catch (Exception e) {}
           	
            Thread.sleep(1000);
           	
           }
        System.out.println("verifcation end");
		return element;

        }        
	}
        
