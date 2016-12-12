package pageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
    

public class EPL_Page extends BaseClass{
            private static WebElement element = null;
           
        public EPL_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement Select_Game() throws Exception{
            try{ 
       
            	System.out.println("Select Game");
            	element = driver.findElement(By.cssSelector("div.btmarket__link-name > span"));
            											
	             Log.info("Search result is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search result is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }

        
        public static WebElement Add_Game_BetSlip () throws Exception{
            try{ 
       
            	System.out.println("Add Game BetSlip");
            	
            	element =  driver.findElement(By.xpath("//div/div/div/div/button"));
                              
	             Log.info("Search result is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search result is not found on the Home Page");
           		throw(e);
           		}
            
           
           	return element;
        }
   
        
        public static WebElement Select_Game_Verification () throws Exception{
            
        	System.out.println("verifcation start");
             
            for (int second = 0;; second++) {
            	if (second >= 60) fail("timeout");
            	try { if ("90 Minutes".equals(driver.findElement(By.cssSelector("h2.fl")).getText())) break; } catch (Exception e) {}
            	Thread.sleep(1000);
             	
           }
        System.out.println("verifcation end");
		return element;

        }       
        
        public static WebElement Add_Game_To_BetSlip_Verification () throws Exception{
            
        	System.out.println("verifcation start");
             
            for (int second = 0;; second++) {
            	if (second >= 60) fail("timeout");
            	try { if ("(1 Selection)".equals(driver.findElement(By.id("betslip-title-selection")).getText())) break; } catch (Exception e) {}
            	Thread.sleep(1000);
             	
           }
        System.out.println("verifcation end");
		return element;

        }       
 
        
        
	}
        
