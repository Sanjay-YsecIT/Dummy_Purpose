package stepDefinition_SeaPearl;

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

public class SeaPearl_Web_WildSysmbol_Triggers {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type, denomination, balance, wild symbols, all symbols spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Sea_Pearl_slot_game_bet_type_denomination_balance_wild_symbols_all_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = SeaPearl_URL_Login.getDriver();
	}

	@When("^Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild symbols appears and substitues for all other symbols expect scatter symbol and  triggers winamt\\*(\\d+) and on appear of (\\d+) wild symbols on all reels big win is triggered and win amount added to balance$")
	public void open_the_Sea_Pearl_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_symbols_appears_and_substitues_for_all_other_symbols_expect_scatter_symbol_and_triggers_winamt_and_on_appear_of_wild_symbols_on_all_reels_big_win_is_triggered_and_win_amount_added_to_balance(int arg1, int arg2) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sea_Pearl/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Sea_Pearl/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Sea_Pearl/collect.PNG");
		Pattern credit=new Pattern("./Images/Sea_Pearl/credit_0.02.PNG");
		Pattern betval=new Pattern("./Images/Sea_Pearl/betval1_1.PNG");

		// IMAGES IN 1st REEL
		Pattern horse1 =new Pattern("./Images/Sea_Pearl/1R_horse.PNG");
		Pattern nine1 =new Pattern("./Images/Sea_Pearl/1R_9.PNG");
		Pattern J1 =new Pattern("./Images/Sea_Pearl/1R_j.PNG");

		// IMAGES IN 2nd REELS
		Pattern ten2=new Pattern("./Images/Sea_Pearl/2R_10.PNG");
		Pattern scatter2=new Pattern("./Images/Sea_Pearl/2R_scatter.PNG");
		Pattern nine2=new Pattern("./Images/Sea_Pearl/2R_9.PNG");

		// IMAGES IN 3rd REELS
		Pattern A3=new Pattern("./Images/Sea_Pearl/3R_a.PNG");
		Pattern scatter3=new Pattern("./Images/Sea_Pearl/3R_scatter.PNG");
		Pattern fish3=new Pattern("./Images/Sea_Pearl/3R_fish.PNG");
		Pattern crab3=new Pattern("./Images/Sea_Pearl/3R_crab.PNG");
		Pattern Q3=new Pattern("./Images/Sea_Pearl/3R_q.PNG");

		// IMAGES IN 5TH REELS
		Pattern nine5=new Pattern("./Images/Sea_Pearl/5R_9.PNG");
		Pattern ray5=new Pattern("./Images/Sea_Pearl/5R_ray.PNG");
		Pattern k5=new Pattern("./Images/Sea_Pearl/5R_k1.PNG");
		Pattern greenfish5=new Pattern("./Images/Sea_Pearl/5R_greenfish.PNG");
		Pattern A5=new Pattern("./Images/Sea_Pearl/5R_a.PNG");
		Pattern crab5=new Pattern("./Images/Sea_Pearl/5R_crab.PNG");


		// win amount
		Pattern winamt1=new Pattern("./Images/Sea_Pearl/wildwin_2.6.PNG");
		Pattern winamt2=new Pattern("./Images/Sea_Pearl/wildwin_53.8.PNG");
		Pattern bigwin=new Pattern("./Images/Sea_Pearl/wildBigwin_203.8.PNG");

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
		screen.click(horse1);
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

		//comparing the win amount for the pattern matcing with wild symbol and winamt= patternwin*2
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(winamt1);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 2.60");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score1 > 97);

		screen.click(collect);
		Thread.sleep(1000);


		//Arrange on 3rd reels
		screen.click(A3);
		Thread.sleep(6000);
		screen.click(A3);
		Thread.sleep(6000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(fish3);
		Thread.sleep(1000);
		screen.click(crab3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		//comparing the win amount for the pattern matcing with wild symbol and winamt= patternwin*2

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(winamt2);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 53.8");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score11 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score11 > 97);


		screen.click(collect);
		Thread.sleep(1000);

		//Arrange on 5th reels
		screen.click(nine5);
		Thread.sleep(6000);
		screen.click(nine5);
		Thread.sleep(6000);
		screen.click(ray5);
		Thread.sleep(1000);
		screen.click(k5);
		Thread.sleep(1000);
		screen.click(k5);
		Thread.sleep(6000);
		screen.click(greenfish5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(crab5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		//comparing the win amount for the pattern matcing with wild symbol and winamt= patternwin*2
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(bigwin);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Comparision happened successfully and BigWin amount is 203.80 ");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score12 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score12 > 97);

		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^wild win amount with other symbol triggers win amount\\*(\\d+) and upon appearing of (\\d+) wild symbols Big Win screen should appear when five wild symbols appears on the screen in Sea Pearl game$")
	public void wild_win_amount_with_other_symbol_triggers_win_amount_and_upon_appearing_of_wild_symbols_Big_Win_screen_should_appear_when_five_wild_symbols_appears_on_the_screen_in_Sea_Pearl_game(int arg1, int arg2) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
