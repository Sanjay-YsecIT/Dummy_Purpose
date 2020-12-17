package stepDefinition_PerfectGems;

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

public class PerfectGems_Web_BigWin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, dollar scatter symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_dollar_scatter_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the (\\d+) dollar scatter symbol appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_dollar_scatter_symbol_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);

		Pattern spin=new Pattern("Images/Perfect_Gems/spin.PNG");                         
		Pattern take=new Pattern("Images/Perfect_Gems/take.PNG");            
		Pattern balance=new Pattern("Images/Perfect_Gems/balance.PNG");
		Pattern bigwinwin_bal1=new Pattern("Images/Perfect_Gems/bigwinwin_bal1.PNG");
		Pattern bigwinwin_bal2=new Pattern("Images/Perfect_Gems/bigwinwin_bal2.PNG");

		Pattern BigWin=new Pattern("Images/Perfect_Gems/BigWin.PNG");
		Pattern TreasureBox1=new Pattern("Images/Perfect_Gems/TreasureBox1.PNG");
		Pattern win_amt=new Pattern("Images/Perfect_Gems/BW_amt.PNG");

		Pattern bigwinsymb_1_1=new Pattern("Images/Perfect_Gems/bigwinsymb_1_1.PNG");
		Pattern bigwinsymb_1_2=new Pattern("Images/Perfect_Gems/bigwinsymb_1_2.PNG");
		Pattern bigwinsymb_1_3=new Pattern("Images/Perfect_Gems/bigwinsymb_1_3.PNG");
		Pattern bigwinsymb_1_4=new Pattern("Images/Perfect_Gems/bigwinsymb_1_4.PNG");
		Pattern bigwinsymb_1_5=new Pattern("Images/Perfect_Gems/bigwinsymb_1_5.PNG");
		Pattern bigwinsymb_1_6=new Pattern("Images/Perfect_Gems/bigwinsymb_1_6.PNG");
		Pattern bigwinsymb_1_7=new Pattern("Images/Perfect_Gems/bigwinsymb_1_7.PNG");

		Pattern bigwinsymb_2_1=new Pattern("Images/Perfect_Gems/bigwinsymb_2_1.PNG");

		Pattern bigwinsymb_3_1=new Pattern("Images/Perfect_Gems/bigwinsymb_3_1.PNG");
		Pattern bigwinsymb_3_2=new Pattern("Images/Perfect_Gems/bigwinsymb_3_2.PNG");
		Pattern bigwinsymb_3_3=new Pattern("Images/Perfect_Gems/bigwinsymb_3_3.PNG");
		Pattern bigwinsymb_3_4=new Pattern("Images/Perfect_Gems/bigwinsymb_3_4.PNG");
		Pattern bigwinsymb_3_5=new Pattern("Images/Perfect_Gems/bigwinsymb_3_5.PNG");
		Pattern bigwinsymb_3_6=new Pattern("Images/Perfect_Gems/bigwinsymb_3_6.PNG");
		Pattern bigwinsymb_3_7=new Pattern("Images/Perfect_Gems/bigwinsymb_3_7.PNG");
		Pattern bigwinsymb_3_8=new Pattern("Images/Perfect_Gems/bigwinsymb_3_8.PNG");

		Pattern bigwinsymb_4_1=new Pattern("Images/Perfect_Gems/bigwinsymb_4_1.PNG");
		Pattern bigwinsymb_4_2=new Pattern("Images/Perfect_Gems/bigwinsymb_4_2.PNG");
		Pattern bigwinsymb_4_3=new Pattern("Images/Perfect_Gems/bigwinsymb_4_3.PNG");
		Pattern bigwinsymb_4_4=new Pattern("Images/Perfect_Gems/bigwinsymb_4_4.PNG");
		Pattern bigwinsymb_4_5=new Pattern("Images/Perfect_Gems/bigwinsymb_4_5.PNG");
		Pattern bigwinsymb_4_6=new Pattern("Images/Perfect_Gems/bigwinsymb_4_6.PNG");

		Pattern symb_6_1=new Pattern("Images/Perfect_Gems/symb_6_1.PNG");
		Pattern symb_6_2=new Pattern("Images/Perfect_Gems/symb_6_2.PNG");
		Pattern symb_6_3=new Pattern("Images/Perfect_Gems/symb_6_3.PNG");
		Pattern symb_6_4=new Pattern("Images/Perfect_Gems/symb_6_4.PNG");
		Pattern symb_6_5=new Pattern("Images/Perfect_Gems/symb_6_5.PNG");
		Pattern symb_6_8=new Pattern("Images/Perfect_Gems/symb_6_8.PNG");

		//comparing the balance before spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		//Arranging the symbols to generate bigwin
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);

		screen.click(bigwinsymb_2_1);
		Thread.sleep(1000);

		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_8);
		Thread.sleep(1000);

		screen.click(bigwinsymb_4_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_4_6);
		Thread.sleep(1000);

		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);

		// Big Win  Screen pop-up
		//screen.wait(BigWin, 10);
		screen.exists(BigWin, 10);
		Thread.sleep(8000);
		screen.exists(TreasureBox1, 10);
		Thread.sleep(2000);
		screen.click(TreasureBox1);
		Thread.sleep(10000);

		//Comparing the win amount after the big win
		screen.wait(win_amt, 10);
		Thread.sleep(2000);
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win_amt);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		//clicking on collect button
		screen.click(take);
		Thread.sleep(3000);
	}

	@Then("^Big Win screen should appear when five dollar scatter symbols appears on the screen in Perfect Gems slot game$")
	public void big_Win_screen_should_appear_when_five_dollar_scatter_symbols_appears_on_the_screen_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
