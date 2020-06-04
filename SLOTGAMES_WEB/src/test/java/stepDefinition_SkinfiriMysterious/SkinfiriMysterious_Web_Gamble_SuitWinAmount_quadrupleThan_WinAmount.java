package stepDefinition_SkinfiriMysterious;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Web_Gamble_SuitWinAmount_quadrupleThan_WinAmount {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_game_balance_spin_button_win_amount_Suit_win_dice_options_gamble_amount_and_suit_to_win_amount() throws Throwable {
	   
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Skinfiri Mysterious slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount$")
	public void open_the_Skinfiri_Mysterious_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Skinfiri_Mysterious_slot_game_click_on_spin_button_till_player_wins_click_on_suit_win_dice_button_and_check_the_suit_to_win_amount() throws Throwable {
	   
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Skinfiri_Mysterious/Bet_place.PNG", 10);
		//	Thread.sleep(15000);
		
		
		
		Pattern SPIN=new Pattern("./Images/Skinfiri_Mysterious/Spin.PNG");
		//	Pattern collect=new Pattern("./Images/10Spins/collect_image.PNG");
		Pattern BALANCE=new Pattern("./Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern EYE=new Pattern("./Images/Skinfiri_Mysterious/EYE.PNG");
		Pattern SKULL=new Pattern("./Images/Skinfiri_Mysterious/SKULL.PNG");
		Pattern CROW=new Pattern("./Images/Skinfiri_Mysterious/CROW.PNG");
		
		Pattern DENO_4=new Pattern("./Images/Skinfiri_Mysterious/betvalue1_5.PNG");
		Pattern WIN_AMT=new Pattern("./Images/Skinfiri_Mysterious/win_amt_8.PNG");
	
		Pattern GAMBLE_BTN=new Pattern("./Images/Skinfiri_Mysterious/gamble_icon.PNG");
		Pattern SUIT_WIN=new Pattern("./Images/Skinfiri_Mysterious/suit_winamt_display.PNG");
		Pattern GAMBLE_COLLECT=new Pattern("./Images/Skinfiri_Mysterious/collect_image_gamble.PNG");
		
		
		
		//comparing the balance before Win
	    //  Pattern balance=new Pattern("E:/Sikuli Images/gamble/balance_beforeWin.PNG");
		
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(BALANCE);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("Balance comparision before spin completed successfully. Balance is 300 YSI");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 97);
		
		  
		  
		// WIN PATTERN COMBINATION 

			screen.click(EYE);
			Thread.sleep(2000);
			screen.click(SKULL);
			Thread.sleep(2000);
			screen.click(CROW);
			Thread.sleep(2000);


			//Selecting denominations as 4
			screen.click(DENO_4);
			Thread.sleep(2000);
			//Clicking on Spin button
			screen.click(SPIN);
			Thread.sleep(5000);
			
			
			
			//comparing the win amount should exists after spin
			//   Pattern winA=new Pattern("E:/Sikuli Images/gamble/win.PNG");

			Finder finder2 =new Finder(screen.capture().getImage());
			String ht2 = finder2.find(WIN_AMT);
			double score2=20;                
			System.out.println("the value of ht2"+" "+ht2);
			if(finder2.hasNext())
			{
				Match m2=finder2.next();
				System.out.println("Match Found with: "+(m2.getScore())*100+"%");
				score2=(m2.getScore())*100;
				System.out.println("Win amount comparision completed successfully. Win amount is 8 YSI");
				finder2.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
			Assert.assertTrue(score2 > 97);
			Thread.sleep(5000);
			

			//Clicking on gamble button
			screen.click(GAMBLE_BTN);
			Thread.sleep(2000);
			
			
			 //comparing the Color win amount should be double than as win amount
			  
		   //   Pattern winB=new Pattern("E:/Sikuli Images/gamble/Colorwin.PNG");
		      Finder finder3 =new Finder(screen.capture().getImage());
		      String ht3 = finder3.find(SUIT_WIN);
		      double score3=20;                
		      System.out.println("the value of ht2"+" "+ht3);
			  if(finder3.hasNext())
			  {
			  Match m3=finder3.next();
			  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			  score3=(m3.getScore())*100;
			  System.out.println("Suit Win amount comparision completed successfully. Gamble Suit Win amount is 32.00 YSI");
			  finder3.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Suit Win amount comparision value equals to: "+" "+score3 +"%");
			  Assert.assertTrue(score3 > 97);
			  Thread.sleep(3000);
			  
			  screen.click(GAMBLE_COLLECT);
	}

	@Then("^suit To Win amount should be quadruple than win amount in the gamble page of the Skinfiri Mysterious game$")
	public void suit_To_Win_amount_should_be_quadruple_than_win_amount_in_the_gamble_page_of_the_Skinfiri_Mysterious_game() throws Throwable {
	   
		Thread.sleep(3000);
		 driver.quit();
	}
}
