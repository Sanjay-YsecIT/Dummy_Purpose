package stepDefinition_LadyFortune;

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

public class LadyFortune_Web_WinPattern_Combinations_Matching_PayLinesAndRules {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, bet type, denomination, balance, available symbols, spin button, win pattern combinations and line Combinations win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_bet_type_denomination_balance_available_symbols_spin_button_win_pattern_combinations_and_line_Combinations_win_amount() throws Throwable {

		this.driver = LadyFortune_URL_Login.getDriver();
	}

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till reels win appears on the screen and respective win combination lines with win amount appear on the goodluck frame$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_reels_win_appears_on_the_screen_and_respective_win_combination_lines_with_win_amount_appear_on_the_goodluck_frame() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Lady_Fortune/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern spin=new Pattern("./Images/Lady_Fortune/spin.PNG");
		Pattern betval=new Pattern("./Images/Lady_Fortune/betval1_1.PNG");
		Pattern collect = new Pattern("./Images/Lady_Fortune/collect.PNG");


		Pattern win_pattern=new Pattern("./Images/Lady_Fortune/payline_win_pattern.PNG");
		Pattern win1=new Pattern("./Images/Lady_Fortune/pattern_win1.PNG");
		Pattern win2=new Pattern("./Images/Lady_Fortune/pattern_win2.PNG");
		Pattern win3=new Pattern("./Images/Lady_Fortune/pattern_win3.PNG");
		Pattern win4=new Pattern("./Images/Lady_Fortune/pattern_win4.PNG");


		// IMAGES IN 2nd REELS
		Pattern ten2=new Pattern("./Images/Lady_Fortune/2R_10.PNG");
		Pattern scatter2=new Pattern("./Images/Lady_Fortune/2R_scatter.PNG");


		// SET THE BET TYPE AS 0.02 AND DENOMIANTION AS 0.2
		// AS AT INITIAL STAGE IT WILL BE SET DEFAULT
		screen.click(betval);
		Thread.sleep(1000);

		//Arranging the symbols to generate gamble count as 5
		//Arranging the Second Reel
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(scatter2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(2000);

		//	 win pattern combination with win amount
		screen.wait(win1, 5);
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.04");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 95);

		//	 win pattern combination with win amount
		screen.wait(win2, 5);
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(win2);
		double score22=20;                
		System.out.println("the value of ht2"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.04");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 95);


		//	 win pattern combination with win amount
		screen.wait(win3, 5);
		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(win3);
		double score23=20;                
		System.out.println("the value of ht23"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.04");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score23+"%");
		Assert.assertTrue(score23 > 95);



		//	 win pattern combination with win amount
		screen.wait(win4, 5);
		Finder finder24 =new Finder(screen.capture().getImage());
		String ht24 = finder24.find(win4);
		double score24=20;                
		System.out.println("the value of ht24"+" "+ht24);
		if(finder24.hasNext())
		{
			Match m24=finder24.next();
			System.out.println("Match Found with: "+(m24.getScore())*100+"%");
			score24=(m24.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.04");
			finder24.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score24 +"%");
		Assert.assertTrue(score24 > 95);

		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win patterns for the above pattern wins
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(win_pattern);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("win symbols for the above pattern matching.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Pattern comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Win pattern should highlight on the symbols and according to win patterns, line combinations with win amount should display for each pattern wins on the goodluck frame of Lady Fortune slot game$")
	public void win_pattern_should_highlight_on_the_symbols_and_according_to_win_patterns_line_combinations_with_win_amount_should_display_for_each_pattern_wins_on_the_goodluck_frame_of_Lady_Fortune_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
