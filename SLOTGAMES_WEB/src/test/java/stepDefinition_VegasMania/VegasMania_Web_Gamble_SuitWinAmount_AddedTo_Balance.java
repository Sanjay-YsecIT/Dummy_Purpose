package stepDefinition_VegasMania;

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

public class VegasMania_Web_Gamble_SuitWinAmount_AddedTo_Balance {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_balance_spin_button_win_amount_gamble_button_card_to_click_for_suit_win_and_suit_win_amount() throws Throwable {

		this.driver = VegasMania_URL_Login.getDriver();		
	}

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_click_on_suit_win_card_in_gamble_page() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Vegas_Mania/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		//	Pattern credit=new Pattern("./Images/Vegas_Mania/credit_0.01.PNG");
		Pattern balance=new Pattern("./Images/Vegas_Mania/bal_300.PNG");
		Pattern spin=new Pattern("./Images/Vegas_Mania/spin.PNG");
		Pattern win_amt = new Pattern("./Images/Vegas_Mania/winamt_0.4.PNG");
		Pattern gb_collect=new Pattern("./Images/Vegas_Mania/gb_collect.PNG");
		Pattern gamble_btn=new Pattern("./Images/Vegas_Mania/gb_button.PNG");
		Pattern suit_heart=new Pattern("./Images/Vegas_Mania/suit_heart.PNG");
		Pattern gb_win=new Pattern("./Images/Vegas_Mania/gb_win.PNG");
		Pattern gb_lose=new Pattern("./Images/Vegas_Mania/gb_loose.PNG");
		Pattern win_bal=new Pattern("./Images/Vegas_Mania/suit_winamt_add.PNG");
		Pattern lose_bal=new Pattern("./Images/Vegas_Mania/Reminingbal_299.90.PNG");

		// win symbols
		Pattern cherry=new Pattern("./Images/Vegas_Mania/2R_cherry.PNG");


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
		screen.click(cherry);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(2000);


		//comparing the win amount should exists after spin
		//   Pattern winA=new Pattern("E:/Sikuli Images/gamble/win.PNG");

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_amt);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.40 YSI");
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
		screen.click(gamble_btn);
		Thread.sleep(2000);

		//Clicking on Red button
		screen.click(suit_heart);
		Thread.sleep(2000);

		//comparing the balance amount after spin

		if  (screen.exists(gb_win) != null)
		{
			Pattern gambleStatus=new Pattern(gb_win);
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(gambleStatus);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Win");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 97);			  
			Thread.sleep(3000);

			screen.click(gb_collect);
			Thread.sleep(4000);

			//  Pattern bal=new Pattern("E:/Sikuli Images/gamble/balance_afterWin.PNG");

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(win_bal);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("Gamble Suit Win amount added to the balance");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble Suit win added to the balance comparision: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);
		}
		else
		{
			// Pattern gambleStatus=new Pattern("E:/Sikuli Images/gamble/lose.PNG");
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(gb_lose);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Lose.");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 80);
			Thread.sleep(4000);

			//  Pattern Abalance=new Pattern("E:/Sikuli Images/gamble/balance_afterLose.PNG");

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(lose_bal);
			double score11=20;                
			System.out.println("the value of ht11"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.90 YSI");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
		}
	}

	@Then("^Suit Win amount\\((\\d+)X\\) should get added to the main balance after win else it should not get added to main balance in the Vegas Mania slot game$")
	public void suit_Win_amount_X_should_get_added_to_the_main_balance_after_win_else_it_should_not_get_added_to_main_balance_in_the_Vegas_Mania_slot_game(int arg1) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
