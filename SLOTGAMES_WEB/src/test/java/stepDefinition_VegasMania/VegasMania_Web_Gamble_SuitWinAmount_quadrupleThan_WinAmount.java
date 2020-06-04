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

public class VegasMania_Web_Gamble_SuitWinAmount_quadrupleThan_WinAmount {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_game_balance_spin_button_win_amount_Suit_win_dice_options_gamble_amount_and_suit_to_win_amount() throws Throwable {

		this.driver = VegasMania_URL_Login.getDriver();
	}

	@When("^Open the Vegas Mania game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Vegas Mania slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount$")
	public void open_the_Vegas_Mania_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Vegas_Mania_slot_game_click_on_spin_button_till_player_wins_click_on_suit_win_dice_button_and_check_the_suit_to_win_amount() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Vegas_Mania/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		//Pattern credit=new Pattern("./Images/Emerald_Dice/credit_0.01.PNG");
		Pattern spin=new Pattern("./Images/Vegas_Mania/spin.PNG");
		Pattern balance=new Pattern("./Images/Vegas_Mania/bal_300.PNG");
		Pattern win_amt = new Pattern("./Images/Vegas_Mania/winamt_0.4.PNG");
		Pattern gamble_btn=new Pattern("./Images/Vegas_Mania/gb_button.PNG");
		Pattern gb_collect=new Pattern("./Images/Vegas_Mania/gb_collect.PNG");
		Pattern gb_suitwin_amt=new Pattern("./Images/Vegas_Mania/suit_winamt_display.PNG");

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


		//comparing the Suit win amount should be 4X than as win amount
		//Pattern winB=new Pattern("E:/Sikuli Images/gamble/Gamblewin.PNG");

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(gb_suitwin_amt);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Suit Win amount comparision completed successfully. Gamble Suit Win amount is 1.60 YSI");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Suit Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(3000);

		screen.click(gb_collect);
	}

	@Then("^suit To Win amount should be quadraple than win amount in the gamble page of the Vegas Mania game$")
	public void suit_To_Win_amount_should_be_quadraple_than_win_amount_in_the_gamble_page_of_the_Vegas_Mania_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
