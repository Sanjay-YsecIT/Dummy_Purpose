package stepDefinition_AmazonClash;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonClash_Web_Gamble_WinAmount_SameAs_GambleAmount {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {

		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount_on_web() throws Throwable {

		//Pattern credit=new Pattern("./Images/Emerald_Dice/credit_0.01.PNG");
		Pattern betval=new Pattern("./Images/Amazon_Clash/betval1_1.PNG");
		Pattern spin=new Pattern("./Images/Amazon_Clash/spin.PNG");
		Pattern balance=new Pattern("./Images/Amazon_Clash/bal_300.PNG");
		Pattern win_amt = new Pattern("./Images/Amazon_Clash/winamt_0.6.PNG");
		Pattern gamble_btn=new Pattern("./Images/Amazon_Clash/gb_button.PNG");
		Pattern gb_collect=new Pattern("./Images/Amazon_Clash/gb_collect.PNG");
		Pattern gb_amt_display=new Pattern("/Images/Amazon_Clash/gb_amt.PNG");

		// win symbols
		Pattern scatter=new Pattern("./Images/Amazon_Clash/3R_scatter.PNG");
		Pattern tiger=new Pattern("./Images/Amazon_Clash/1R_tiger.PNG");


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
		screen.click(betval);
		Thread.sleep(2000);
		screen.click(scatter);
		Thread.sleep(2000);
		screen.click(scatter);
		Thread.sleep(2000);
		screen.click(scatter);
		Thread.sleep(2000);
		screen.click(tiger);
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
			System.out.println("Win amount comparision completed successfully. Win amount is 0.60 YSI");
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


		//comparing the Gamble win amount should be same as win amount
		//Pattern winB=new Pattern("E:/Sikuli Images/gamble/Gamblewin.PNG");

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(gb_amt_display);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 0.60 YSI");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(3000);

		screen.click(gb_collect);
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Amazon Clash slot game on web$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Amazon_Clash_slot_game_on_web() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
