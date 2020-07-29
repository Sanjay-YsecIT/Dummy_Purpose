package stepDefinition_GoldenHot;

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

public class GoldenHot_Web_MultiplierFeature_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Hot slot game, bet type, denomination, balance, available symbols, spin button, double win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Hot_slot_game_bet_type_denomination_balance_available_symbols_spin_button_double_win_window_and_win_amount() throws Throwable {

		this.driver = GoldenHot_URL_Login.getDriver();
	}

	@When("^Open the Golden Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till symbols like \\(berry, bell, orange, cherry and lemon\\) appear on all reels and double win amount window appears and win amount added to main balance$")
	public void open_the_Golden_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_symbols_like_berry_bell_orange_cherry_and_lemon_appear_on_all_reels_and_double_win_amount_window_appears_and_win_amount_added_to_main_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Golden_Hot/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Golden_Hot/spin.PNG");                                
		Pattern betval=new Pattern("./Images/Golden_Hot/betval1_1.PNG");
		Pattern bet1=new Pattern("./Images/Golden_Hot/bet1.PNG");
		Pattern collect =new Pattern("./Images/Golden_Hot/collect.PNG");

		// IMAGES IN 1st REELS
		Pattern orange1=new Pattern("./Images/Golden_Hot/1R_orange.PNG");
		Pattern cherry1=new Pattern("./Images/Golden_Hot/1R_cherry.PNG");
		Pattern star1=new Pattern("./Images/Golden_Hot/1R_star.PNG");
		Pattern bell1=new Pattern("./Images/Golden_Hot/1R_bell.PNG");

		// IMAGES IN 3rd REELS
		Pattern bell3=new Pattern("./Images/Golden_Hot/3R_bell.PNG");

		// Congrulation and Win window pop-up 
		Pattern Multiplier =new Pattern("./Images/Golden_Hot/Multiplier_12.PNG");

		// SET THE BET TYPE AS 0.03 AND DENOMIANTION AS 0.15
		// AS AT INITIAL STAGE IT WILL BE SET DEFAULT
		screen.click(bet1);
		Thread.sleep(3000);
		screen.click(betval);
		Thread.sleep(3000);

		//	Arrange the symbols for multiplier option	
		//	1st Reels symbols
		screen.click(cherry1);
		Thread.sleep(2000);
		screen.click(cherry1);
		Thread.sleep(2000);
		screen.click(cherry1);
		Thread.sleep(2000);
		screen.click(star1);
		Thread.sleep(2000);
		screen.click(orange1);
		Thread.sleep(2000);
		screen.click(orange1);
		Thread.sleep(2000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);

		// 3rd Reels symbols
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(4000);

		// Multiplier win window
		screen.wait(Multiplier, 10);
		Thread.sleep(1000);

		// big win triggers by 5 seven symbols
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(Multiplier);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 12 ");
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

	@Then("^Multiplier feature should enabled and Double Win\\((\\d+)X\\) screen should appear when same symbols appears on all the reels in Golden Hot slot game$")
	public void multiplier_feature_should_enabled_and_Double_Win_X_screen_should_appear_when_same_symbols_appears_on_all_the_reels_in_Golden_Hot_slot_game(int arg1) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
