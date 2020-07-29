package stepDefinition_SapphireHeart;

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

public class SapphireHeart_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type, denomination, balance, wild symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver =SapphireHeart_URL_Login.getDriver();
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sapphire_Heart/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Sapphire_Heart/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Sapphire_Heart/collect.PNG");

		// IMAGES IN 1st REELS
		Pattern K1=new Pattern("./Images/Sapphire_Heart/1R_k.PNG");
		Pattern diamond1=new Pattern("./Images/Sapphire_Heart/1R_diamond.PNG");
		Pattern purple1=new Pattern("./Images/Sapphire_Heart/1R_purple.PNG");


		// IMAGES IN 2nd REELS
		Pattern Q2=new Pattern("./Images/Sapphire_Heart/2R_q.PNG");
		Pattern yellow2=new Pattern("./Images/Sapphire_Heart/2R_yellow.PNG");
		Pattern A2=new Pattern("./Images/Sapphire_Heart/2R_a.PNG");
		Pattern diamond2=new Pattern("./Images/Sapphire_Heart/2R_diamond.PNG");
		Pattern lady2=new Pattern("./Images/Sapphire_Heart/2R_lady.PNG");
		Pattern green2=new Pattern("./Images/Sapphire_Heart/2R_green.PNG");
		Pattern K2=new Pattern("./Images/Sapphire_Heart/2R_k.PNG");
		Pattern IMG2=new Pattern("./Images/Sapphire_Heart/2R_img.PNG");
		Pattern purple2=new Pattern("./Images/Sapphire_Heart/2R_purple.PNG");

		// IMAGES IN 3rd REELS
		Pattern yellow3=new Pattern("./Images/Sapphire_Heart/3R_yellow.PNG");
		Pattern A3=new Pattern("./Images/Sapphire_Heart/3R_a.PNG");
		Pattern diamond3=new Pattern("./Images/Sapphire_Heart/3R_diamond.PNG");
		Pattern lady3=new Pattern("./Images/Sapphire_Heart/3R_lady.PNG");
		Pattern Q3=new Pattern("./Images/Sapphire_Heart/3R_q.PNG");
		Pattern K3=new Pattern("./Images/Sapphire_Heart/3R_k.PNG");
		Pattern IMG3=new Pattern("./Images/Sapphire_Heart/3R_img.PNG");
		Pattern purple3=new Pattern("./Images/Sapphire_Heart/3R_purple.PNG");
		Pattern men3=new Pattern("./Images/Sapphire_Heart/3R_men.PNG");
		Pattern J3=new Pattern("./Images/Sapphire_Heart/3R_j.PNG");

		// IMAGES IN 4th REELS
		Pattern yellow4=new Pattern("./Images/Sapphire_Heart/4R_yellow.PNG");
		Pattern A4=new Pattern("./Images/Sapphire_Heart/4R_a.PNG");
		Pattern diamond4=new Pattern("./Images/Sapphire_Heart/4R_diamond.PNG");
		Pattern men4=new Pattern("./Images/Sapphire_Heart/4R_men.PNG");
		Pattern Q4=new Pattern("./Images/Sapphire_Heart/4R_q.PNG");
		Pattern K4=new Pattern("./Images/Sapphire_Heart/4R_k.PNG");
		Pattern IMG4=new Pattern("./Images/Sapphire_Heart/4R_img.PNG");
		Pattern purple4=new Pattern("./Images/Sapphire_Heart/4R_purple.PNG");
		Pattern J4=new Pattern("./Images/Sapphire_Heart/4R_j.PNG");
		Pattern green4=new Pattern("./Images/Sapphire_Heart/4R_green.PNG");

		// IMAGES IN 5th REELS
		Pattern yellow5=new Pattern("./Images/Sapphire_Heart/5R_yellow.PNG");
		Pattern A5=new Pattern("./Images/Sapphire_Heart/5R_a.PNG");
		Pattern diamond5=new Pattern("./Images/Sapphire_Heart/5R_diamond.PNG");
		Pattern men5=new Pattern("./Images/Sapphire_Heart/5R_men.PNG");
		Pattern purple5=new Pattern("./Images/Sapphire_Heart5R_purple.PNG");
		Pattern J5=new Pattern("./Images/Sapphire_Heart/5R_j.PNG");
		Pattern lady5=new Pattern("./Images/Sapphire_Heart/5R_lady.PNG");
		Pattern Q5=new Pattern("./Images/Sapphire_Heart/5R_q.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("./Images/Sapphire_Heart/BigWin_295.41.PNG");

		// Arrange symbols on 1st REELS
		screen.click(purple1);
		Thread.sleep(1000);
		screen.click(diamond1);
		Thread.sleep(1000);
		screen.click(K1);
		Thread.sleep(1000);

		// Arrange symbols on 2nd REELS
		screen.click(yellow2);
		Thread.sleep(1000);
		screen.click(A2);
		Thread.sleep(1000);
		screen.click(purple2);
		Thread.sleep(1000);
		screen.click(Q2);
		Thread.sleep(1000);
		screen.click(lady2);
		Thread.sleep(1000);
		screen.click(green2);
		Thread.sleep(1000);
		screen.click(K2);
		Thread.sleep(1000);
		screen.click(IMG2);
		Thread.sleep(1000);
		screen.click(yellow2);
		Thread.sleep(1000);
		screen.click(A2);
		Thread.sleep(1000);
		screen.click(diamond2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(K3);
		Thread.sleep(1000);
		screen.click(lady3);
		Thread.sleep(1000);
		screen.click(J3);
		Thread.sleep(1000);
		screen.click(diamond3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(purple3);
		Thread.sleep(1000);
		screen.click(K3);
		Thread.sleep(1000);
		screen.click(IMG3);
		Thread.sleep(1000);
		screen.click(yellow3);
		Thread.sleep(1000);
		screen.click(A3);
		Thread.sleep(1000);
		screen.click(K3);
		Thread.sleep(1000);
		screen.click(men3);
		Thread.sleep(1000);
		screen.click(yellow3);
		Thread.sleep(1000);
		screen.click(J3);
		Thread.sleep(1000);
		screen.click(IMG3);
		Thread.sleep(1000);
		screen.click(purple3);
		Thread.sleep(1000);

		// Arrange symbols on 4th REELS
		screen.click(green4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(Q4);
		Thread.sleep(1000);
		screen.click(yellow4);
		Thread.sleep(1000);
		screen.click(men4);
		Thread.sleep(1000);
		screen.click(diamond4);
		Thread.sleep(1000);
		screen.click(J4);
		Thread.sleep(1000);
		screen.click(green4);
		Thread.sleep(1000);
		screen.click(IMG4);
		Thread.sleep(1000);
		screen.click(purple4);
		Thread.sleep(1000);
		screen.click(J4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(green4);
		Thread.sleep(1000);
		screen.click(purple4);
		Thread.sleep(1000);
		screen.click(men4);
		Thread.sleep(1000);
		screen.click(J4);
		Thread.sleep(1000);
		screen.click(K4);
		Thread.sleep(1000);
		screen.click(purple4);
		Thread.sleep(1000);
		screen.click(diamond4);
		Thread.sleep(1000);
		screen.click(yellow4);
		Thread.sleep(1000);
		screen.click(green4);
		Thread.sleep(1000);
		
		// Arrange symbols on 5th REELS
		screen.click(yellow5);
		Thread.sleep(1000);
		screen.click(A5);
		Thread.sleep(1000);
		screen.click(Q5);
		Thread.sleep(1000);
		screen.click(diamond5);
		Thread.sleep(1000);
		screen.click(men5);
		Thread.sleep(1000);
		screen.click(J5);
		Thread.sleep(1000);
		screen.click(lady5);
		Thread.sleep(1000);
		screen.click(purple5);
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
			System.out.println("Comparision happened successfully and win amount is 295.41");
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

	@Then("^Big Win screen should appear when five wild symbols appears on the screen in Sapphire Heart game$")
	public void big_Win_screen_should_appear_when_five_wild_symbols_appears_on_the_screen_in_Sapphire_Heart_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
