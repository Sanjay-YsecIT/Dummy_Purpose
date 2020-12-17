package stepDefinition_TropicalForest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TropicalForest_Web_Gamble_WinAmount_AddedTo_Balance_InCredits {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropical Forest slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Tropical_Forest_slot_game_credit_balance_spin_button_credit_win_amount_gamble_button_gamble_amount_in_credits_red_button_black_button_and_gamble_status() throws Throwable {
		this.driver = TropicalForest_URL_Login.getDriver();
	}

	@When("^Open the Tropical Forest slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win$")
	public void open_the_Tropical_Forest_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_in_credits_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropical_Forest/TropicalForest.PNG", 30);

		Pattern spin=new Pattern("Images/Tropical_Forest/spin.PNG");
		Pattern win_credits_1 = new Pattern("Images/Tropical_Forest/win_credits_1.PNG");
		Pattern balance=new Pattern("Images/Tropical_Forest/balance.PNG");
		Pattern balance_credits_1=new Pattern("Images/Tropical_Forest/balance_credits_1.PNG");
		Pattern credit_deductbal=new Pattern("Images/Tropical_Forest/balance_crdeduct_1.PNG");
		Pattern gamble=new Pattern("Images/Tropical_Forest/gamble.PNG");
		Pattern collect=new Pattern("Images/Tropical_Forest/collect.PNG");

		Pattern black=new Pattern("Images/Tropical_Forest/black.PNG");
		Pattern win=new Pattern("Images/Tropical_Forest/win.PNG");
		Pattern lose=new Pattern("Images/Tropical_Forest/lose.PNG");

		Pattern Crpre_gambleamount=new Pattern("Images/Tropical_Forest/Crpre_gambleamount.PNG");
		Pattern Crpost_gambleamount=new Pattern("Images/Tropical_Forest/Crpost_gambleamount.PNG");
		Pattern Crpre_gambletowin=new Pattern("Images/Tropical_Forest/Crpre_gambletowin.PNG");
		Pattern credit_gamble_winbalance=new Pattern("Images/Tropical_Forest/credit_gamble_winbalance.PNG");
		Pattern credit_gamble_winfield=new Pattern("Images/Tropical_Forest/credit_gamble_winfield.PNG");

		Pattern symb_1=new Pattern("Images/Tropical_Forest/symb_1.PNG");

		screen.click(balance);
		Thread.sleep(3000);

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance_credits_1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 30,000");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_credits_1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 50");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(3000);

		//Clicking on gamble button
		screen.click(gamble);
		Thread.sleep(2000);

		//Verify the gamble win amount field
		//Verify the gamble amount field doesn't contain "SRD" and decimal values
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(Crpre_gambleamount);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("pre Gamble Win amount");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Pre Gamble win comparision: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);			  
		Thread.sleep(3000);

		//Verify the gamble to win amount field
		//Verify the gamble to amount field doesn't contain "SRD" and decimal values
		Finder finder36 =new Finder(screen.capture().getImage());
		String ht36 = finder36.find(Crpre_gambletowin);
		double score36=20;                
		System.out.println("the value of ht36"+" "+ht36);
		if(finder36.hasNext())
		{
			Match m36=finder36.next();
			System.out.println("Match Found with: "+(m36.getScore())*100+"%");
			score36=(m36.getScore())*100;
			System.out.println("pre Gamble to Win amount");
			finder36.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Pre Gamble to win comparision: "+" "+score36 +"%");
		Assert.assertTrue(score36 > 97);			  
		Thread.sleep(3000);

		//Clicking on Red button
		screen.click(black);
		Thread.sleep(900);

		//comparing the balance amount after spin
		if  (screen.exists(win) != null)
		{
			Pattern gambleStatus=new Pattern(win);
			Finder finder33 =new Finder(screen.capture().getImage());
			String ht33 = finder33.find(gambleStatus);
			double score33=20;                
			System.out.println("the value of ht33"+" "+ht33);
			if(finder33.hasNext())
			{
				Match m33=finder33.next();
				System.out.println("Match Found with: "+(m33.getScore())*100+"%");
				score33=(m33.getScore())*100;
				System.out.println("Gamble Win");
				finder33.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score33 +"%");
			Assert.assertTrue(score33 > 90);			  
			Thread.sleep(3000);

			// Verify the gamble amount is doubled after win 
			// win amount 100 and gamble amount is 50 after 1st win gamble amount is "100"
			Finder finder31 =new Finder(screen.capture().getImage());
			String ht31 = finder31.find(Crpost_gambleamount);
			double score31=20;                
			System.out.println("the value of ht3"+" "+ht31);
			if(finder31.hasNext())
			{
				Match m31=finder31.next();
				System.out.println("Match Found with: "+(m31.getScore())*100+"%");
				score31=(m31.getScore())*100;
				System.out.println("post gamble amount");
				finder31.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("post gamble amount comparision: "+" "+score31 +"%");
			Assert.assertTrue(score31 > 97);			  
			Thread.sleep(3000);

			screen.click(collect);
			Thread.sleep(3000);

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(credit_gamble_winbalance);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("Gamble Win amount added to the balance");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win added to the balance comparision: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);

			//Gamble win amount added to win field 
			Finder finder61 =new Finder(screen.capture().getImage());
			String ht61 = finder61.find(credit_gamble_winfield);
			double score61=20;                
			System.out.println("the value of ht61"+" "+ht61);
			if(finder61.hasNext())
			{
				Match m61=finder61.next();
				System.out.println("Match Found with: "+(m61.getScore())*100+"%");
				score61=(m61.getScore())*100;
				System.out.println("Gamble Win amount is displayed over win field");
				finder61.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win is displayed over win field and comparision: "+" "+score61 +"%");
			Assert.assertTrue(score61 > 97);
			Thread.sleep(2000);
		}
		else
		{
			Finder finder35 =new Finder(screen.capture().getImage());
			String ht35 = finder35.find(lose);
			double score35=20;                
			System.out.println("the value of ht35"+" "+ht35);
			if(finder35.hasNext())
			{
				Match m35=finder35.next();
				System.out.println("Match Found with: "+(m35.getScore())*100+"%");
				score35=(m35.getScore())*100;
				System.out.println("Gamble Lose.");
				finder35.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score35+"%");
			Assert.assertTrue(score35 > 90);
			Thread.sleep(4000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(credit_deductbal);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 14,980");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score1 > 97);
		}
	}

	@Then("^verify the credit form of currency in gamble page on all fields in Tropical Forest slot game$")
	public void verify_the_credit_form_of_currency_in_gamble_page_on_all_fields_in_Tropical_Forest_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Tropical Forest slot game$")
	public void gamble_credit_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Tropical_Forest_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
