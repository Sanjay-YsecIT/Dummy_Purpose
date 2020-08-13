package stepDefinition_GoldenCrown;

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

public class GoldenCrown_Web_BigWin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, bet type, denomination, balance, scatter-dollar symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_bet_type_denomination_balance_scatter_dollar_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter-dollar appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_dollar_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Golden_Crown/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Golden_Crown/spin.PNG"); 
		Pattern collect =new Pattern("Images/Golden_Crown/collect.PNG");
		Pattern win1 =new Pattern("Images/Golden_Crown/scatterdollar1.PNG");
		Pattern win2 =new Pattern("Images/Golden_Crown/scatterdollar2.PNG");

		// IMAGES IN 1st REELS
		Pattern lemon1=new Pattern("Images/Golden_Crown/1R_lemon.PNG");
		Pattern melon1=new Pattern("Images/Golden_Crown/1R_melon.PNG");
		Pattern berry1=new Pattern("Images/Golden_Crown/1R_berry.PNG");
		Pattern bell1=new Pattern("Images/Golden_Crown/1R_bell.PNG");
		Pattern orange1=new Pattern("Images/Golden_Crown/1R_orange.PNG");
		Pattern cherry1=new Pattern("Images/Golden_Crown/1R_cherry.PNG");
		Pattern grape1=new Pattern("Images/Golden_Crown/1R_grape.PNG");

		// IMAGES IN 2nd REELS
		Pattern berry2=new Pattern("Images/Golden_Crown/2R_berry.PNG");

		// IMAGES IN 3rd REELS
		Pattern orange3=new Pattern("Images/Golden_Crown/3R_orange.PNG");
		Pattern lemon3=new Pattern("Images/Golden_Crown/3R_lemon.PNG");
		Pattern bell3=new Pattern("Images/Golden_Crown/3R_bell.PNG");
		Pattern star3=new Pattern("Images/Golden_Crown/3R_star.PNG");
		Pattern cherry3=new Pattern("Images/Golden_Crown/3R_cherry.PNG");

		// IMAGES IN 4th REELS
		Pattern berry4=new Pattern("Images/Golden_Crown/4R_berry.PNG");
		Pattern orange4=new Pattern("Images/Golden_Crown/4R_orange.PNG");
		Pattern cherry4=new Pattern("Images/Golden_Crown/4R_cherry.PNG");
		Pattern bell4=new Pattern("Images/Golden_Crown/4R_bell.PNG");
		Pattern grape4=new Pattern("Images/Golden_Crown/4R_grape.PNG");
		Pattern lemon4=new Pattern("Images/Golden_Crown/4R_lemon.PNG");

		// IMAGES IN 5th REELS
		Pattern orange5=new Pattern("Images/Golden_Crown/5R_orange.PNG");
		Pattern cherry5=new Pattern("Images/Golden_Crown/5R_cherry.PNG");
		Pattern bell5=new Pattern("Images/Golden_Crown/5R_bell.PNG");
		Pattern grape5=new Pattern("Images/Golden_Crown/5R_grape.PNG");
		Pattern lemon5=new Pattern("Images/Golden_Crown/5R_lemon.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("Images/Golden_Crown/BigWin.PNG");

		// Arrange symbols on 1st REELS
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(melon1);
		Thread.sleep(1000);
		screen.click(melon1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);

		// Arrange symbols on 2nd REELS
		screen.click(berry2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(star3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);

		//Comparing the scatter-dollar win triggered once appears on screen
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(win1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 3 scatter-dollar, win has to be triggered and win amount is 5 YSI."+"Big win not triggered");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed and big win triggered. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 74);
		Thread.sleep(3000);
		screen.click(collect);
		Thread.sleep(1000);

		// Arrange symbols on 4th REELS
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(berry4);
		Thread.sleep(1000);
		screen.click(berry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(grape4);
		Thread.sleep(1000);
		screen.click(grape4);
		Thread.sleep(1000);
		screen.click(grape4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);

		//Comparing the scatter-dollar win triggered once appears on screen
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win2);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("On appearance of 4 scatter-dollar, win has to be triggered and win amount is 20 YSI."+"Big win not triggered");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("win amount comparision: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 74);
		Thread.sleep(3000);
		
		screen.click(collect);
		Thread.sleep(1000);

		// Arrange symbols on 5th REELS
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(grape5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);

		// Big win window
		screen.wait(BigWin, 10);
		Thread.sleep(1000);

		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(BigWin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 200 ");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score13 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score13 > 90);
		Thread.sleep(2000);
		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^Big Win screen should appear when five scatter-dollar symbols appears on the screen in Golden Crown game$")
	public void big_Win_screen_should_appear_when_five_scatter_dollar_symbols_appears_on_the_screen_in_Golden_Crown_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
