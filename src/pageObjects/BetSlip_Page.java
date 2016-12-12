package pageObjects;



import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

    

public class BetSlip_Page extends BaseClass{
            private static WebElement element = null;
         
           
        public BetSlip_Page(WebDriver driver){
            	super(driver);
        }    
        
 
        public static WebElement place_bet () throws Exception{
            try{ 
            	
            	  element = driver.findElement(By.xpath("//div[2]/span/input"));
                  element = driver.findElement(By.xpath("//div[2]/span/input"));

            	   
            	   DecimalFormat dec = new DecimalFormat("#.00");
            	   Double rBet = ((Math.random() * 900) + 100) / 100.0;
            	   Double iBet = Double.valueOf(dec.format(rBet));
            	   String sBet = String.valueOf(iBet);;
            	   
            	   driver.findElement(By.xpath("//div[2]/span/input")).sendKeys(sBet);;

            	   String returns = driver.findElement(By.xpath("//span[3]/span")).getText();
            	    String odds = driver.findElement(By.xpath("//div/div[2]/div/div/div/div/span[2]")).getText();
           
            	    System.out.println("For an inital bet of £" + sBet + " Amount Returned could be £" + returns +" at odds of " + odds);
            	     
	             Log.info("Search Box is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search Box link is not found on the Home Page");
           		throw(e);
           		}
  
           	return element;
        }
 
        
        public static WebElement clear_betslip () throws Exception{
            try{ 
                System.out.println("7");
                element = driver.findElement(By.id("clear-slip-link"));
              //  System.out.println("8");
              //  element = driver.findElement(By.cssSelector("img.header__logo"));
                   	     
	             Log.info("Search Box is found on the Home Page");
            }catch (Exception e){
           		Log.error("Search Box link is not found on the Home Page");
           		throw(e);
           		}
  
           	return element;
        }
        
        }
        
