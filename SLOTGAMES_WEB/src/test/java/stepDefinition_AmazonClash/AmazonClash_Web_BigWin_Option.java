package stepDefinition_AmazonClash;

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

public class AmazonClash_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, bet type, denomination, balance, wild symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the wild appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_wild_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Amazon_Clash/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Amazon_Clash/spin.PNG"); 
		Pattern collect =new Pattern("Images/Amazon_Clash/collect.PNG");
		Pattern balance=new Pattern("Images/Amazon_Clash/bal_300.PNG");
		Pattern BalanceAfter=new Pattern("Images/Amazon_Clash/BW_bal_afterwin.PNG");
		Pattern BigWin=new Pattern("Images/Amazon_Clash/BigWin_200.PNG");
		Pattern win_amt=new Pattern("Images/Amazon_Clash/BW_win_amt.PNG");

		// IMAGES IN 1st REELS
		Pattern tiger1=new Pattern("Images/Amazon_Clash/1R_tiger.PNG");
		Pattern blue1=new Pattern("Images/Amazon_Clash/1R_blue.PNG");

		// IMAGES IN 2nd REELS
		Pattern leaf2=new Pattern("Images/Amazon_Clash/2R_leaf.PNG");

		// IMAGES IN 3rd REELS
		Pattern scatter3=new Pattern("Images/Amazon_Clash/3R_str.PNG");
		Pattern clove3=new Pattern("Images/Amazon_Clash/3R_clove.PNG");
		Pattern lady31=new Pattern("Images/Amazon_Clash/3R_lady1.PNG");
		Pattern lady32=new Pattern("Images/Amazon_Clash/3R_lady2.PNG");
		Pattern leaf3=new Pattern("Images/Amazon_Clash/3R_leafs.PNG");

		// IMAGES IN 4th REELS
		Pattern lady41=new Pattern("Images/Amazon_Clash/4R_lady1.PNG");
		Pattern lady42=new Pattern("Images/Amazon_Clash/4R_lady2.PNG");
		Pattern leaf4=new Pattern("Images/Amazon_Clash/4R_leaf.PNG");

		// IMAGES IN 5th REELS
		Pattern blue5=new Pattern("Images/Amazon_Clash/5R_blue1.PNG");
		Pattern lady51=new Pattern("Images/Amazon_Clash/5R_lady11.PNG");
		Pattern lady52=new Pattern("Images/Amazon_Clash/5R_lady21.PNG");
		Pattern heart5=new Pattern("Images/Amazon_Clash/5R_heart1.PNG");

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

		// Arrange the symbols to generate the wild symbols on all the reels
		// Arrange 1st Reels
		screen.click(tiger1);
		Thread.sleep(1000);
		screen.click(blue1);
		Thread.sleep(1000);
		screen.click(blue1);
		Thread.sleep(1000);

		// Arrange 2nd Reels
		screen.click(leaf2);
		Thread.sleep(1000);

		// Arrange 3rd Reels
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(clove3);
		Thread.sleep(1000);
		screen.click(clove3);
		Thread.sleep(1000);
		screen.click(lady31);
		Thread.sleep(1000);
		screen.click(lady32);
		Thread.sleep(1000);
		screen.click(leaf3);
		Thread.sleep(1000);
		screen.click(clove3);
		Thread.sleep(1000);

		// Arrange 4th Reels
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(lady41);
		Thread.sleep(1000);
		screen.click(lady42);
		Thread.sleep(1000);

		// Arrange 5th Reels
		screen.click(blue5);
		Thread.sleep(1000);
		screen.click(lady51);
		Thread.sleep(1000);
		screen.click(lady52);
		Thread.sleep(1000);
		screen.click(heart5);
		Thread.sleep(1000);
		screen.click(heart5);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(4000);

		// Big Win  Screen pop-up
		screen.wait(BigWin, 10);
		Thread.sleep(4000);

		//Comparing the win amount after the big win
		Thread.sleep(4000);
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
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(BalanceAfter);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);
	}

	@Then("^Big Win screen should appear when five wild symbols appears on the screen in Amazon Clash game$")
	public void big_Win_screen_should_appear_when_five_wild_symbols_appears_on_the_screen_in_Amazon_Clash_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
