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

public class LadyFortune_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, bet type, denomination, balance, wild symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = LadyFortune_URL_Login.getDriver();
	}

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Lady_Fortune/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern spin=new Pattern("./Images/Lady_Fortune/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Lady_Fortune/collect.PNG");
		Pattern credit=new Pattern("./Images/Lady_Fortune/credit_0.02.PNG");
		Pattern betval=new Pattern("./Images/Lady_Fortune/betval1_1.PNG");
		Pattern BigWin=new Pattern("./Images/Lady_Fortune/BigWin_203.8.PNG");

		// IMAGES IN 1st REEL
		Pattern shoe1 =new Pattern("./Images/Lady_Fortune/1R_shoe.PNG");
		Pattern nine1 =new Pattern("./Images/Lady_Fortune/1R_9.PNG");
		Pattern J1 =new Pattern("./Images/Lady_Fortune/1R_j.PNG");

		// IMAGES IN 2nd REELS
		Pattern ten2=new Pattern("./Images/Lady_Fortune/2R_10.PNG");
		Pattern scatter2=new Pattern("./Images/Lady_Fortune/2R_scatter.PNG");
		Pattern nine2=new Pattern("./Images/Lady_Fortune/2R_9.PNG");

		// IMAGES IN 3rd REELS
		Pattern A3=new Pattern("./Images/Lady_Fortune/3R_a.PNG");
		Pattern scatter3=new Pattern("./Images/Lady_Fortune/3R_scatter.PNG");
		Pattern leaf3=new Pattern("./Images/Lady_Fortune/3R_leaf.PNG");
		Pattern bug3=new Pattern("./Images/Lady_Fortune/3R_bug.PNG");
		Pattern Q3=new Pattern("./Images/Lady_Fortune/3R_q.PNG");

		// IMAGES IN 5TH REELS
		Pattern nine5=new Pattern("./Images/Lady_Fortune/5R_9.PNG");
		Pattern k5=new Pattern("./Images/Lady_Fortune/5R_feather1.PNG");
		Pattern feather5=new Pattern("./Images/Lady_Fortune/5R_k1.PNG");
		Pattern coin5=new Pattern("./Images/Lady_Fortune/5R_coin.PNG");
		Pattern A5=new Pattern("./Images/Lady_Fortune/5R_a.PNG");
		Pattern bug5=new Pattern("./Images/Lady_Fortune/5R_bug.PNG");



		//comparing the credit value should be 0.02
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97); 

		//Arranging the symbols for wild symbol to appear on screen
		// Arrange on 1st reels
		screen.click(betval);
		Thread.sleep(1000);
		screen.click(J1);
		Thread.sleep(1000);
		screen.click(nine1);
		Thread.sleep(1000);
		screen.click(shoe1);
		Thread.sleep(1000);


		//Arrange on 2nd reels
		screen.click(ten2);
		Thread.sleep(6000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(scatter2);
		Thread.sleep(1000);
		screen.click(nine2);
		Thread.sleep(1000);
		screen.click(nine2);
		Thread.sleep(1000);
		screen.click(nine2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		//Arrange on 3rd reels
		screen.click(A3);
		Thread.sleep(6000);
		screen.click(A3);
		Thread.sleep(6000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(leaf3);
		Thread.sleep(1000);
		screen.click(bug3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);

		//Arrange on 5th reels
		screen.click(nine5);
		Thread.sleep(6000);
		screen.click(nine5);
		Thread.sleep(6000);
		screen.click(feather5);
		Thread.sleep(1000);
		screen.click(k5);
		Thread.sleep(1000);
		screen.click(k5);
		Thread.sleep(6000);
		screen.click(coin5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(bug5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		// Big win window
		screen.wait(BigWin, 10);
		Thread.sleep(1000);

		//comparing the win amount for the pattern matcing with wild symbol and winamt= patternwin*2
		// big win triggers by 5 wild symbols
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(BigWin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 203.8");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score13 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score13 > 97);

		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^Big Win screen should appear when five wild symbols appears on the screen in Lady Fortune game$")
	public void big_Win_screen_should_appear_when_five_wild_symbols_appears_on_the_screen_in_Lady_Fortune_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
