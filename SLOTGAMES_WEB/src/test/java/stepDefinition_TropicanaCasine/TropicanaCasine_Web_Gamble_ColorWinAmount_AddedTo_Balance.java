package stepDefinition_TropicanaCasine;

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

public class TropicanaCasine_Web_Gamble_ColorWinAmount_AddedTo_Balance {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^chrome browser, valid URL, valid login details, Tropicana Casine slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_black_button_black_button_and_gamble_status() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_gamble_button_and_check_the_balance_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");
		Pattern balance=new Pattern("Images/Tropicana_Casine/balance.PNG");
		Pattern win_1 = new Pattern("Images/Tropicana_Casine/win_1.PNG");            
		Pattern gamble=new Pattern("Images/Tropicana_Casine/gamble.PNG"); 
		Pattern collect=new Pattern("Images/Tropicana_Casine/collect.PNG");

		Pattern red=new Pattern("Images/Tropicana_Casine/red.PNG");
		Pattern black=new Pattern("Images/Tropicana_Casine/black.PNG");
		Pattern win=new Pattern("Images/Tropicana_Casine/win.PNG");
		Pattern lose=new Pattern("Images/Tropicana_Casine/lose.PNG");
		Pattern balance_gamble_win=new Pattern("Images/Tropicana_Casine/balance_gamble_win.PNG");
		Pattern balance_gamble_lose=new Pattern("Images/Tropicana_Casine/balance1_1.PNG");
		Pattern gamble_win=new Pattern("Images/Tropicana_Casine/gamble_win.PNG");

		Pattern pre_gambleamount=new Pattern("/Images/Tropicana_Casine/pre_gambleamount.PNG");
		Pattern post_gambleamount=new Pattern("/Images/Tropicana_Casine/post_gambleamount.PNG");

		Pattern symb_1_1=new Pattern("Images/Tropicana_Casine/symb_1_1.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 SRD");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 1.60 SRD");
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
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(pre_gambleamount);
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

		// Verify the font of black and red button 
		Finder finder35 =new Finder(screen.capture().getImage());
		String ht35 = finder35.find(black);
		double score35=20;                
		System.out.println("the value of ht35"+" "+ht35);
		if(finder35.hasNext())
		{
			Match m35=finder35.next();
			System.out.println("Match Found with: "+(m35.getScore())*100+"%");
			score35=(m35.getScore())*100;
			System.out.println("Black button font verification");
			finder35.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Black button comparision: "+" "+score35 +"%");
		Assert.assertTrue(score35 > 97);			  
		Thread.sleep(2000);

		Finder finder36 =new Finder(screen.capture().getImage());
		String ht36 = finder36.find(red);
		double score36=20;                
		System.out.println("the value of ht36"+" "+ht36);
		if(finder36.hasNext())
		{
			Match m36=finder36.next();
			System.out.println("Match Found with: "+(m36.getScore())*100+"%");
			score36=(m36.getScore())*100;
			System.out.println("red button font verification");
			finder36.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Red button comparision: "+" "+score36 +"%");
		Assert.assertTrue(score36 > 97);			  
		Thread.sleep(2000);

		Finder finder37 =new Finder(screen.capture().getImage());
		String ht37 = finder37.find(collect);
		double score37=20;                
		System.out.println("the value of ht37"+" "+ht37);
		if(finder37.hasNext())
		{
			Match m37=finder37.next();
			System.out.println("Match Found with: "+(m37.getScore())*100+"%");
			score37=(m37.getScore())*100;
			System.out.println("collect button font verification");
			finder37.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("collect button comparision: "+" "+score37 +"%");
		Assert.assertTrue(score37 > 97);			  
		Thread.sleep(2000);

		//Clicking on black button
		screen.click(black);
		Thread.sleep(800);

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
			// win amount 0.3 and gamble to win amount is 0.6
			//after 1st win gamble amount is "0.60 SRD"
			Finder finder31 =new Finder(screen.capture().getImage());
			String ht31 = finder31.find(post_gambleamount);
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

			screen.click(collect);
			Thread.sleep(3000);

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(balance_gamble_win);
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
			String ht61 = finder61.find(gamble_win);
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
			Finder finder38 =new Finder(screen.capture().getImage());
			String ht38 = finder38.find(lose);
			double score38=20;                
			System.out.println("the value of ht38"+" "+ht38);
			if(finder38.hasNext())
			{
				Match m38=finder38.next();
				System.out.println("Match Found with: "+(m38.getScore())*100+"%");
				score38=(m38.getScore())*100;
				System.out.println("Gamble Lose.");
				finder38.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score38+"%");
			Assert.assertTrue(score38 > 90);
			Thread.sleep(4000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(balance_gamble_lose);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.80 SRD");
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

	@Then("^Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Tropicana Casine slot game$")
	public void gamble_double_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^After (\\d+)st win gamble amount is doubled and available for next gamble in Tropicana Casine slot game$")
	public void after_st_win_gamble_amount_is_doubled_and_available_for_next_gamble_in_Tropicana_Casine_slot_game(int arg1) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
