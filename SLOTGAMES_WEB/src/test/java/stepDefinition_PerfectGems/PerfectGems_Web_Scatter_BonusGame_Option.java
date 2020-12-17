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

public class PerfectGems_Web_Scatter_BonusGame_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, scatter symbols, spin button, bonus game banner, bonus game screen and bonus win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_bonus_game_banner_bonus_game_screen_and_bonus_win_amount() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than three scatter symbols appears on the screen wins and bonus game activates, bonus game treasure boxes and treasure amount amount added to balance$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_or_more_than_three_scatter_symbols_appears_on_the_screen_wins_and_bonus_game_activates_bonus_game_treasure_boxes_and_treasure_amount_amount_added_to_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);

		Pattern spin=new Pattern("Images/Perfect_Gems/spin.PNG");                         
		Pattern collect=new Pattern("Images/Perfect_Gems/collect.PNG");            
		Pattern gamble=new Pattern("Images/Perfect_Gems/gamble.PNG");
		Pattern take=new Pattern("Images/Perfect_Gems/take.PNG");

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

		// congratulations and Win window pop-up and free spin left 
		Pattern bonusgamebanner =new Pattern("Images/Perfect_Gems/bonusgamebanner.PNG"); 
		Pattern bonusgametext =new Pattern("Images/Perfect_Gems/bonusgametext.PNG");
		Pattern TreasureBox1=new Pattern("Images/Perfect_Gems/TreasureBox1.PNG");
		Pattern TreasureBox2=new Pattern("Images/Perfect_Gems/TreasureBox2.PNG");
		Pattern TreasureBox3=new Pattern("Images/Perfect_Gems/TreasureBox3.PNG");
		Pattern bonusgame_winbanner =new Pattern("Images/Perfect_Gems/bonusgame_winbanner.PNG");
		Pattern bonusgame_win1 =new Pattern("Images/Perfect_Gems/bonusgame_win1.PNG");
		Pattern bonusgame_win2 =new Pattern("Images/Perfect_Gems/bonusgame_win2.PNG");
		Pattern bonusgame_win3 =new Pattern("Images/Perfect_Gems/bonusgame_win3.PNG");

		//Arranging the symbols to generate 3 Scatter
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
		screen.click(spin);
		Thread.sleep(2000);

		// Bonus Game banner
		screen.wait(bonusgamebanner, 10);
		Thread.sleep(4000);

		// verify the bonus game text on screen 
		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(bonusgametext);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("Verify the bonus game screen, as bonus game text is verified on the screen.");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 97);
		Thread.sleep(2000);

		//Click on the Treasure Box to unlock the treasure amount
		screen.click(TreasureBox1);
		Thread.sleep(3000);

		//wheel spin win banner
		screen.exists(bonusgame_winbanner, 10);
		Thread.sleep(7000);

		//compare the win amount after the wheel spin
		screen.wait(bonusgame_win1, 10);
		Thread.sleep(4000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(bonusgame_win1);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);

		//Redirect to gamble page and collect the amount from gamble page
		screen.click(gamble);
		Thread.sleep(3000);
		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate 4 Scatter
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
		screen.click(spin);
		Thread.sleep(3000);

		// Bonus Game banner
		screen.wait(bonusgamebanner, 10);
		Thread.sleep(4000);

		//Click on the Treasure Box to unlock the treasure amount
		screen.click(TreasureBox2);
		Thread.sleep(3000);

		//wheel spin win banner
		screen.exists(bonusgame_winbanner, 10);
		Thread.sleep(7000);

		//compare the win amount after the wheel spin
		screen.wait(bonusgame_win2, 10);
		Thread.sleep(4000);
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(bonusgame_win2);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);

		screen.click(take);
		Thread.sleep(2000);

		//Arranging the symbols to generate 5 Scatter
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

		// Bonus Game banner
		screen.wait(bonusgamebanner, 20);
		Thread.sleep(4000);

		//Click on the Treasure Box to unlock the treasure amount
		screen.wait(TreasureBox3, 10);
		screen.click(TreasureBox3);
		Thread.sleep(3000);

		//wheel spin win banner
		screen.exists(bonusgame_winbanner, 10);
		Thread.sleep(7000);

		//compare the win amount after the wheel spin
		screen.wait(bonusgame_win3, 30);
		Thread.sleep(4000);
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(bonusgame_win3);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
		Thread.sleep(2000);

		screen.click(take);
		Thread.sleep(2000);
	}

	@Then("^Bonus Game screen should appear when Three or more scatter symbols appears on the screen in Perfect Gems game$")
	public void bonus_Game_screen_should_appear_when_Three_or_more_scatter_symbols_appears_on_the_screen_in_Perfect_Gems_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
