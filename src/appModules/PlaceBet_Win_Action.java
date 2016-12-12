package appModules;
import static org.junit.Assert.fail;

import org.testng.Reporter;

import pageObjects.*;

     
     public class PlaceBet_Win_Action {
 
    	 public static void Execute() throws Exception{
    
        	EPL_Page.Select_Game().click();
        	EPL_Page.Select_Game_Verification();
        	EPL_Page.Add_Game_BetSlip().click();
        	EPL_Page.Add_Game_To_BetSlip_Verification ();
        	
        	BetSlip_Page.place_bet ().click();
        	
        	Reporter.log("Search Action is successfully perfomred");
        	
        	utility.Utils.closeDownBrowser();
        	
        }
    }
