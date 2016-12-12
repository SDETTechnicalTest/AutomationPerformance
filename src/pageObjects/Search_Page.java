package pageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

    

public class Search_Page extends BaseClass{
            private static WebElement element = null;
           
        public Search_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement txtbx_Query() throws Exception{
            try{ 
            	
                System.out.println("Enter Search");
              
                element = driver.findElement(By.id("search-input"));
              
	             Log.info("Search result is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search result is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }

        
        public static WebElement Select_Returned_Query() throws Exception{
            try{ 
            	
            	 System.out.println("Select Returned Query");
            	 element =  driver.findElement(By.cssSelector("i.search-quick-links__icon.contextual-nav__link-img"));
            	 										   
	             Log.info("Search result is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search result is not found on the Home Page");
           		throw(e);
           		}
         
            return element;
        }
        
        
        public static WebElement Search_Query_Verification () throws Exception{
            
        	System.out.println("verifcation start");
             
            for (int second = 0;; second++) {
                
            	if (second >= 60) fail("timeout");
            	try { if ("QUICK LINKS (2)".equals(driver.findElement(By.xpath("//*[@id='search-overlay']/div/div[2]/div[1]/span")).getText())) break; } catch (Exception e) {}
            	       
            	Thread.sleep(1000);
            	
           }
        System.out.println("verifcation end");
		return element;

        }        

        
        public static WebElement Search_Returned_Query_Verification () throws Exception{
            
        	System.out.println("verifcation start");
             
        	   for (int second = 0;; second++) {
        	    	if (second >= 60) fail("timeout");
        	    	try { if ("90 Minutes".equals(driver.findElement(By.cssSelector("p.group-title")).getText())) break; } catch (Exception e) {}
        	    	Thread.sleep(1000);
             	
           }
        System.out.println("verifcation end");
		return element;

        }       
	}
        
