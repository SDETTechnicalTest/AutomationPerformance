package appModules;
import static org.junit.Assert.fail;

import org.testng.Reporter;

import pageObjects.*;
import utility.Log;

     
     public class Navigate_to_EPL_Action {
 
    	 public static void Execute() throws Exception{
        	
        	// Clicking on the Search link on the Home Page
        	Home_Page.lnk_Search().click();
        	
        	Log.info("Click action is perfromed on Search link" );
        	Home_Page.Search_Page_Verification ();
        	
        	Search_Page.txtbx_Query().sendKeys("English Premier League");
        	
        	Search_Page.Search_Query_Verification ();
        	
        	Search_Page.Select_Returned_Query().click();
        	
        	Log.info("English Premier League is found" );
        	
        	Search_Page.Search_Returned_Query_Verification ();
        
        	Reporter.log("Search Action is successfully perfomred");
        	
        }
    }
